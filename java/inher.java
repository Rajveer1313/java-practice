import java.lang.*;
public class inher 
{
    public static void main(String arg[])throws Exception
    {
        bbbb obj=new bbbb();
        obj.dispaly();
        
        
    }
    
}
class aaaa
{
    int n;
    void show()
    {
        n=10;
        System.out.println("n="+n);

    }
}
  class bbbb extends aaaa
{
  void dispaly()
      {
        show();
        System.out.println(n);

      }
}
