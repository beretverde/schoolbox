// Test Finite State Machine Class
public class TestFSM
{
    public static void main(String[] args)
    {
        // Language: strings that contain both a and b,
        // and the first a is before the first b.
        String A   = "abc";

        int[][] ST = {{1,3,0},
                      {1,2,1},
                      {2,2,2},
                      {3,3,3}};

        int[] AS   = {0,0,1,0,0,1,1,0};

        String AL1   = "ab";

        int[][] STL1 = {{1,4},
                        {2,3},
                        {1,8},
                        {9,5},
                        {6,5},
                        {5,5},
                        {7,5},
                        {6,5},
                        {3,5},
                        {10,5},
                        {9,5}};

        int[] ASL1   = {0,0,0,1,0,0,1,0,0,0,1};

        String AL2   = "01";

        int[][] STL2 = {{1,3},
                        {2,4},
                        {6,5},
                        {4,7},
                        {5,7},
                        {7,7},
                        {7,7},
                        {7,7}};

        int[] ASL2   = {0,0,1,0,0,1,1,0};

        String AL3   = "xyz";

        int[][] STL3 = {{1,0,4},
                        {1,2,4},
                        {3,0,4},
                        {3,3,3},
                        {1,5,4},
                        {1,0,3}};

        int[] ASL3   = {0,0,0,1,0,0};


        String AL4   = "pqr";

        int[][] STL4 = {{4,0,1},
                        {4,2,1},
                        {4,0,3},
                        {3,3,3},
                        {5,0,1},
                        {5,0,1}};


        int[] ASL4   = {0,0,0,1,0,1};



        FSM FSM = new FSM(A, ST, AS);
        FSM FSM1 = new FSM(AL1, STL1, ASL1);
        FSM FSM2 = new FSM(AL2, STL2, ASL2);
        FSM FSM3 = new FSM(AL3, STL3, ASL3);
        FSM FSM4 = new FSM(AL4, STL4, ASL4);
        if(args.length >= 1)
        {
            for(int x=0;x<args.length;x++){
                // Input string is command line parameter
                String inString;
                boolean accept1 = false;
                inString = args[x];
                accept1 = FSM4.validString(inString);
                System.out.println("\n String:  " + inString
                        + "    Accept?  " + accept1);
            }

        }


    } // end main

} // end class

