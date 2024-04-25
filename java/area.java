import java.util.*;
public class area 
{
      public static void main(String arg[])
      {
        float a;
        float b;

        Scanner x=new Scanner(System.in);
        System.out.print("enter radius");
        a=x.nextFloat();
        b=3.14f*a*a;
        System.out.print("area="+b);
      }
}
