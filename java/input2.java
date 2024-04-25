import java.lang.*;
import java.io.*;


public class input2 {
    public static void main(String arr[]) {
        String a;
        int b;
        try {
            DataInputStream x=new DataInputStream(System.in);

            System.out.print("enter int no");
            a=x.readLine();
            b=Integer.parseInt(a);
            System.out.print("no=" + b);

        } catch (Exception ex) {
        }
    }
}