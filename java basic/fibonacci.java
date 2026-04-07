
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the term: ");
        int num = Sc.nextInt();
        printfibonacci(num);
    }
    public static void printfibonacci(int num) {
        int a =0, b= 1;
        System.out.println("fibonacci ");

        for(int i=1;i<=num;i++){
            System.out.print( a+" ");

            int c= a+b;
            a=b;
            b=c;

        }
    }
}
