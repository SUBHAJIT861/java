import java.util.Scanner;

public class occurofarray {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("enter the size of arr: ");
        int num = Sc.nextInt();
        int[]arr = new int[num];

        int i =0;
        while(i<num){
            System.out.print("enter the elemnt " +(i+1) + ":");
            arr[i] = Sc.nextInt();
            i++;
        }
        System.out.println("enter number to find occurence:");
        int n= Sc.nextInt();
        
        int count = 0;
         i = 0;
        while(i<num){
            if(arr[i]==n){
                count++;
            }
            i++;
        }

      System.out.println("number of occurence of" + n+"is =" + count);

        }
}
