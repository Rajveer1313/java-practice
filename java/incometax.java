import java.util.*;
import java.lang.*;

public class incometax 
{
  public static void main(String arr[])
 {
    double salary,tax;
     Scanner s=new Scanner(System.in);
     System.out.println("enter your salary");
     salary=s.nextDouble();
     
     
     if (salary<500000)
     {
        System.out.println("no tax");
     }
    else if(salary>500000 && salary<1000000){
               System.out.println("tAX IS 20%");
                tax=salary*0.2;
                System.out.println("tax is"+tax);
                System.out.println("your salary is after tax "+(salary-tax));
    }
    else{
        System.out.println("tax is 30%");
        tax=salary*0.3;
        System.out.println("tax is"+tax);
        System.out.println("your salary is after tax "+(salary-tax));

    }
  }
    






}
