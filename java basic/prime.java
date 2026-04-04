import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
  System.out.println("enter a number: ");
        int num = Sc.nextInt();
        boolean prime = true;
 if(num <=1 ){
  prime = false;
    }

 else{
    for(int i =2; i<num;i++){
        if(num %i ==0){
            prime = false;
            break;
        }
    }
    }
 if(prime){
    System.out.println("this is prime number ");
 }else{
    System.out.println("this is not prime ");
 }

    }
}
