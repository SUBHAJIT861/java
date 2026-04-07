import java.util.Scanner;

public class Arrayutility {
    public static int[] inputArray() {
         Scanner Sc = new Scanner(System.in);
          System.out.print("enter the number of element: ");
        int size = Sc.nextInt();
        int[]nums = new int[size];
        int i =0;
        while(i<size){
            System.out.print("please enter element no " +(i+1) + " : ");
            nums[i]= Sc.nextInt();
            i++;
        }
        return nums;

    }
}
