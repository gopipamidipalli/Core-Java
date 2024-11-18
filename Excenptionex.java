public class Excenptionex {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c=0;
        try {
             c= a/b;
            // System.out.println(c);
            }
           catch(ArithmeticException e){
            System.out.println(e);
           System.out.println(" this is the exception");
           System.out.println(c);
          }
          finally{
            System.out.println("its will always excute");
          }
    }
}

