class overload{
    int x,y;
    void display()
    {
        System.out.print("default");
    }
    void display(int x)
    {
        System.out.print("\nadd"+(x+x));
    }
    void display(int x,int y)
    {
        System.out.print("\nadd"+(x+y));
    }

}
public class man
{
    public static void main(String arg[]){
    aaa ob=new aaa();
    ob.display();
    ob.display(10);
    ob.display(10,20);
    }
    
}
