public class mycode {
    int modelYear;
    String modelName;
    public mycode(int year, String name)
    {
        modelYear= year;
        modelName= name;
    }
    public static void main(String[] args)
    {
        mycode mycar =  new mycode(1990,"BMW");
        System.out.println(mycar.modelYear+ " "+ mycar.modelName);

    }
}