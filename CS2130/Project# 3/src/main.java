import java.util.Random;

/**
 * Created by jacoxt on 7/6/2017.
 */
public class main {

    public static void main( String[] args ) {

////1a
//        System.out.println( DProb.Permutations(33,4) );
////1a
//        System.out.println( DProb.Combinations(33,4) );
////2a
//        System.out.println( DProb.HyperGeometric(50,9,8,8) );
             System.out.println( DProb.HyperGeometric(50,8,41,8) );
        System.out.println( DProb.HyperGeometric(30,8,30-4,8) );
        System.out.println( DProb.HyperGeometric(50,8,41,8)*DProb.HyperGeometric(30,8,30-4,8) );
        System.out.println( DProb.HyperGeometric(80,8,80-4-9,8) );
////3a
//        System.out.println( DProb.HyperGeometric(71,5,10,2) );
//        //3b
//        System.out.println( DProb.HyperGeometric(71,5,10,3) );


//        double result1=DProb.HyperGeometric(71,5,10,0)+DProb.HyperGeometric(71,5,10,1);
//        System.out.println(result1);

        //4b
//        double result2=DProb.Binomial(.069,30,2)+DProb.Binomial(.069,30,1)+DProb.Binomial(.069,30,0);
//        System.out.println(result2);
//
//
//        double result3=DProb.Binomial(.026,125,3)+DProb.Binomial(.026,125,2)+DProb.Binomial(.026,125,1)+DProb.Binomial(.026,125,0);
//        System.out.println(result3);
//
//        double result4=DProb.Poisson(125*.026,4);
//        System.out.println(result4);
//
//        double result5=DProb.Poisson(125*.026,3)+DProb.Poisson(125*.026,2)+DProb.Poisson(125*.026,1)+DProb.Poisson(125*.026,0);
//        System.out.println(result5);

        System.exit( 0 ); //success
    }


}
