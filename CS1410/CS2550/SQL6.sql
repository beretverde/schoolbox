--CS 2550 Fall 2017
--Tyler Jacox
--SQL Assignment #6

--1
SELECT e.student_id
FROM enrollment e, section s
WHERE s.section_id = e.section_id
      AND s.course_no BETWEEN 100 AND 199
GROUP BY e.student_id
HAVING COUNT(*) =
       (SELECT MAX(num_enrolled)
        FROM
          (SELECT
             e.student_id,
             COUNT(*) AS num_enrolled
           FROM section s, enrollment e
           WHERE s.section_id = e.section_id
                 AND s.course_no BETWEEN 100 AND 199
           GROUP BY e.student_id
           ORDER BY COUNT(*)));

--2
SELECT
  g.student_id,
  s.last_name,
  s.first_name
FROM grade g, enrollment e, student s, section sec
WHERE g.student_id = g.student_id
      AND g.student_id = s.student_id
      AND g.section_id = sec.section_id
      AND g.grade_type_code = 'FI'
      AND sec.course_no = 230
      AND sec.section_id = 100
      AND g.numeric_grade =
          (SELECT MAX(maxGrade)
           FROM
             (SELECT g.numeric_grade AS maxGrade
              FROM grade g, enrollment e, student s, section sec
              WHERE g.student_id = g.student_id
                    AND g.student_id = s.student_id
                    AND g.section_id = sec.section_id
                    AND g.grade_type_code = 'FI'
                    AND sec.course_no = 230
                    AND sec.section_id = 100))
GROUP BY g.student_id, s.first_name, s.last_name;

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
  s.last_name,
  g.numeric_grade
FROM grade g, enrollment e, student s, section sec
WHERE g.student_id = g.student_id
      AND g.student_id = s.student_id
      AND g.section_id = sec.section_id
      AND g.grade_type_code = 'FI'
      AND sec.section_id = 154
      AND g.numeric_grade >
          (SELECT AVG(avgGrade)
           FROM
             (SELECT g.numeric_grade AS avgGrade
              FROM grade g, enrollment e, student s, section sec
              WHERE g.student_id = g.student_id
                    AND g.student_id = s.student_id
                    AND g.section_id = sec.section_id
                    AND g.grade_type_code = 'FI'
                    AND sec.section_id = 154))
GROUP BY s.last_name, g.numeric_grade
ORDER BY s.last_name;

--5

SELECT
  C.COURSE_NO,
  C.DESCRIPTION
FROM section s
  JOIN ENROLLMENT e
    ON s.section_id = e.section_id
  JOIN course c
    ON c.course_no = s.course_no
GROUP BY c.COURSE_NO, c.DESCRIPTION
HAVING count(*) = (SELECT MAX(num)
                   FROM (SELECT
                           c.COURSE_NO,
                           c.DESCRIPTION,
                           count(*) AS num
                         FROM section s
                           JOIN ENROLLMENT E
                             ON s.section_id = e.section_id
                           JOIN course c
                             ON c.course_no = s.course_no
                         GROUP BY c.COURSE_NO, c.DESCRIPTION))
ORDER BY c.COURSE_NO;

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
  s.first_name,
  s.last_name,
  s.phone
FROM student s
  JOIN enrollment e
    ON e.student_id = s.student_id
WHERE s.student_id IN (SELECT student_id
                         FROM enrollment e
                           JOIN section sec
                             ON e.section_id = sec.section_id
                         WHERE sec.section_id IN (SELECT section_id
                                                  FROM section sec
                                                  JOIN course c
                                                    ON sec.course_no = c.course_no
                                                WHERE sec.course_no IN (SELECT course_no
                                                                        FROM course
                                                                      WHERE description = 'Project Management')))
      AND s.student_id IN (SELECT student_id
                             FROM enrollment e
                               JOIN section sec
                                 ON e.section_id = sec.section_id
                             WHERE sec.section_id IN (SELECT section_id
                                                    FROM section sec
                                                      JOIN course c
                                                        ON sec.course_no = c.course_no
                                                    WHERE sec.course_no IN (SELECT course_no
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
                              HAVING count(*) = (SELECT MAX(counter)
                                                 FROM (SELECT
                                                         s.instructor_id,
                                                         COUNT(*) AS counter
                                                       FROM section s
                                                         JOIN course c
                                                           ON s.course_no = c.course_no
                                                       WHERE c.description LIKE '%Java%'
                                                       GROUP BY s.instructor_id)))
ORDER BY i.FIRST_NAME, c.DESCRIPTION;

--10 .....rabbit hole of complexity

SELECT DISTINCT
  e.student_id,
  s.last_name,
  g.numeric_grade

FROM enrollment e, student s, grade g
WHERE e.student_id = s.student_id
      AND e.student_id = g.student_id
      AND e.section_id = 143
      AND g.GRADE_TYPE_CODE='FI'
GROUP BY e.student_id, s.last_name, g.numeric_grade
ORDER BY e.student_id;

-- Attempts at #10
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


SELECT *
  FROM GRADE
WHERE SECTION_ID=143;

SELECT *
  FROM GRADE_TYPE_WEIGHT
WHERE SECTION_ID=143;

SELECT s.LAST_NAME,e.STUDENT_ID,g.NUMERIC_GRADE
  FROM STUDENT s, ENROLLMENT e, GRADE g
    JOIN ENROLLMENT e
    ON e.STUDENT_ID=s.STUDENT_ID
WHERE e.SECTION_ID=143;


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

