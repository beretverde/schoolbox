--CS 2550 Fall 2017
--Tyler Jacox
--SQL Assignment #6

--1
SELECT x.student_id
FROM enrollment x, section y
WHERE y.section_id = x.section_id
      AND y.course_no BETWEEN 100 AND 199
GROUP BY x.student_id
HAVING COUNT(*) =
       (SELECT MAX(num_enrolled)
        FROM
          (SELECT
             x.student_id,
             COUNT(*) AS num_enrolled
           FROM section y, enrollment x
           WHERE y.section_id = x.section_id
                 AND y.course_no BETWEEN 100 AND 199
           GROUP BY x.student_id
           ORDER BY COUNT(*)));

--2
SELECT
  x.student_id,
  z.last_name,
  z.first_name
FROM grade x, enrollment y, student z, section zz
WHERE x.student_id = x.student_id
      AND x.student_id = z.student_id
      AND x.section_id = zz.section_id
      AND x.grade_type_code = 'FI'
      AND zz.course_no = 230
      AND zz.section_id = 100
      AND x.numeric_grade =
          (SELECT MAX(maxGrade)
           FROM
             (SELECT x.numeric_grade AS maxGrade
              FROM grade x, enrollment y, student z, section zz
              WHERE x.student_id = x.student_id
                    AND x.student_id = z.student_id
                    AND x.section_id = zz.section_id
                    AND x.grade_type_code = 'FI'
                    AND zz.course_no = 230
                    AND zz.section_id = 100))
GROUP BY x.student_id, z.first_name, z.last_name;

--3
SELECT
  salutation,
  first_name,
  last_name,
  zip
FROM instructor
WHERE instructor_id NOT IN
      (SELECT instructor_id
       FROM section)
ORDER BY last_name;

--4
SELECT
  z.last_name,
  x.numeric_grade
FROM grade x, enrollment y, student z, section zz
WHERE x.student_id = x.student_id
      AND x.student_id = z.student_id
      AND x.section_id = zz.section_id
      AND x.grade_type_code = 'FI'
      AND zz.section_id = 154
      AND x.numeric_grade >
          (SELECT AVG(avgGrade)
           FROM
             (SELECT x.numeric_grade AS avgGrade
              FROM grade x, enrollment y, student z, section zz
              WHERE x.student_id = x.student_id
                    AND x.student_id = z.student_id
                    AND x.section_id = zz.section_id
                    AND x.grade_type_code = 'FI'
                    AND zz.section_id = 154))
GROUP BY z.last_name, x.numeric_grade
ORDER BY z.last_name;

--5

SELECT
  C.COURSE_NO,
  C.DESCRIPTION
FROM section s
  JOIN ENROLLMENT E
    ON s.section_id = e.section_id
  JOIN course c
    ON c.course_no = s.course_no
GROUP BY C.COURSE_NO, C.DESCRIPTION
HAVING count(*) = (SELECT MAX(num)
                   FROM (SELECT
                           C.COURSE_NO,
                           C.DESCRIPTION,
                           count(*) AS num
                         FROM section s
                           JOIN ENROLLMENT E
                             ON s.section_id = e.section_id
                           JOIN course c
                             ON c.course_no = s.course_no
                         GROUP BY C.COURSE_NO, C.DESCRIPTION))
ORDER BY C.COURSE_NO;

--6

SELECT
  c.course_no,
  description
FROM course c
WHERE c.course_no IN (SELECT s.course_no
                      FROM section s
                      WHERE to_char(start_date_time, 'HH:MI') = '10:30')
ORDER BY c.course_no;

--7

SELECT
  s.section_id,
  std.last_name
FROM section s
  JOIN grade g
    ON s.section_id = g.section_id
  JOIN student std
    ON g.student_id = std.student_id
WHERE s.section_id = 135
      AND g.grade_type_code = 'QZ' AND g.grade_code_occurrence = 3
      AND g.numeric_grade < (SELECT AVG(g.numeric_grade)
                             FROM section s
                               JOIN grade g
                                 ON s.section_id = g.section_id
                             WHERE s.section_id = 135
                                   AND g.grade_type_code = 'QZ' AND g.grade_code_occurrence = 3);

