// Discrete Probability Library
public class DProb
{

    public static double Factorial(long N){

        double fact=1.0;
        for (int i=1;i<=N;i++){
            fact *=i;
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

        comb=Permutations(N,X)/ Factorial(X);

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
