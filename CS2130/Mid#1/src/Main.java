public class Main {

    public static void main(String[] args) {

// Test program for 1000 iterations
        for(long x=1;x<1000;x++){
            System.out.println(x+" isPrime: "+isPrime(x));
        }


    }


    public static boolean isPrime(long X){

        //the only even prime number
        if(X==2){
            return true;
        }
        //no need to iterate if its even
        else if ( X < 2 || X%2 == 0  ) {
            return false;
        }
        // only check up to square root of num
        long limit = (long)Math.sqrt(X) + 1;
        for(int i = 3; i < limit; i+=2){
            if(X % i == 0){
                return false;
            }
        }
        return true;
    }

}
