// Program Proj2A.java
// Function: f is the truth value of a logical proposition.
import java.io.*;

public class Proj2A
{
    public static void main(String args[])
    {

//for(long x=10000000;x<=1000000000;x++){
//
//    if(KNumber(x)) {
//        System.out.print("x: " + x + " = " + KNumber(x) + "\n");
//    }
//}

        if(args.length >= 1){
            x = Integer.parseInt(args[0]);
            System.out.println("\n Input value       x = " + x);
            if (x >= 1){
                // Sum-of squares algorithm
                y1 = f1(x);
                System.out.println(" Sum-of-squares   y1 = " + y1);
                // Divide-last algorithm
                y2 = f2(x);
                System.out.println(" Divide-last      y2 = " + y2);
                // Divide-early algorithm
                y3 = f3(x);
                System.out.println(" Divide-early     y3 = " + y3);
            }
        }
    }

    private static char LProp(char p, char q, char r)
    {
       // Logical expression
        char f1='F';
        char f2='F';

        f1 = ANDlogic(ANDlogic(NOTlogic(q),NOTlogic(p)),r);

        f2 =NOTlogic(ORlogic(r,NOTlogic(p)));

       return ORlogic(f1,f2);
    }

    private static char ANDlogic(char p, char q)
    {
        // Logical AND function
        char f = 'F';
        if(p == 'T' && q == 'T')
            f = 'T';
        return f;
    }

    private static char ORlogic(char p, char q)
    {
       // Logical OR function
        char f = 'F';
        if(p == 'T' | q == 'T')
            f = 'T';
        return f;

    }

    private static char NOTlogic(char p)
   {
       char f='F';
        if(p == 'F') {
            f = 'T';
        }
        return f;


   }

   private static int LCircuit(int A, int B, int C, int D){
     int t1= ANDlogic(NOTlogic(B),C);
     int t2=ANDlogic(NOTlogic(B),A);
     int t3=ANDlogic(NOTlogic(A),B);
     int t4=ANDlogic(t3,NOTlogic(C));
     int t5=ANDlogic(B,D);
     int t6=ANDlogic(t5,NOTlogic(C));

     int t7=ORlogic(t1,t2);
     int t8=ORlogic(t4,t6);
     return ORlogic(t7,t8);

   }


    private static int ANDlogic(int p, int q)
    {
        // Logical AND function
        int f = 0;
        if(p == 1 && q == 1) {
            f = 1;
        }
        return f;
    }

    private static int ORlogic(int p, int q)
    {
        // Logical OR function
        int f = 0;
        if(p == 1 | q == 1)
            f = 1;
        return f;

    }

    private static int NOTlogic(int p)
    {
        char f=0;
        if(p == 0) {
            f = 1;
        }
        return f;


    }

    private static boolean OddInt(long X){

      if(X%2==0) {
          return false;
      }
      return true;
    }


    private static boolean SquareInt(long X){

    double sqrt = Math.sqrt(X);
    int y = (int) sqrt;
    if(Math.pow(sqrt,2) == Math.pow(y,2)) {
        return true;
    }
    return false;
}

    private static boolean SymmetricInt(long X){

        long p = X;
        long r = 0;

        // Compute the reverse
        while (p != 0) {
            long rem = p % 10;
            r = r * 10 + rem;
            p = p / 10;
        }

        return X == r;


    }

    private static boolean KNumber(Long X){

      return OddInt(X)&&SquareInt(X)&&SymmetricInt(X);
    }



} // end class

