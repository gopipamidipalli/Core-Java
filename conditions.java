import java.util.Scanner;
public class conditions {
    public static void main(String[] args) {
             char ch ;
        Scanner scan= new Scanner(System.in);
             System.out.println("enter a charectar");
          ch= scan.next().charAt(0);
           if(ch>='A' && ch<='Z')
             System.out.println("uppercase letters");
             else if(ch>='a' && ch<='z')
               System.out.println("lowercase letter");
               else
                   System.out.println("not a letter");
              
      /*   int a=7;
        int b= 5;
        //int c= 3;

        switch(a-b)
            {
            case 0: System.out.println("sum is zero"); break;
            case 1: System.out.println("sum is 100"); break;
            case 2: System.out.println("sum is 34"); break;
            default:System.out.println("sum is not in there");break;
            }

      /*   if(a>b){
            System.out.println("a is greater then b");
            if(a==0){
                System.out.println("a is equals to 0");
            }
            else{
                 System.out.println("a is  not equals to 0");
            }
        }else if(a==c){
             System.out.println("a is equals to c");
        }
        else{
            System.out.println("a is lessthen b");
        } 
*/
              int x=7;
              //int result =0;
              // ternary operater  ? : we use this two operaters
              int result = x%2==0 ? 20:40;
               System.out.println(result);
    }
}
