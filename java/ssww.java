import java.lang.*;
import java.io.*;


public class ssww
 {

    public static void main(String arg[]) throws Exception
    {
        int a,ch;
        
        DataInputStream di=new DataInputStream(System.in);
        System.out.print("enter your no");
        a=Integer.parseInt(di.readLine());
        System.out.print("1.square\n 2.cube\n 3.addition\n enetr your choice");
           ch=Integer.parseInt(di.readLine());

        switch (ch)
        {
            case 1:
            System.out.print("square="+(a*a));
               break;
            case 2:
            System.out.print("cube="+(a*a*a));
               break;
             case 3:
             System.out.print("addition="+(a+a));
                 break;
             default :
             System.out.print("wrong choice");

        }

    }
    
}
