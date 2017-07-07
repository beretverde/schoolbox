import java.util.Random;

/**
 * Created by jacoxt on 7/6/2017.
 */
public class Binomial {

    double P;
    long N;
    long X;

    public Binomial(double p, long n, long x) {
        P = p;
        N = n;
        X = x;
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

    long randomX(){
        Random gen = new Random();

        long randomLong = gen.nextLong();

        return randomLong;
    }

    double mean(long N,double P){

        return (double)N*P;

    }

    double variance(long N,double P){


        return (double)N*P*(1-P);
    }

    double probX(double P, long N){
        double probX = 0.0;

//        probX=Combinations(N,X)*Math.pow(P,X)*Math.pow(1-P,N-X);

        return probX;
    }


}
