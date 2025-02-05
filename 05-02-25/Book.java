public class Book {
    String tital;
    String author;
    int price;
    public Book()
    {
        tital="math";
        author="rafi";
        price=1000;

    }
    public Book(String t,String a)
    {
        tital=t;
        author=a;
        price=100;
    }
    public Book(String t,String a,int x)
    {
        tital=t;
        author=a;
        price=x;
    }
    public static void main(String[] args)
    {
        Book obj1= new Book();
        Book obj2= new Book("english","sami");
        Book obj3= new Book("bangla","nayeem",500);

        System.out.println(obj1.tital+obj1.author+obj1.price);
        System.out.println(obj2.tital+obj2.author+obj2.price);
        System.out.println(obj3.tital+obj3.author+obj3.price );
    }

}