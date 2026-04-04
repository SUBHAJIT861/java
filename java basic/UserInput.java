
import java.util.Scanner;


public class UserInput {
    public static void main(String[] args) {
  Scanner Scanner = new Scanner(System.in);

//System.out.println("enter your name");
//String name = Scanner.nextLine();
//System.out.println("Welcome " + name + " coding class");


System.out.println("enter first number");
int firstnumber = Scanner.nextInt();
System.out.println("enter second number");
int secondnumber = Scanner.nextInt();
int sum = firstnumber + secondnumber;
System.out.println("sum of your numbers: " + sum );


    }
}

