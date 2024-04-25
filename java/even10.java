import java.io.*;
import java.util.*;
public class even10 
{
    public static void main(String[] args) throws Exception
    {
        int r;
        DataInputStream di=new DataInputStream(System.in);
        System.out.print("enter range");
        r=Integer.parseInt(di.readLine());
        
        for(int i=1;i<=r;i++)
        {
            if(i%2==0)
            {
                System.out.print("\n"+i);
            }
        }
        
        
    }
    
}
