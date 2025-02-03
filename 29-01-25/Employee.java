import java.util.*;
public class Employee {
    String name;
    String title;
    int salary;
    void display()
    {
        System.out.println(title+" "+name+" "+salary);
    }
    void increment()
    {
        salary+=5000;
        System.out.println("Increment salary :");
    }
    void yearly()
    {
        salary*=12;
        System.out.println("Yearly salary is :");

    }
    public static void main (String[] arge)
    {
        Employee m1= new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name  :");
        m1.name= sc.nextLine();
        System.out.println("Enter title");
        m1.title= sc.nextLine();
        System.out.println("Enter the salary :");
        m1.salary=sc.nextInt();
        m1.display();
        m1.yearly();
        m1.display();
    }
}