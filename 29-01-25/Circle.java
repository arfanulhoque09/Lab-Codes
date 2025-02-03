import java.util.*;
import java.lang.Math;
public class Circle{
    double area(double r)
    {
        double x= r*r*Math.PI;
        return x;
    }
    void display(Double x)
    {
        System.out.println(x);
    }
    double perimeter (double r)
    {
        double x = 2*Math.PI*r;
        return x;
    }
    public static void main(String[] arge)
    {
        Circle c1 = new Circle();
        Scanner sc =new Scanner (System.in);
        double r = sc.nextDouble();
        double x =c1.area(r);
        c1.display(x);
        double y= c1.perimeter(r);
        c1.display(y);
    }
}