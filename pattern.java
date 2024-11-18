import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
      //  int arr[][]= new int[4][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a N value ");
         int n= sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+": ");
            }
            System.out.println("");
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println("");
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(i+j+" ");
        }
        System.out.println("");
    }
    for(int i=n;i>=1;i--){
        for(int j=0;j<i;j++){
            System.out.print("*:"+" ");
        }
        System.out.println("");
    }
    for(int i=0;i<n;i++){
        for(int j=n;j<i;j++){
            System.out.print("*"+" ");
        }
        System.out.println("");
    }


      //2D array
    int[][] arr = new int[4][4];
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            arr[i][j]=(int)(Math.random()*10);
            System.out.print(arr[i][j]+ " ");
        }
        System.out.println();
    }

    
    for(int g[]:arr){
        for(int m:g){
             System.out.print(m+" ");
        }
        System.out.println();
    }
}
}