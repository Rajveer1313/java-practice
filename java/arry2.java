import java.io.DataInputStream;

public class arry2 
{
    public static void main(String[] args) throws Exception {
        
        int num[][]=new int[3][3],sum=0;
        DataInputStream di=new DataInputStream(System.in);

        for(int i=0 ;i<=2;i++)
        {
            for(int k=0;k<=2;k++)
            {
                System.out.print("enter a number");
                num[i][k]=Integer.parseInt(di.readLine());

            }
        }
        for(int i=0; i<=2;i++)
        {
            for(int k=0;k<=2;k++)
            {
                  System.out.print(num[i][k]+"\t");
                  sum=sum+num[i][k];
             
            }
            System.err.print("\n");
           
        }
        System.err.println("sum="+sum);
    }
}
    

