import java.util.Scanner;
public class samplearr{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int[] myarr = {58,89,74,36,59};

       // myarr[0]= 85
        // myarr[1]= 47;
        // myarr[2]= 69;
        // myarr[3]= 98;
        // myarr[4]= 14;
    //  System.out.println(myarr[0]);
    //  System.out.println(myarr[1]);
    //  System.out.println(myarr[2]);
    //  System.out.println(myarr[3]);
    //  System.out.println(myarr[4]);

    int index =0;
    while(index <myarr.length){
        System.out.println(myarr[index]);
        index++;
    }

    }
}
