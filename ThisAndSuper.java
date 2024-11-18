class ThisKeyWord{
            String name;
      public void Super(String name){
            name = this.name;
             System.out.println("this keyword");
      }
}
 class SuperKeyWord extends ThisKeyWord{

          public void Super(){
            super.Super(name);
            System.out.println("this is super keyword");
            
          }
              
          }
          
          public class ThisAndSuper {
              public static void main(String[] args) {
                 SuperKeyWord obj =  new SuperKeyWord();
                       obj.Super();
    }
}
