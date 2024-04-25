import java.io.*;
import java.lang.*;

import javax.lang.model.util.ElementScanner14;
public class program3
 {
  public static void main(String arr[]) throws Exception 
  {
    int a;

    DataInputStream di=new DataInputStream(System.in);

    System.out.print("enter your number");
    a=Integer.parseInt(di.readLine());

    if(a<=9)
    {
        System.out.print("single digit");
    }
    else if(a>9 && a<=99)
    {
        System.out.print("double digit");
    }
   else
  {
    System.out.print("three digit");
  }
  }
  

    

}
