import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = Sc.nextInt();

        int original = num;
        int reverse = 0;

        while(num!=0){
            int digit = num%10;
            reverse = reverse*10 + digit;
            num = num/10;
        }
        if(reverse == original){
            System.out.println("this is palindrome");
        }else{
            System.out.println("this is not palindrome");
        }
    }
}
