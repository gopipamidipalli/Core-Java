class Book{
    int id;
    String name;
    String author;
    double price;

   
}

public class arrayObject {

    public static void main(String[] args) {

        Book b1 = new Book();
            b1.id=1;
            b1.name="Happy lifes";
            b1.author="gopi";
            b1.price=250.50;

         Book b2 = new Book();
            b2.id=2;
            b2.name="Happy peoples";
            b2.author="yala";
            b2.price=170.70;

        Book b3 = new Book();
            b3.id=3;
            b3.name="Happy animals";
            b3.author="naga";
            b3.price=200;
            // System.out.println(b1.id+ ": " +b1.name);
            // System.out.println(b2.id+ ": " +b2.name);

        Book[] books = new Book[3];
             books[0]=b1;
             books[1]=b2;
             books[2]=b3;
            for(Book m:books){
                System.out.println(m.id+ " : " +m.name+ " = " +m.price+ ", author is "+m.author);
            }
    }
}
