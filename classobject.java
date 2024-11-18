   class car{ 
    int num1;
    int num2;
    int result;

    void add(){
      result=num1+num2;
      System.out.println(result);
    }
    int mul(int val,int val1){
      result=val*val1;
      return result;
    }

  }
public class classobject {
    public static void main(String[] args) {
        car mycar = new car();
        mycar.num1=5;
        mycar.num2=9;
        mycar.add();
        int res= mycar.mul(6,9);
        System.out.println(res);

    }
}
