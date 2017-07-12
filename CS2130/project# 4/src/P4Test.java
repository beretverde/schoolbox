// Project #4 test program
public class P4Test
{
    public static void main(String[] args)
    {
        // Boolean matrix definitions

        int A[][] = new int[][]
                {{1, 1, 0, 0, 1},
                        {1, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {0, 0, 1, 0, 1}};

        int B[][] = new int[][]
                {{0, 1, 0, 0, 1},
                        {0, 1, 1, 0, 0},
                        {1, 0, 1, 0, 0},
                        {1, 0, 0, 0, 0},
                        {0, 1, 0, 0, 1}};

        int C[][] = new int[][]
                {{0, 1, 0, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 0, 1, 0},
                        {1, 0, 0, 0, 1},
                        {0, 1, 0, 0, 0}};

        int D[][] = new int[][]
                {{1, 1, 0, 0, 0, 0},
                        {1, 1, 1, 0, 0, 0},
                        {0, 1, 1, 1, 0, 0},
                        {0, 0, 1, 1, 0, 0},
                        {0, 0, 0, 0, 0, 1},
                        {0, 0, 0, 0, 1, 1}};

        int E[][] = new int[][]
                {{0, 1, 1, 0, 0, 1},
                        {0, 1, 1, 0, 0, 1},
                        {0, 0, 1, 0, 0, 1},
                        {0, 0, 0, 0, 1, 1},
                        {0, 0, 0, 1, 1, 1},
                        {0, 0, 0, 0, 0, 0}};

        int F[][] = new int[][]
                {{0, 0, 0, 0, 1, 0, 1, 0, 0},
                        {1, 0, 0, 1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 0, 0, 0, 1, 1},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0}};

        int G[][] = new int[][]
                {{0, 0, 0, 1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 0, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0, 0, 1, 0, 1},
                        {0, 0, 0, 0, 0, 0, 0, 1, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0}};
        BMat A1, A2, A3,A4,A5,B1,B2,B3,B4,B5;



        BMat BMA = new BMat(A);
        BMat BMB = new BMat(B);
        BMat BMC = new BMat(C);
        BMat BMD = new BMat(D);
        BMat BME = new BMat(E);
        BMat BMF = new BMat(F);
        BMat BMG = new BMat(G);

        // Put code here...

        //a.	W = (C' and (A or B)) and B'    (M' = complement of M)




        A1=BMC.complement();
        A2=BMA.join(BMB);
        A3=BMB.complement();
        A4=A1.meet(A2);
        A5=A4.meet(A3);
        System.out.println("W = (C' and (A or B)) and B");
        A5.show();

        //b. (B^T boolProduct B) and (C or C^T)

      






    } // end main

} // end class
