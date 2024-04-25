import java.io.*;

public class ary5 
{
    public static void main(String[] args)throws Exception 
    {
        int sum=0;
        int n[][]=new int[3][3];
        DataInputStream di =new DataInputStream(System.in);


        for(int k=0;k<=2;k++)
        {
            for(int i=0;i<=2;i++)
            {
                System.out.print("enter no");
                n[k][i]=Integer.parseInt(di.readLine());
                
            }
           
        }



        
        for(int k=0;k<=2;k++)
        {
            for(int i=0;i<=2;i++)
            {
               System.out.print("\t"+n[k][i]);
               sum+=n[k][i];
                
            }
            System.out.println("\n");
            
        }
        System.out.println("\n"+sum);
        
    }

    
}