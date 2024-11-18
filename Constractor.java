public class Constractor {
    //constractor is a special method.It has the same name as the class.
    int i=5;
   private Constractor( int x,int y){
        System.out.println(x+y);
        System.out.println(x*y);
    }
   public Constractor(){
        System.out.println(i);
    }
   protected Constractor(int a,int b,int c){
        System.out.println("this is paramitarized"+((3+5+6)+(a+b+c)));
    }
    public static void main(String[] args) {
        new Constractor();  // anonymous object,
                            //it doesn't use any reference variable 
                            //it is mostly used when the object is needed only once.
        Constractor s = new Constractor(20,30);
        Constractor v = new Constractor(7,9,5);
                            //s,v are reference variable,
                            // this variable are reuse 
    }
   
}
