import java.util.ArrayList;

// Program to calculate the sum of the divisors
// of a positive integer.
public class P1PartB1
{
    public static void main(String args[])
    {

//        long X, Y;
//        if(args.length >= 1){
//            X = Long.parseLong(args[0]);
//            if(X >= 1){
//                Y = SumOfDivisors(X);
//                System.out.println("\n X = " + X + "     Y = " + Y);
//            }
//        }

//
//        System.out.println(ReverseDigits(45600));
//        System.out.println(ReverseDigits(62826));
//        System.out.println(ReverseDigits(157910));
//        System.out.println(ReverseDigits(483047));
//        System.out.println(ReverseDigits(901108));

//        System.out.println(GCD(136,120));
//        System.out.println(GCD(512,2217));
//        System.out.println(GCD(1595,4255));
//        System.out.println(GCD(18684,49878));
//        System.out.println(GCD(237732,819918));
//
//        System.out.println("BaseB Tests: ");
//        System.out.println(BaseB(359,2));
//        System.out.println(BaseB(632,3));
//        System.out.println(BaseB(757,5));
//        System.out.println(BaseB(981,8));
//        System.out.println(BaseB(8046,10));

        long y=100;
        for(long x=1; x<51;x++){

            System.out.println(x+": "+y+"="+RecursiveSeq(x));

        }


//        System.out.println("Test Seq "+RecursiveSeq(2));
//        System.out.println("nthTerm: "+NthTerm(2));
//
//        System.out.println("Test Seq "+RecursiveSeq(10));
//        System.out.println("nthTerm: "+NthTerm(10));
//
//
//        System.out.println("Test Seq "+RecursiveSeq(24));
//        System.out.println("nthTerm: "+NthTerm(24));
//
//        System.out.println("Test Seq "+RecursiveSeq(33));
//
//        System.out.println("nthTerm: "+NthTerm(33));
//
//        System.out.println("Test Seq "+RecursiveSeq(40));
//
//        System.out.println("nthTerm: "+NthTerm(40));



        return;
    }

    public static long SumOfDivisors(long x)
    {
        long y = 0;

        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0) {

                y+=i;
            }
        }

        y+=x;
        return y;
    }

    public static long ReverseDigits(long x)
    {
        long y = 0;
        for(int i = (int) x; i !=0; i /= 10) {
            y = y * 10 + i % 10;
        }
        return y;
    }

    public static long GCD(long X1, long X2)
    {
        X1 = (X1 < 0) ? -X1 : X1;
        X2 = (X2 < 0) ? -X2 : X2;

        while (X1 > 0)
        {
            if (X1 < X2)
            {
                long temp = X1;
                X1 = X2;
                X2 = temp;
            }
            X1 -= X2;
        }
        return X2;
    }

    public static long BaseB(long X,long B ) {
        ArrayList<Long> result = new ArrayList<>();
        long Y =0;
        long place=1;
        if(B>=2&B<=10&X>=1&X<=100000){
            long remainder;
            boolean finish = false;

            while (!finish) {
                if (X == 0) {
                    finish = true;
                } else {
                    remainder = X % B;
                    X = X / B;
                    result.add(remainder);
                }
            }

            for (int i = 0; i <result.size(); i++) {
                Y+= result.get(i)*place;
                place*=10;
            }

        }else{
            System.out.println("BaseB takes a number to convert of type Long 1-100,000 and the target base 2-10");
        }
        return Y;
    }
    public static long NthTerm(long X)
    {
        long a_1=1;
        long a_2=3;
        long difference=a_2-a_1;

        long Y = a_1+((X-1)*difference);

        return Y;

    }

    public static long RecursiveSeq(long X){

        //validation
        if(X<0){
            System.out.println("Please enter a positive number");
            return -1;
        }else if(X>50){
            System.out.println("Please enter a number <51");
            return -1;
        }

        //base cases
        else if(X==1){
            return 1;
        }else if (X==2){
            return 3;
        }
        return (2*RecursiveSeq(X-1)) - (2*RecursiveSeq(X-2));
    }


} // end class