package if_else_q;

import java.util.Scanner;

public class problem1 {
    //vowel or consonant
    public static void main(String[] args) {
        char s;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a character");
        s=sc.next().charAt(0);
          
        if(s=='a' || s=='e'|| s=='i'||s=='o'|| s=='u' ||s=='A' || s=='E'|| s=='I'||s=='O'|| s=='U' )
        {
            System.out.println("vowel");

        }
        else
           System.out.println("consonant");
        

    }
    
}
