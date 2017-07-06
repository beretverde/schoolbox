// Discrete Probability Library
public class DProb
{

    public static double Permutations(long N, long X)
    {
        double perm = 1.0;

        for (int x=0;x<=X;x++){
            perm = perm*(double)(N-i);
        }

        return perm;
    }

    public static double Combinations(long N, long X)
    {
        double comb = 0.0;

        if(x==0|X==N){
            return 1.0;
        }



        return comb;
    }

    public static double HyperGeometric(long Np, long Xp, long N, long X)
    {
        double probX = 0.0;


        return probX;
    }

    public static double Binomial(double P, long N, long X)
    {
        double probX = 0.0;


        return probX;
    }

    public static double Poisson(double Xmean, long X)
    {
        double probX = 0.0;


        return probX;
    }

} // end class
