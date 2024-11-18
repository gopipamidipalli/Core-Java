import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

          int[] arrays = {1,2,3,8,7,6,9,4};
          String[] temp = {"hello","my","dear","friend"};
           Scanner sc = new Scanner(System.in);
           System.out.print("enter a number");
           int n=sc.nextInt();
           int arr[]=new int[n];
           for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
          // System.out.println(arr[i]+" ");
           }
           //System.out.println(arr[n]+" ");
         Arrays.sort(arr);
          System.out.println("The sorted array is " +Arrays.toString(arr));
         
         System.out.println(Arrays.binarySearch(arr, 5));

         Arrays.sort(arrays,3,8);
         System.out.println("the arrays is "+ Arrays.toString(arrays));

         Arrays.sort(temp);
        Arrays.sort(temp,Collections.reverseOrder());
         System.out.println(Arrays.toString(temp));

         int[] x = {5,4,3,2,1};
         int[] y = {5,6,7,8,9};
        System.out.println(Arrays.equals(x,y));
        
        String str1 =  new String("hello gopi");
        String str2 = new String("hello gopi");
        System.out.println(str1.equals(str2));
    }
}
