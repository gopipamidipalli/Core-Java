public class methodoverload {
    void show(int a){
        System.out.println(a+" its a integer");
    }
    void show(char c){
        System.out.println(c+" its a charector");
    }
    void show(int a, int y){
        System.out.println(a/y);
    }
    public static void main(String[] args) {
        methodoverload m = new methodoverload();
        m.show(5);
        m.show('g');
        m.show(7);
        m.show(5,9);
        m.show(10);
    }
}


