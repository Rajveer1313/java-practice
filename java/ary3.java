import java.util.*;
public class ary3 {
    public static void main(String[] args) {
        int [] marks=new int [5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=4;i++)
        {
            System.out.print("enter a marks ");
            marks[i]=sc.nextInt();

        }
        for(int i=0;i<=4;i++)
        {
            System.out.println("marks are " + marks[i]);
            
        }

    }
    
}
