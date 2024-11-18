   class mobile{
      String brand;
      double price;
      //static variable
      static String name; 

     public void show(){
        System.out.println(brand+": "+price+": "+name);
     }
     //static method.
     public static void show1(mobile obj){
             System.out.println(obj.brand+": "+name);//static methods can only access other static member directly.
                    //obj.brand is a object reference.
            }

    //static block.
    static{  // its only calles onces and its always executes first
        int price = 1500;
        System.out.println(price);
     }
}

public class staticKeyword {
    public static void main(String[] args) {
        mobile obj = new mobile();
            obj.brand = "apple";
            obj.price = 1500;
           // mobile.name = "phone";
           //The show method will always print the name obj.
           //No static instance variable int prints null.

        mobile obj1 = new mobile();
            obj1.brand = "apple";
            obj1.price = 1700;
            mobile.name = "Smartphone";


            obj.show();
            obj1.show();
 
            mobile.show1(obj); // colling without creating an object of  a class.

    }
}
