import java.util.Scanner;

public class reverseint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        printreverseint(num);
    }

    public static void printreverseint(int num) {
        int reverse = 0;
        while (num > 0) {
            int digit = num % 10;      
            reverse = reverse*10 + digit; 
            num = num / 10;             
        }
        System.out.println("Reverse integer is = " + reverse);
    }
}

