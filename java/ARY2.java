import java.io.*;
public class ARY2 
{
    public static void main(String arg[]) throws Exception
    {
      int sum=0;
      int n[][]=new int[3][3];
      DataInputStream di=new DataInputStream(System.in);
      for(int i=0;i<=2;i++)
      {
        for(int k=0;k<=2;k++)
        {
            System.out.print("enter no");
            n[i][k]=Integer.parseInt(di.readLine());
        }
      }
         for(int i=0;i<=2;i++)
         {
            for(int k=0;k<=2;k++)
              {
                System.out.print("\t"+n[i][k]);
                sum=sum+n[i][k];
              }
              System.out.print("\n");
            
         }
    
           System.out.print("\n sum="+sum);
    }
    
}
