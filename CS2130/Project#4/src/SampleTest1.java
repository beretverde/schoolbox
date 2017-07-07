
// SampleTest1 - sample program to test BMat class

public class SampleTest1
{
    public static void main(String[] args)
    {

        // Declare work objects
        BMat W1, W2, W3,W4,W5;
        int[][] C = new int[][]
                       {{0, 0, 0},
                        {1, 1, 0},
                        {1, 1, 0}};

        int[][] D = new int[][]
                       {{1, 1, 0},
                        {0, 1, 0},
                        {0, 1, 1}};




        int[][] E = new int[][]
                {{1, 1},
                        {0, 1},
                        {0, 1}};

        int[][] F = new int[][]
                {{1, 1, 0},
                        {0, 1, 1}};


        // Instance and display initial objects
        BMat MC = new BMat(C);
        BMat MD = new BMat(D);

//        BMat ME = new BMat(E);
        BMat MF = new BMat(F);

        System.out.println("\n Matrix C");
        MC.show();

        System.out.println("\n Matrix D");
        MD.show();

//        System.out.println("\n Matrix C");
//        ME.show();

        System.out.println("\n Matrix D");
        MF.show();



        // Indegree of node 1 of D
        // Node numbers are 0, 1, 2
        int indegreeD1 = MD.indegree(1);
        System.out.println("\n Indegree of node 1 of D = " + indegreeD1);

        // outdegree of node 1 of D
        int outdegreeD1 = MD.outdegree(1);
        System.out.println("\n outdegree of node 1 of D = " + outdegreeD1);

        // Complement of C
        W1 = MC.complement();
        System.out.println("\n Complement of C");
        W1.show();

        // Transpose of C
        W5=MC.transpose();
        System.out.println("\n Transpose of C");
        W5.show();

        // Join (OR) of C and D
        W2 = MC.join(MD);
        System.out.println("\n Join of C and D");
        W2.show();

        // Meet (And) of C and D
        W4 = MC.meet(MD);
        System.out.println("\n Meet of C and D");
        W4.show();



        // Reflexive Closure of C
        W3 = MC.rclosure();
        System.out.println("\n Reflexive Closure of C");
        W3.show();
    }

} // end class