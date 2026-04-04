import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter a num:");
        int num = Sc.nextInt();
        printoddsum(num); 

    }
    public static int printoddsum(int num) {
       int sum = 0;
       int i =1;
       while (i<=num){
          sum +=i;
          i+=2;
       }
        System.out.println("result of oddsum is =" + sum);
        return sum;
        
       
    }
}
