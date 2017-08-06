import java.util.ArrayList;
import java.util.List;

public class test2 {
    public static void main(String[] args) {

        // Boolean matrix definitions

        int A[][] = new int[][]
                       {{1, 1, 1},
                        {0, 1, 0},
                        {1, 0, 0}};

        int B[][] = new int[][]
                       {{0, 0, 1},
                        {1, 0, 1},
                        {0, 1, 0}};

        int C[][] = new int[][]
                       {{1, 0, 1},
                        {0, 1, 0},
                        {1, 1, 0}};

        int W[][] = new int[][]
                       {{1, 0, 1, 0},
                        {1, 0, 0, 1},
                        {0, 0, 0, 1},
                        {0, 1, 0, 0}};

        int T[][] = new int[][]
                       {{0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 0, 0, 0},
                        {1, 0, 0, 0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 0, 0, 0, 1},
                        {0, 1, 0, 1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0}};

        int M[][] = new int[][]
                       {{1, 0, 1, 0, 0},
                        {1, 1, 0, 1, 1},
                        {0, 0, 0, 0, 0},
                        {0, 1, 1, 0, 0},
                        {1, 0, 0, 1, 1}};





        BMat M1, M2,T1,W1,A1,A2,A3,A4,B1,C1,C2,C3,C4,D1,D2;


        BMat BMA = new BMat(A);
        BMat BMB = new BMat(B);
        BMat BMC = new BMat(C);
        BMat BMW = new BMat(W);
        BMat BMT = new BMat(T);
        BMat BMM = new BMat(M);




     //Question 11
        System.out.println("BMM before");
        BMM.show();
        M1=BMM.complement();
        System.out.println("BMM after complement");
        M1.show();
        System.out.println("Trace of complement "+M1.trace());

        M2=BMM.sclosure();
        System.out.println("Symetric Closure of M2");
        M2.show();
      //Question 10

        System.out.println("Tree T");
        T1=BMT;
        T1.show();
        System.out.println(T1.rootnode());

        //Question 9
        W1= BMW;
        System.out.println("W1 before");
        W1.show();


        W1.tclosure();

        System.out.println("W1 after");
        W1.show();

        //Qustion7

        A1=BMA;
        B1=BMB;
        C1=BMC;

        D1=C1.meet(B1);
        System.out.println("C and B");
        D1.show();
        D2=D1.join(A1);
        System.out.println("Question 7 A");
        D2.show();

        //Part B

        A2=BMA.transpose();
        System.out.println("Bool Product");
        A2.show();

        A3=BMA;
        A4=A3.product(A2);
        System.out.println("Bool Product");
        A4.show();

        //Part C
System.out.println("C^3");
        C2=BMC.power(3);
        C2.show();

        long n = 5;
        long x = 3;
        System.out.println(Permutations(n, x, n-x, n));
        System.out.println(Permutations1(n, x));
        System.out.println(PermutationsT(5,3));
    }


    static long Permutations(long N, long X, long temp, long p) {
        N--;
        if (N > temp) {
            p = Permutations(N, X, temp, p*=N);
        }
        return p;
    }



    public static double Permutations1(long N, long X)
    {




        if(X>1){

            return Permutations1(N,X-1)*(N-X);

        }


        return N;
    }


    public static double PermutationsT(long N, long X)
    {
        double perm = 1.0;

        for (int x=0;x<X;x++){
            perm = perm*(double)(N-x);
        }
        return perm;
    }


}
