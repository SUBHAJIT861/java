
import java.util.Scanner;

/*public class relational {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("please enter your age");
        int age = Sc.nextInt();

        if(age >=18){
            System.out.println("eligiblen to drive");
        } else {
            System.out.println("not eligible");

        }
    }
}*/

/*public class LigIcal {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in); 

     System.out.println("enter your age");
     int age = Sc.nextInt();
     System.out.println("Are you a female ? (true/false)");
     boolean isFemale = Sc.nextBoolean();

     if (age<5){
        System.out.println("you got 75% discount");
     }
     else if (isFemale){
        System.out.println("you got 50% discount");
     }
     else if (age>60 && !isFemale ){
        System.out.println("you got 25% discount");
     }
     else {
        System.out.println("you got no discount");
     }

    
    }
}*/

/*public class positivenegativezero{
public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
 System.out.println("enter a number");
 int num = Sc.nextInt();

 if (num>0){
    System.out.println("the num is positive");
 }
 else if (num<0){
    System.out.println("the num is negative");
 }
 else {
    System.out.println("the num is zero");
 }

}
}*/

/*public class oddeven{
   public static void main(String[] args) {
      Scanner Sc = new Scanner(System.in);
      System.out.println("enter a number");
      int num = Sc.nextInt();

      if(num % 2 == 0){
         System.out.println("your number is even ");
      }
      else {
         System.out.println("your number is odd");
      }
   }
}*/

/*public class gretestofthree{
   public static void main(String[] args) {
      Scanner Sc = new Scanner(System.in);
    System.out.println("enter first num");
    int a = Sc.nextInt();
    System.out.println("enter second num");
    int b = Sc.nextInt();
    System.out.println("enter third num");
    int c = Sc.nextInt();

    if(a>=b && a>=c){
      System.out.println(a +" is the gretest number");
    }
    else if (b>=c){
      System.out.println(b + "is the gretest number");
    }
    else {
      System.out.println(c + "is the gretest number");
    }
    //else if(b>=a && b>=c){
      //System.out.println(b +"is the gretest number");
    //}else if(c>=a && c>=b){
      //System.out.println(c +"is the gretest number");
    //}


   }

}*/

/*class leapyear{
   public static void main(String[] args) {
      Scanner Sc = new Scanner(System.in);
      System.out.println("enter your year:");
      int year = Sc.nextInt();

      if( year % 400 == 0){
         System.out.println("the year is Leap year");
      }else if (year % 4 ==0 && year % 100 !=0){
         System.out.println("the year is Leap year");
      }else {System.out.println("the year is not Leap year");

      }
   }
}*/

/*public class Gread{
public static void main(String[] args) {
   Scanner Sc = new Scanner(System.in);
   System.out.println("enter your parsentage of marks:");
   int number = Sc.nextInt();

   if(number >= 90){
      System.out.println("you got great A");
   }else if(number<90  && number >=75){
      System.out.println("you got great B");
   }else if(number<75 && number>=60){
      System.out.println("you got great C");
   }else if (number<60 && number>=30){
      System.out.println("you got great D");
   }else {
      System.out.println("you got grear F this means Fail");
   }
}
}*/

/*public class agegroup{
   public static void main(String[] args) {
      Scanner Sc = new Scanner(System.in);
     System.out.println("enter your age");
     int age = Sc.nextInt();

     if( age<=13){
      System.out.println("you are a child");
     }else if(age>13 && age<=20){
      System.out.println("you are a Teen");
     }else if (age>20 && age<60){
      System.out.println("you are a Adult");
     }else{
      System.out.println("you are a Senior");
     }
   } 
}*/

/*public class bitwiseXOR{
   public static void main(String[] args) {
      Scanner Sc = new Scanner (System.in);
      System.out.println("enter the first number:");
      int first = Sc.nextInt();
      System.out.println("enter the other number:");
      int second = Sc.nextInt();
      
      int result = first ^ second;
      System.out.println("Result is :" + result);
   }

}*/

public class bitwiserightshift{
   public static void main(String[] args) {
      Scanner Sc = new Scanner (System.in);
      System.out.println("enter the  number:");
      int number = Sc.nextInt();
      
      
      int result = number >> 1;
      System.out.println("Result is :" + result);
   }

}