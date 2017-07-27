public class FSM3 {

    public static void main(String[] args)
    {

        String AL3   = "xyz";

        int[][] STL3 = {{1,0,4},
                {1,2,4},
                {3,0,4},
                {3,3,3},
                {1,5,4},
                {1,0,3}};

        int[] ASL3   = {0,0,0,1,0,0};

        FSM FSM3 = new FSM(AL3, STL3, ASL3);

        if(args.length >= 1)
        {
            for(int x=0;x<args.length;x++){
                // Input string is command line parameter
                String inString;
                boolean accept1 = false;
                inString = args[x];
                accept1 = FSM3.validString(inString);
                System.out.println("\n String:  " + inString
                        + "    Accept?  " + accept1);
            }

        }
    }
}
