import java.util.Scanner;

public class sumavgarr {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("enter size of arr: ");
        int num = Sc.nextInt();
        int[]myarr = new int[num];

        int sum =0;
        int i=0;
        while(i<num) {
             System.out.print("enter the element " +(i+1) + ": ");
            myarr[i]= Sc.nextInt();
            sum = sum+ myarr[i];
            i++;
        }
        

        double avg = (double)sum/num;
        System.out.println("sum of the element=" + sum);
        System.out.println("average of element=" +avg);

    }
}
