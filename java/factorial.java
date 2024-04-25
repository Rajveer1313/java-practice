import java.io.*;
import java.lang.*;
class factorial
{public static void main(String arg[])throws Exception
    {
        int n,factor=1;

        DataInputStream di=new DataInputStream(System.in);
        System.out.print("enter no");
        n=Integer.parseInt(di.readLine());

        for(int i=1;i<=n;i++)
        {
            factor=factor*i;
        }

       System.out.print("factor="+factor);
    }



}
