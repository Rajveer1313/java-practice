package if_else_q;
//square or rectrangle

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        int l,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter lenght");
        l=sc.nextInt();
        System.out.print("enter breadth");
        b=sc.nextInt();
        if(l==b)
        {
            System.out.print("square");
        }
        else
        {
            System.out.print("rectrangle");
        }


    }
    
}
