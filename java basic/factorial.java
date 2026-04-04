
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("entyer your number: ");
        int num = Sc.nextInt();
        printfactorial(num);
    }
    public static void printfactorial(int num) {
        int fact = 1;
        int i=1;
        while(i<=num){
            fact = fact*i;
            i++;
        }
        System.out.println("factorial of " + num +"is= " + fact );
    }
}
