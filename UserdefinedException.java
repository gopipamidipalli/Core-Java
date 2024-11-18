class youareakid extends Exception{
     youareakid(String s){
        System.out.println(s);
     }
}
public class UserdefinedException {
    void vote(int age) throws youareakid{
        if(age<18){
           // System.out.println("your a kid");
               throw new youareakid("your a kid");
        }else{
            System.out.println("your eligible to vote");
        }
    }
    public static void main(String[] args) {
       // youareakid obj = new youareakid();
       UserdefinedException obj = new UserdefinedException();
        try{
            obj.vote(17);
        }
        catch(Exception e){
        System.out.println(e);
        }
        finally{
            System.out.println("welcome");
        }
    }
}
