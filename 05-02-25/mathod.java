public class mathod
{
    static int sum(int x, int y,int z){
        return x+y+z;
    }
    static float sum  (float x, float y,float z){
        return x+y+z;
    }
    static String sum (String x,String y,String z){
        return x+y+z;
    }
    static int sum(int x, int y){
        return x+y;
    }
    static float sum  (float x, float y){
        return x+y;
    }
    static String sum (String x,String y) {
        return x + y;
    }
    public static void main ( String [] arge){
        int sum1= sum(3,8);
        float sum2 = sum(5.32f,7.54f);
        String sum3= sum("you are ","good boy");
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        int sum4= sum(3,8,10);
        float sum5 = sum(5.32f,7.54f,7.38f);
        String sum6= sum("you are ","good boy","in the class");
        System.out.println(sum4);
        System.out.println(sum5);
        System.out.println(sum6);
    }

}