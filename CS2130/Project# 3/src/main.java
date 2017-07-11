import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by jacoxt on 7/6/2017.
 */
public class main {

    public static void main( String[] args ) {


        System.out.println("1a.) How many ways can the 4 employees be drawn if the order in which they are drawn matters (i.e. the prizes have different values)?");

        System.out.println("DProb.Permutations(33,4)= "+DProb.Permutations(33,4));

        System.out.println("1b.) How many ways can the 4 employees be drawn if the order in which they are drawn does not matter (i.e. all prizes have the same value)?");

        System.out.println("DProb.Combinations(33,4)= "+DProb.Combinations(33,4));

        System.out.println("2a.) Suppose 8 Lab-A PC's are randomly drawn. What is the probability that none of the PC's in the sample is infected?");

        System.out.println("DProb.HyperGeometric(50,8,41,8)= "+DProb.HyperGeometric(50,8,41,8));

        System.out.println("2b.) How many ways can the 4 employees be drawn if the order in which they are drawn matters (i.e. the prizes have different values)?");

        System.out.println("DProb.HyperGeometric(30,8,30-4,8)= "+DProb.HyperGeometric(30,8,30-4,8));

        System.out.println("2c.) How many ways can the 4 employees be drawn if the order in which they are drawn matters (i.e. the prizes have different values)?");

        System.out.println("DProb.HyperGeometric(50,8,41,8)*DProb.HyperGeometric(30,8,30-4,8))= "+DProb.HyperGeometric(50,8,41,8)*DProb.HyperGeometric(30,8,30-4,8) );

        System.out.println("2d.) How many ways can the 4 employees be drawn if the order in which they are drawn matters (i.e. the prizes have different values)?");

        System.out.println("DProb.HyperGeometric(80,8,80-4-9,8)= "+DProb.HyperGeometric(80,8,80-4-9,8));

        System.out.println("3a.) How many ways can the 4 employees be drawn if the order in which they are drawn matters (i.e. the prizes have different values)?");

        System.out.println("DProb.HyperGeometric(50,8,41,8)= "+DProb.HyperGeometric(50,8,41,8));

        System.out.println("3a.) How many ways can the 4 employees be drawn if the order in which they are drawn matters (i.e. the prizes have different values)?");

        System.out.println("DProb.HyperGeometric(50,8,41,8)= "+DProb.HyperGeometric(50,8,41,8));

        System.out.println("3a.) How many ways can the 4 employees be drawn if the order in which they are drawn matters (i.e. the prizes have different values)?");

        System.out.println("DProb.HyperGeometric(71,5,10,3)= "+DProb.HyperGeometric(71,5,10,3));

        System.out.println("3b.) How many ways can the 4 employees be drawn if the order in which they are drawn matters (i.e. the prizes have different values)?");

        System.out.println("DProb.HyperGeometric(71,5,10,0)+DProb.HyperGeometric(71,5,10,1)= "+(DProb.HyperGeometric(71,5,10,0)+DProb.HyperGeometric(71,5,10,1)));

        System.out.println("4a.) How many ways can the 4 employees be drawn if the order in which they are drawn matters (i.e. the prizes have different values)?");

        System.out.println("DProb.Binomial(.069,30,3)= "+DProb.Binomial(.069,30,3));

        System.out.println("4b.) How many ways can the 4 employees be drawn if the order in which they are drawn matters (i.e. the prizes have different values)?");

        System.out.println("DProb.Binomial(.069,30,2)+DProb.Binomial(.069,30,1)+DProb.Binomial(.069,30,0)= "+(DProb.Binomial(.069,30,2)+DProb.Binomial(.069,30,1)+DProb.Binomial(.069,30,0)));

        System.out.println("5a.) How many ways can the 4 employees be drawn if the order in which they are drawn matters (i.e. the prizes have different values)?");

        System.out.println("DProb.Binomial(.026,125,4)= "+DProb.Binomial(.026,125,4));

        System.out.println("DProb.Poisson(125*.026,4)= "+DProb.Poisson(125*.026,4));

        System.out.println("5b.) How many ways can the 4 employees be drawn if the order in which they are drawn matters (i.e. the prizes have different values)?");

        System.out.println("DProb.Binomial(.026,125,3)+DProb.Binomial(.026,125,2)+DProb.Binomial(.026,125,1)+DProb.Binomial(.026,125,0)= "+(DProb.Binomial(.026,125,3)+DProb.Binomial(.026,125,2)+DProb.Binomial(.026,125,1)+DProb.Binomial(.026,125,0)));

        System.out.println("DProb.Poisson(125*.026,3)+DProb.Poisson(125*.026,2)+DProb.Poisson(125*.026,1)+DProb.Poisson(125*.026,0)="+(DProb.Poisson(125*.026,3)+DProb.Poisson(125*.026,2)+DProb.Poisson(125*.026,1)+DProb.Poisson(125*.026,0)));


        //Part C


//Question1
        Binomial b1 = new Binomial(.36,22);


        System.out.println("P: "+b1.P);
        System.out.println("N: "+b1.N);
        System.out.println("X: "+b1.X);

        System.out.println("Mean: "+b1.mean());
        System.out.println("Variance: "+b1.variance());

//Question2
        Binomial b2  = new Binomial(.73, 6,0);
        System.out.println("P: "+b2.P);
        System.out.println("N: "+b2.N);
        System.out.println("X: "+b2.X);
        System.out.println("X       Pr(x)");
        System.out.println(b2.X+"       "+b2.probX());
        Binomial b3  = new Binomial(.73, 6,1);
        System.out.println(b3.X+"       "+b3.probX());
        Binomial b4  = new Binomial(.73, 6,2);
        System.out.println(b4.X+"       "+b4.probX());
        Binomial b5  = new Binomial(.73, 6,3);
        System.out.println(b5.X+"       "+b5.probX());
        Binomial b6  = new Binomial(.73, 6,4);
        System.out.println(b6.X+"       "+b6.probX());
        Binomial b7  = new Binomial(.73, 6,5);
        System.out.println(b7.X+"       "+b7.probX());
        Binomial b8  = new Binomial(.73, 6,6);
        System.out.println(b8.X+"       "+b8.probX());


        List<Binomial> rand = new ArrayList<>();

        double total=0;
        for(int x=0;x<100;x++){
            Binomial binomial= new Binomial(.32,12);
            rand.add(binomial);
            total+=binomial.getX();
        }
        System.out.println("Average using [= (X1 + X2 + ... + X100)/100]= "+total/rand.size());

        System.out.println(rand.get(0).mean());

        System.out.println();



        System.exit( 0 ); //success


    }


}
