import java.lang.*;
class show <d1,d2> // A genric class with two genral data type Wrapper class  (must be not primitive) or user define
{
    private d1 var1;
    private d2 var2;

   public void  set (d1 a , d2 b)
    {
        this.var1 = a ;
        this.var2 = b;
    }

    public void get ()
    {
        System.out.println("var1 = "+var1+" , var2 = "+var2);
    }
}

public class basic
{
    public static <e> void print(e b) // generic method  (may or may not be primitive)
    {
        System.out.println(b);

    }
    public static void main (String args [] )
    {
        int a = 10;
        String s = "hello world";

        print(a); // call generic , use perameter integer
        print(s); // call generic , use perameter String

        show <Integer, String> obj = new show <Integer,String>(); // make a obj of show class  that have to data member first integer and second String
        show <Float, Boolean> obj2 = new show <Float, Boolean>();// use same class  make a obj that have to data member first float and second Boolean
        obj.set(4, "hello");
        obj.get();
        obj2.set(5.7f, true);
        obj2.get();

    }
}