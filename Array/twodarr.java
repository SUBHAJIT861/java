
import java.util.Scanner;

public class twodarr {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int [][] arr = {{1,2,8}, {5,7,9}, {4,6,3}};
        //System.out.println(arr[0].length);

        int i=0;
        while(i < arr.length){
            int j =0;
            while(j < arr[i].length){
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;

        }
    }
}
