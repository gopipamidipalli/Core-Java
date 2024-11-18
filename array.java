import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int arr[]=new int[4];
        Scanner a= new Scanner(System.in);
        for(int i=0;i<4;i++){
            System.out.println("enter the value"+(i+1));
               arr[i]=a.nextInt();
               System.out.println(5+"*"+i+"="+(5*i));
        }
        for(int i=0;i<4;i++){
            System.out.print(arr[i]+" "+" * ");
            System.out.println(arr[i]);
        }
    }
}
