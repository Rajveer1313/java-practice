import java.io.*;
public class multieven 
{
public static void main(String arr[]) throws Exception
{
  int a;
   DataInputStream di=new DataInputStream(System.in);
   System.out.print("enter a no ");
   a=Integer.parseInt(di.readLine());
   
   if(a%2==0)
   {
    System.out.println("even no");
   }
   else 
   {
    System.out.print("odd no.");
   }


}  
}
