/*Multiple inheritance is not available in java.
the solution of this problem use interface.

->Interface is like class but not completely. 
->it is like an abstract class.
->By default functions are public and abstract in interface,variables are final and static by default in interface.
 

NOTE :
interface can extends other interface but not class
class can't extends interface , class implements the interface.
 */


interface printable
{
    int min = 90; // this is look like after compilation -> public static final int min = 50; 

    void print();
    // this is look like after complilation -> public abstract void print();

 }

class demo implements printable
{
   public void print()
   {
       System.out.println("I am in print function ");

  } 

}






/////////////////MAIN ///////////////////////////
public class C5_interface {

    public static void main (String [] args)
    {
        demo d1 = new demo();
        /*we can use make reference interface  but object  class
         * like this  interface_name obj = new class_name ();
         * then we can accese only which mehtod that mention in interface
         */

        d1.print();


    }
    
}
