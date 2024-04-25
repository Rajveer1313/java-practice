import java.util.*;
import java.lang.*;

public class taxx
{
   public static void main(String arr[]) throws Exception
   {
      String pname;
      double rate,qty,amt,tax,disc,netamt;

      Scanner s=new Scanner(System.in);

      System.out.println("enter the following");
      
      System.out.println("enter the product name");
        pname=s.nextLine();

        System.out.println("enter the product rate");
        rate=s.nextDouble();

        System.out.println("enter the product quantity");
        qty=s.nextDouble();

           amt=rate*qty;
        System.out.println("total product amount"+ amt);
        
               if(amt<1000)
               {
                     disc=(amt*4.7)/100;
                     tax=(amt*3.9)/100;
               }
               else
               {
                disc=(amt*7.5)/100;
                tax=(amt*5.9)/100;
               }
               netamt=amt+tax-disc;

       
               System.out.println("discount"+ disc);
               System.out.println("tax"+ tax);
               System.out.println("net amount"+ netamt);
               

      


   }
    

}
