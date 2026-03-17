public class voidMethods {
    public static void main(String[] args) {
        printfirstpattern();
    }
    public static void printfirstpattern(){
        int row=0;
        while(row <5){
            System.out.print("*");
            int i=0;
            while(i<row){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row++;
        }
    }

   }
// public static void main(String[] args) {
//     printsecondpattern();
// }
// public static void printsecondpattern() {
// int row= 5;
// while(row>0){
//     System.out.print("*");
//      int i =1;
// while(i<row){
//     System.out.print(" *");
//     i++;
// }
//    System.out.println();
//     row--;
//      }
//    }  
// }


