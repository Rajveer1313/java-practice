import java.io.*;
public class kmto
 {
    public static void main(String arr[])throws Exception
    {
          double km;
          double miles;
          DataInputStream di=new DataInputStream(System.in);
            System.out.println("Enter kilometer");
            km=Double.parseDouble(di.readLine());
            miles=km/1.6093;
            System.out.println("miles="+miles);
            

    }
}
