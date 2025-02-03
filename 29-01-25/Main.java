import java.util.*;
public class Main {
    String fname;
    String lname;
    int age ;
    void insertData(String a,String b,int c)
    {
        fname= a;
        lname= b;
        age = c;
    }
    void display()
    {
        System.out.println(fname +" "+ lname+" "+ age);
    }

  public static void Main(String [] arge)
    {
        Main p1 = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name :");
        p1.fname=sc.nextLine();
        System.out.println("Enter your last name :");
        p1.lname=sc.nextLine();
        System.out.println("Enter your age:");
        p1.age=sc.nextInt();
        p1.display ();

       // System.out.println(p1.fname + p1.lname + p1.age);


//        Main p2 = new Main();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your first name :");
//        p2.fname=sc.nextLine();
//        System.out.println("Enter your last name :");
//        p2.lname=sc.nextLine();
//        System.out.println("Enter your age:");
//        p2.age=sc.nextLine();
//        System.out.println(p2.fname + p2.lname + p2.age);

    }
}