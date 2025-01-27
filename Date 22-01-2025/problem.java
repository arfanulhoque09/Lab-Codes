public class problem{
    public static void main (String[] args)
    {
        int [] a={5,7,8,11,17,40};
        int sum=0;
        //float avrg=0.00f;
        for(int i=0;i<a.length;i++)

        {
        sum+=a[i];
        }
        System.out.println ("total sum"+sum);
        System.out.println ("avrg"+sum/6);
        for (int i=0;i<a.length;i++){
           if(a[i]%2==0){
               System.out.println(a[i]);
           }
        }
        for (int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.println(a[i]);
            }

        }
        int x=0;
        for(int i=0;i<=100;i++){
            x+=i;
        }
        System.out.println(x);
        int y=25;
        for (int i=0;i<=10;i++){
            System.out.println(y*i);

        }
        int o=7;
        int b=11;
        int c=2;
        if (o>b && o>c)
            System.out.println("largest"+o);
        else if (b>o && b>c)
            System.out.println("largest"+b);
        else
            System.out.println("largest"+c);
    }



}

