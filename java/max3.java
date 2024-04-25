import java.util.Scanner;

public class max3 
{
    public static void main(String[] args) {
        
        double a,b,c;
        Scanner s=new Scanner(System.in);

      System.out.println("enter first no");
      a=s.nextDouble();
      System.out.println("enter second no");
      b=s.nextDouble();
      System.out.println("enter third no");
      c=s.nextDouble();

      if (a>b && b>c) 
      {
        System.out.println("a is greater"+ a);
      }
      else if (b>a && b>c) 
      {
        System.out.println("b is greater"+ b);
      }
      else{
        System.out.println("c is graeter");
      }

    }
    
}
