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
        BMat A1, A2, A3,A4,A5,B1,B2,B3,B4,B5,C1,D1,D2,D3,D4,D5,D6,F1,E1,E2,E3,E4,E5,E6,E7,E8,E9,E10,E11,E12,E13,E14,E15,E16,E17,E18,E19,G1,G2,H1,H2,I1,J1;



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

        E1=BMD;

        E2=BMD;
        E3=BMD;
        E4=E2.product(E3);

        E5=BMD;
        E6=BMD;
        E7=E5.product(E6);
        E8=BMD;
        E9=E7.product(E8);
        E10=BMD;
        E11=BMD;
        E12=E10.product(E11);
        E13=BMD;
        E14=E12.product(E13);
        E15=BMD;
        E16=E15.product(E14);
        E17=E1.join(E4);
        E18=E17.join(E9);
        E19=E18.join(E16);
        System.out.println("e. W = ʘD1 or ʘD2 or ʘD3 or ʘD4");
        E19.show();


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
        I1.show();
        System.out.println("Root node of I1: "+I1.rootnode());
        System.out.println("Indegree node "+I1.rootnode()+" of I1: "+I1.indegree(I1.rootnode()));


        System.out.println("S(arrows/edges) = v(nodes/vertices)-1 S=v-1="+I1.arrows()+"="+(I1.SIZE-1));
        I1.tclosure();
        System.out.println("Trace after a tclosure: "+I1.trace());
        I1.show();

        //j. Show that matrix G does not represent a tree.

        System.out.println("J1");
        J1=BMG;
        J1.show();
        System.out.println("Root node of J1: "+J1.rootnode());
        System.out.println("Indegree node "+J1.rootnode()+" of J1: "+J1.indegree(J1.rootnode()));

        System.out.println("S(arrows/edges) = v(nodes/vertices)-1 S=v-1="+J1.arrows()+"="+(J1.SIZE-1));
        J1.tclosure();
        System.out.println("Trace after a tclosure: "+J1.trace());

        J1.show();


    } // end main

} // end class
