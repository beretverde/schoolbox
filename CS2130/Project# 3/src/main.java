import java.util.Random;

/**
 * Created by jacoxt on 7/6/2017.
 */
public class main {

    public static void main( String[] args ) {
//        System.out.println( DProb.Permutations(15,3) );
//        System.out.println( DProb.Factorial(4) );
//        System.out.println( DProb.Combinations(50,47) );
//        System.out.println( DProb.HyperGeometric(11,5,3,2) );
//        System.out.println( DProb.Binomial(.3,5,3) );
//        System.out.println(DProb.Poisson(3.22,4));

        Random gen = new Random();

        long randomLong = gen.nextLong();

        System.out.println((randomLong));


        System.exit( 0 ); //success
    }


}
