    class Computer{
        public void playMusic(){
            System.out.println("Music playing...");
        }
        public String getMePen(int cost){
            if(cost>=10)
                  return "pen";
   
            return "no pen";
        }
        public int levelSound(int level){
            
            for(int i=0;i<5;){
                 if(i==level)
                        return 1*12;
                return -1;
            }
                        return level;
        }
    }
public class methods {
    public static void main(String[] args) {
         Computer com = new Computer();
           com.playMusic();

         String str=com.getMePen(11);
            System.out.println(str);
         
          int a= com.levelSound(1);
          System.out.println(a);
    }
    
}
