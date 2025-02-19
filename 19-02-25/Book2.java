class Author{
    String name;
    String fiction_name;
    public Author(String name,String fiction_name){
        this.name=name;
        this.fiction_name=fiction_name;

    }
    public void writebook()
    {
        System.out.println(this.name+" "+this.fiction_name);
    }
}
public class Book2 {
String tital;
int price;
Author author;
public Book2 (String tital,int price,Author author){
    this.tital=tital;
    this.price=price;
    this.author=author;
}
void display()
{
    System.out.println("Tital"+tital+"price"+price);
    System.out.println("Author"+author.name +"Friction "+author.fiction_name );
}
public static void main(String []arge)
{
    Author author1= new Author("opu","thriler");
    Book2 b1= new Book2("kotha kaj",2300,author1);
    b1.display();
}
}