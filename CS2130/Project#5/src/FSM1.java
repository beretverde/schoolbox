public class FSM1 {

    public static void main(String[] args)
    {
        // Language: strings that contain both a and b,
        // and the first a is before the first b.

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





        FSM FSM1 = new FSM(AL1, STL1, ASL1);

        if(args.length >= 1)
        {
            for(int x=0;x<args.length;x++){
                // Input string is command line parameter
                String inString;
                boolean accept1 = false;
                inString = args[x];
                accept1 = FSM1.validString(inString);
                System.out.println("\n String:  " + inString
                        + "    Accept?  " + accept1);
            }

        }


    }
}
