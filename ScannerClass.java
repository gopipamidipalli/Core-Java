import java.util.Scanner; 
public class ScannerClass {
    public static void main(String[] args) {
        int a =  10;
        char c = 'g';
        String b = "gopi";
        int x;
        int y;
        int z;

        System.out.print(a);
        System.out.println(c);
        System.out.println("gopi");
        System.out.println(b);
        System.out.println("i am a " +b);
        System.out.println("please enter x  number");
        Scanner s = new Scanner(System.in);
           x=s.nextInt();
           System.out.println("please enter y number");
           y=s.nextInt();
          System.out.println("you have enter x "+x);
                 z = x+y;
        System.out.println("the z value is "+z);
        int l,f;
       
         l= s.nextInt();
         f= s.nextInt();
         System.out.println(l*f);
    }
   
}
