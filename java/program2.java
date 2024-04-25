import java.io.*;
import java.lang.*;
public class program2
{
public static void main(String arr[]) throws Exception
 {
   String a,b,e;   
   int x,y,r,p;
    DataInputStream c=new DataInputStream(System.in);
     System.out.print("enter your name");
    e=c.readLine();

    System.out.print("enter your marks");
    a=c.readLine();
    x=Integer.parseInt(a);
    
    System.out.print("enter tottal marks");
    b=c.readLine();
    y=Integer.parseInt(b);
    
    
    System.out.print("percent="+x*100/y);

 }
    
}

