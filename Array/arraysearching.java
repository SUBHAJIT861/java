import java.util.Scanner;

public class arraysearching {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int[] myarr = {85,25,47,59,36};
        System.out.println("enter your arr: ");
        int num = Sc.nextInt();
        boolean isFound = isFound(myarr,num);
        if (isFound){
            System.out.println("your number found in arr ");
        }else{
            System.out.println("your numner is not found  in arr:");
        }

    }
public static boolean isFound (int[]myarr, int num) {
    int index = 0;
    while(index < myarr.length){
        if(myarr[index]==num){
           return true;
        }
        index++;

    }
    return false;
}
}
