public class FSM4 {
    public static void main(String[] args)
    {


        String AL4   = "pqr";

        int[][] STL4 = {{4,0,1},
                {4,2,1},
                {4,0,3},
                {3,3,3},
                {5,0,1},
                {5,0,1}};


        int[] ASL4   = {0,0,0,1,0,1};

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

    }
}
