class Employe {
    protected int ID=157;
    String name="opu";
    String joining_date="11-01-2024";
    public void display()
    {
        System.out.println(name+" "+ID+" "+joining_date);
    }
}
class HR extends Employe{
    double salary=50000.00;
    public void display()
    {
        System.out.println("my salary is"+salary);
    }
}
class software_eng extends Employe {
    double salary = 24000.00;

    public void display()
    {
        System.out.println("your salary is"+salary);
    }

}
class Main4{
    public static void main(String[] arge)
    {
        HR hr=new HR();
        software_eng sof= new software_eng();
        System.out.println("HR Employe");
        hr.display();
        System.out.println("software Employe");
        sof.display();
        
    }
}