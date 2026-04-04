import java.util.Scanner;
public class intsum {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = Sc.nextInt();
        printintsum(num);

    }
    public static void printintsum(int num){
      int sum =0;
      while(num>0){
        int digit =num%10;
        sum = sum+digit;
        num = num/10;
      }
      System.out.println("the sum of the integer is :" +sum);
    }
}
