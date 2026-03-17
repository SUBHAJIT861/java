import java.util.Scanner;

public class intmethod {
    public static void main(String[] args) {
    int first = readnumber()+2;
    int second = readnumber()+3;

    int sum = first+ second;
    System.out.println("sum of the result is:" + sum);
}

public static int readnumber(){
    Scanner Sc = new Scanner(System.in);
    System.out.print("please enter the number:");
    int number=Sc.nextInt();
    return number;
}
 }

