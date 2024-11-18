public class Breakandcontinue{
    public static void main(String[] args){
        System.out.println("welcome to new room");

        // break and continue.
       int i=0;
       while(i<=10){
        if (i==4){
            System.out.println("stop the itaration"); break;
        }else if(i==8){
             System.out.println("continues the itaration");continue;
        
        }
        i++;
        System.out.println(i);
       }

    }
}