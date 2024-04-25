import java.io.*;
import java.lang.*;
public class program 
{
 public static void main(String arr[]) throws Exception
 {
   String a,b;   
   int x,y;
    DataInputStream c=new DataInputStream(System.in);

    System.out.print("enter the no first");
    a=c.readLine();
    x=Integer.parseInt(a);
    
    System.out.print("enter the no second");
    b=c.readLine();
    y=Integer.parseInt(b);
    
    System.out.print("add="+5(x+y));

 }
    
}
