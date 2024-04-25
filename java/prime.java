import java.util.Scanner;

public class prime
{
    public static void main(String[] args) {
        int a,i;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number");
        a=sc.nextInt();

        for( i=2;i<a;i++)
        {
            if(a%i==0) 
            {
                System.out.println(" not  prime");
                break;
            }
        }
        if (i==a)
        {
            System.out.println("prime");
        }

    }
    
}
