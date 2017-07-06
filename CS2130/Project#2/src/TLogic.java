/**
 * Created by jacoxt on 7/3/2017.
 */
public class TLogic {

    char A;
    char B;
    char C;

    public TLogic(char a, char b, char c){
        A=a;
        B=b;
        C=c;

    }


    public TLogic TAND(TLogic input){
        if(this == 'T'){
            return input;
        }else if(this == 'U'){
            return (input == 'F') ? 'F' : 'U';
        }else{
            return 'F';
        }
    }




    public static void main(String[] args){

    }




}
