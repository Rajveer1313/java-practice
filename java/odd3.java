
import java.io.*;
class odd3
{
   public static void main(String arg[])throws Exception
   {
        int n;
        DataInputStream di=new DataInputStream(System.in);
        System.out.print("enter no");
        n=Integer.parseInt(di.readLine());
        if(n%2==1)
        {
            System.out.print("odd");

              for(int i=0;i<=2;i++)
              { 
                                
               
                n=n+2;
                System.out.print("\nodd"+n);
                }
        }
        else{
            System.out.print("even");
        }

   






   }



}