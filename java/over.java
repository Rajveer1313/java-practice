class aaa
{
   int n,a,b;
    aaa()
    {
        System.out.print("\ndefault");
    }
    aaa(int n)
     {
        System.out.print("\nadd"+(n+n));
     }
     aaa(int a,int b)
     {
        System.out.print("\nadd"+(a+b));
     }
}
class over
{
    public static void main(String arg[])
    {
        aaa ob=new aaa();
        aaa ob2=new aaa(10);
        aaa ob3=new aaa(10,20);
    }
}