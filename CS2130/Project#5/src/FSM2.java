public class FSM2 {
    public static void main(String[] args)
    {

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

        FSM FSM2 = new FSM(AL2, STL2, ASL2);

        if(args.length >= 1)
        {
            for(int x=0;x<args.length;x++){
                // Input string is command line parameter
                String inString;
                boolean accept1 = false;
                inString = args[x];
                accept1 = FSM2.validString(inString);
                System.out.println("\n String:  " + inString
                        + "    Accept?  " + accept1);
            }

        }


    }
}
