import java.util.ArrayList;
import java.util.List;

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
        BMat A1, A2, A3,A4,A5,B1,B2,B3,B4,B5,C1,D1,D2,D3,D4,D5,D6,F1,G1,G2,H1,H2,I1,J1;



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

        //b. (B.transpose boolProduct B) and (C or C.transpose)

        B1=BMB.transpose();
        B2=BMC.transpose();
        B3=B1.product(BMB);
        B4=BMC.join(B2);
        B5=B3.meet(B4);
        System.out.println("(B.transpose boolProduct B) and (C or C.transpose)");
        B5.show();

        //c.  W = ʘC18 = C ʘ C ʘ ... ʘ C (18 C's)


        C1=BMC.product(BMC);
        System.out.println("Boolean Product Iteration# 1");
        C1.show();

        for(int x=1; x<=17;x++){
                C1=BMC.product(C1);
            System.out.println("Boolean Product Iteration# "+(x+1));
            C1.show();
        }

        //d. W = (D or E).transpose and (D.transpose or E.transpose)

        D1=BMD.join(BME);
        D2=D1.transpose();
        D3=BMD.transpose();
        D4=BME.transpose();
        D5=D3.join(D4);
        D6=D2.meet(D5);
        System.out.println("W = (D or E).transpose and (D.transpose or E.transpose)");
        D6.show();

        //e. W = ʘD1 or ʘD2 or ʘD3 or ʘD4

        //f. X = maximum out-degree of all nodes in D

        F1=BMD;

        int counter =0;

        List<Integer> nodes = new ArrayList<>();

        for(int r=0;r<F1.SIZE;r++){
            nodes.add(F1.outdegree(r));
            if(F1.outdegree(r)>counter){
                counter=F1.outdegree(r);
            }
        }
        System.out.println("Maximum outdegree of D: "+counter);


        //g. W = symmetric closure of D. Is D symmetric?
        System.out.println("D before changes");
        BMD.show();
        G1=BMD.sclosure();
        System.out.println("Symetric Closure of D:");
        G1.show();

        G2 = G1.transpose();
        System.out.println("Transpose of G1:");
        G2.show();

        System.out.println("Is D and the Symmetric Closure of D equal: "+G1.isEqual(G2));

        //h. W= transitive closure of E. Is E transitive? Mr isequal((Mr product Mr) or Mr)

        H1=BME.product(BME);
        H2=H1.join(BME);
        System.out.println("E is transitive: "+BME.isEqual(H2));

        //i. Show that matrix F represents a tree (has a candidate root node and has no cycles).

        I1= BMF;

        System.out.println("Root node of I1: "+I1.rootnode());


        //j. Show that matrix G does not represent a tree.

        J1=BMG;

        System.out.println("Root node of J1: "+J1.rootnode());


    } // end main

} // end class
