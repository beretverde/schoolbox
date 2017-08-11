// Discrete Probability Library
public class DProb
{

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

        for (int i=0;x<X;x++){
            perm = perm*(double)(N-i);
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

    public static double HyperGeometric(long Np, long Xp, long N, long X)
    {
        double probX = 0.0;

        probX=(Combinations(Xp,X)*Combinations(Np-Xp,N-X))/Combinations(Np,N);

        return probX;
    }

    public static double Binomial(double P, long N, long X)
    {
        double probX = 0.0;

        probX=Combinations(N,X)*Math.pow(P,X)*Math.pow(1-P,N-X);

        return probX;
    }

    public static double Poisson(double Xmean, long X)
    {
        double probX = 0.0;

        probX=Math.pow(Math.E,-Xmean)*(Math.pow(Xmean,(double)X)/Factorial(X));

        return probX;
    }

} // end class
