import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by jacoxt on 7/6/2017.
 */
public class main {

    public static void main( String[] args ) {

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

        System.out.println("Mean using N*P "+rand.get(0).mean());

        System.out.println();



        System.exit( 0 ); //success


    }


}
