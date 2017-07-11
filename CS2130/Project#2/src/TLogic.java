/**
 * Created by jacoxt on 7/3/2017.
 */
public class TLogic {

 public static enum Value{
     F,T,U;


     public Value TAND(Value v1, Value v2){


         if(v1==F || v2==F || this==F) {
             return F;
         }else if(v1==U || v2==U || this==U){
             return U;
         }else{
             return T;
         }

     }

     public Value TOR(Value v1, Value v2){

         if(v1==T||v2==T||this==T){
             return T;

         }else if(v1==U||v2==U||this==U){
             return U;
         }else{
             return F;
         }


     }

     public Value TNOT(Value v1,Value V2){

         //not sure about the truth table on this one

     }

 }

}
