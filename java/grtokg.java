import java.io.*;
public class grtokg 
{
    public static void main(String[] args) throws Exception
    {
        double kg,gr;

        DataInputStream di= new DataInputStream(System.in);
        System.out.print("enter grams");
        gr=Double.parseDouble(di.readLine());
        kg=gr/1000;
        System.err.print("\n"+kg);

        
    }
    
}
