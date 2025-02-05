public class main05 {
    int x;
    public main05(int y)
    {
        x=y;
    }
    public main05()
    {
        x=5;
    }
    public static void main (String[] args)
    {
        main05 obj1 = new main05(10);
        main05 obj2 = new main05();
        System.out.println(obj1.x);
        System.out.println(obj2.x);
    }
}