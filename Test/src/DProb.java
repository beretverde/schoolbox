// Discrete Probability Library
public class DProb
{


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
        double comb = 1.0;

        if(X==0|X==N){
            return 1.0;
        }
        if(N-X<=X){
            X=N-X;
        }
        for(int i=0; i<X;i++) {
            comb = comb * (double) (N - i) / (double) (i+1);
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

        probX=Math.pow(Math.E,-Xmean)*(Math.pow(Xmean,(double)X)/Permutations(X,X));

        return probX;
    }

} // end class
