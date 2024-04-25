import java.util.*;


public class average
{
   public static void main(String arr[])
   {
     int a,b,c,sum,avg;
      
     Scanner x=new Scanner(System.in);
     System.out.print("enter 3 no");
       a=x.nextInt();
       b=x.nextInt();
       c=x.nextInt();
       sum=a+b+c;
       avg=sum/3;
       System.out.print("average="+avg);
       if(avg<10)
       {
        System.out.print("fail");

       }
       else
       {
        System.out.print("pass");
        
       }
   }
    

}
