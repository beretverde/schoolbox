import java.util.Random;

/**
 * Created by jacoxt on 7/6/2017.
 */
public class Binomial {

    double P;
    long N;
    long X;

    public Binomial(double p, long n, long x ){
        P = p;
        N = n;
        X= x;
    }

    public Binomial(double p, long n){
        P = p;
        N = n;
        randomX();
    }


    public double getP() {
        return P;
    }

    public long getN() {
        return N;
    }

    public long getX() {
        return X;
    }

    public void setP(double p) {
        P = p;
    }

    public void setN(long n) {
        N = n;
    }

    public void setX(long x) {
        X = x;
    }

    void randomX(){
        Random gen = new Random();

        //Limiting the range of my random numbers 1-10 so its easier to work with.
        int max=10;
        int min=1;

        long randomNum =(long)gen.nextInt((max - min) + 1) + min;

        this.X=randomNum;
    }

    double mean(){

        return (double)this.N*this.P;

    }

    double variance(){


        return (double)this.N*this.P*(1-this.P);
    }


    public static double Factorial(long N){

        double fact=1.0;
        for (int i=1;i<=N;i++){
            fact *=(double)i;
        }
        return fact;
    }


    public static double Permutations(long N, long X)
    {
        double perm = 1.0;

        for (int x=0;x<X;x++){
            perm = perm*(double)(N-x);
        }
        return perm;
    }

    public static double Combinations(long N, long X)
    {
        double comb = 0.0;

        if(X==0|X==N){
            return 1.0;
        }
        if(N-X<X){
            comb=Permutations(N,N-X)/ Factorial(N-X);
        }else {
            comb = Permutations(N, X) / Factorial(X);
        }

        return comb;
    }



    double probX(){
        double probX = 0.0;

        probX=Combinations(N,this.X)*Math.pow(this.P,this.X)*Math.pow(1-this.P,this.N-this.X);

        return probX;
    }


}
