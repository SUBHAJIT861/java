import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the  number: ");
        int num = Sc.nextInt();

        int original = num;
        int sum =0;

       while(num !=0){
        int digit = num%10;
        sum = sum +(digit*digit*digit);
        num = num/10;
       }
       if(sum==original){
        System.out.println("this is armstrong  number ");
       }else{
        System.out.println("this is not armstrong  number ");
       }
    }
}
