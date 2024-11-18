 // perent class
 class Mobile{
    String color;
     int cost;
     public void on(){
        System.out.println("mobile is on");
     }
     public void off(){
        System.out.println("mobile is off");
     }
 }
 // child1 class
 class Touchphone extends Mobile{
     int size;
     public void touchscreen(){
        System.out.println("touch is work");
     }
 }
 //child2 class
 class keypadphone extends Mobile{
       int nokeys;
       public void keys(){
        System.out.println("key is workimg");
       }
 }
 
 public class Inheritence {
    public static void main(String[] args) {
        keypadphone kp = new keypadphone();
        kp.on();
        kp.keys();
        kp.color="blue";
        System.out.println("colour :"+kp.color);
        kp.cost=2000;
        System.out.println("cost :"+kp.cost);
        Touchphone tp = new Touchphone();
        tp.off();
        tp.touchscreen();
        tp.color="red";
        System.out.println(tp.color);
    }
 }
