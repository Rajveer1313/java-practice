import java.util.*;
public class bill
 {
         public static void main(String arr[])throws Exception
         {
           String n;
           float a,b,c,sum,per;
           
           Scanner s=new Scanner(System.in);

           System.out.println("your bill");
           System.out.println("enter your name");
             n=s.nextLine();
            System.out.println("enter pencil price");
            a=s.nextFloat();
            System.out.println("enter pen price");
            b=s.nextFloat();
            System.out.println("enter eraser price");
            c=s.nextFloat();
            sum=a+b+c;
            per=0.18f*sum; 
            System.out.println("your bill amt="+sum);
            System.out.println("your per amt="+per);


            



         } 
    

}
