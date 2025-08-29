
import java.util.Scanner;
class learningif {
    public static void main(String[] args) {
     Scanner Sc = new Scanner(System.in);
     boolean isMale = false;
     String name = "pop";

     if (isMale) {
        System.out.println("Mr." +name);
     } else {
        System.out.println("Ms." + name);
     }
     boolean isSeniorCitizen = false;
     boolean isAnAdult = true;
      
     if(isSeniorCitizen) {
        System.out.println("hello senior citizen");

     } else if (isAnAdult){
        System.out.println("hello adult");
     }  else {
        System.out.println("hello child");
     }

     // else {
       // if(isAnAdult){
         //   System.out.println("hello adult");
        //} else{
          //  System.out.println("hello child");
        //}
     }


     }
    

