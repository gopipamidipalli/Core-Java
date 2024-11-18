import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m = sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("Enter a index row "+(i)+" and column "+(j+1));
               // Scanner sc= new Scanner(System.in);
                arr[i][j]=sc.nextInt();
            }
        }
         for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
         }
         for(int i=0;i<3;i++){
            for(int j=0;j<i;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
         }
    }
}
