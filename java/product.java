import java.util.*;

import javax.print.attribute.TextSyntax;

public class product 
{
    public static void main(String arr[])
    {
        String name;
        double rate,qty,total,netamt,tax,dic;
          
         Scanner sc=new Scanner(System.in);
            System.out.print("enter product name");
            name=sc.nextLine();
         
            System.out.print("enter the rate of product");
             rate=sc.nextDouble();

             System.out.print("enter quantity");
                 qty=sc.nextDouble();

                total=rate*qty;
                

                if(total<1000)
                {
                    dic=(total*4.7)/100;
                    tax=(total*3.9)/100;

                }
                else{
                    dic=(total*7.9)/100;
                    tax=(total*5.9)/100;

                }
                netamt=(total+tax)-dic;
                
                System.out.println("total="+total);
                System.out.println("dic="+dic);
                System.out.println("tax="+tax);
                System.out.println("netamt="+netamt);



                  
    }
}