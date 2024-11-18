class A{
    void show(int a,int b,int c){
       c= a*b; //override c 
    System.out.println("the addition is "+c);
  }
}
class B extends A{
    void show(int c){
    System.out.println("the output is "+c);
  
  }
}
public class methodoverride {
    public static void main(String[] args) {
        B obj= new B();
        obj.show(10);
        A obj1 = new A();
        obj1.show(2, 4, 6);
        A obj3;
        obj3 = new B();
        obj3.show(23, 54, 56);
        obj.show(20);
    }
}