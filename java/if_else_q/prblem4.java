package if_else_q;

import java.util.Scanner;

//display  sum of n odd number.
public class prblem4 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a no");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
                sum=sum+i;
            }
        }
    System.out.println("sum="+sum);
    }    
}
