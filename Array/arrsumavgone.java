
//ARRAYSUMAND AVERAGE USING METHOD
public class arrsumavgone {
    public static void main(String[] args) {
     int[] numArray = Arrayutility.inputArray();
     long sum = sum(numArray);
     int avg = avg (numArray);
     System.out.println("sum of the element is: " + sum);
     System.out.println("avg of the element is : " +avg);
        }
     public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;
        while(i< numArray.length){
            sum += numArray[i];
            i++;
        }

        
       return sum;
     }
      public static int avg(int[] numArray) {
        long sum = sum(numArray);
       return (int)(sum / numArray.length);

    }

}