--8
SELECT DISTINCT
  std.first_name,
  std.last_name,
  std.phone
FROM student std
  JOIN enrollment e
    ON e.student_id = std.student_id
WHERE std.student_id IN (SELECT student_id
                         FROM enrollment e
                           JOIN section s
                             ON e.section_id = s.section_id
                         WHERE s.section_id IN (SELECT section_id
                                                FROM section s
                                                  JOIN course c
                                                    ON s.course_no = c.course_no
                                                WHERE s.course_no IN (SELECT course_no
                                                                      FROM course
                                                                      WHERE description = 'Project Management')))
      AND std.student_id IN (SELECT student_id
                             FROM enrollment e
                               JOIN section s
                                 ON e.section_id = s.section_id
                             WHERE s.section_id IN (SELECT section_id
                                                    FROM section s
                                                      JOIN course c
                                                        ON s.course_no = c.course_no
                                                    WHERE s.course_no IN (SELECT course_no
                                                                          FROM course
                                                                          WHERE description = 'Systems Analysis')));

--9

SELECT
  i.first_name,
  i.last_name,
  c.course_no,
  c.description
FROM instructor i
  JOIN section s
    ON i.instructor_id = s.instructor_id
  JOIN course c
    ON s.course_no = c.course_no
WHERE c.description LIKE '%Java%'
      AND i.instructor_id IN (SELECT s.instructor_id
                              FROM section s
                                JOIN course c
                                  ON s.course_no = c.course_no
                              WHERE c.description LIKE '%Java%'
                              GROUP BY s.instructor_id
                              HAVING count(*) = (SELECT MAX(num)
                                                 FROM (SELECT
                                                         s.instructor_id,
                                                         COUNT(*) AS num
                                                       FROM section s
                                                         JOIN course c
                                                           ON s.course_no = c.course_no
                                                       WHERE c.description LIKE '%Java%'
                                                       GROUP BY s.instructor_id)))
ORDER BY i.FIRST_NAME, c.DESCRIPTION;
-- 10

SELECT DISTINCT
  s.student_id,
  s.last_name
FROM student s
  JOIN Grade g
    ON s.student_id = g.student_id
  JOIN section se
    ON se.section_id = g.section_id
WHERE se.section_id = 143 AND g.grade_type_code = 'FI'
      AND g.numeric_grade > (SELECT AVG(g.numeric_grade)
                             FROM section s
                               JOIN grade g
                                 ON s.section_id = g.section_id
                             WHERE s.section_id = 143
                                   AND g.grade_type_code = 'FI');

--10 missing averages

SELECT
  x.student_id,
  y.last_name,
  z.numeric_grade
FROM enrollment x, student y, grade z
WHERE x.student_id = y.student_id
      AND x.student_id = z.student_id
      AND x.section_id = 143

GROUP BY x.student_id, y.last_name, z.numeric_grade
ORDER BY x.student_id;

-- Test
SELECT DISTINCT s.student_id, s.last_name
FROM student s JOIN Grade g
ON s.student_id = g.student_id
JOIN section se
ON se.section_id = g.section_id
WHERE se.section_id = 143 AND g.grade_type_code = 'FI'
AND g.numeric_grade > (SELECT AVG(g.numeric_grade)
            FROM section s JOIN grade g
            ON s.section_id = g.section_id
            WHERE s.section_id = 143
            AND g.grade_type_code = 'FI');

SELECT s.student_id, s.last_name
FROM grade g JOIN enrollment e
ON g.student_id = e.student_id
AND g.section_id = e.section_id
JOIN student s
ON e.student_id = s.student_id
WHERE g.numeric_Grade > (
  SELECT AVG(numeric_grade)
  FROM grade
  WHERE section_id = 143
  AND grade_type_code LIKE 'FI')
AND g.section_id = 143
AND g.grade_type_code = 'FI'
ORDER BY s.last_name;


SELECT STUDENT_ID
  FROM GRADE
WHERE SECTION_ID=143;

SELECT *
  FROM GRADE_TYPE_WEIGHT
WHERE SECTION_ID=143;




