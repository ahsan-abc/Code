/*
abstract class
-> A class which is declared as abastract is known as an abstarct class
->it can have abstract and non-abstract method.
->There can be no objects of an abstract class, must declare a child for use the abstract class.
->You cannot declare abstract constructors, or abstract static methods.
-> You can declare static methods in abstract class.

Type of variables in abstract class
Abstract class can have final, non-final, static and non-static variables.
Interface has only static and final variables.
*/


abstract class human {
    abstract void print();// abstract method

}

class boy extends human  //extends the abstract human class
{
 
    void print()    // must be overriding
    {
        System.out.println("I am a print function");
    } 

}




/////////////////////-MAIN-///////////////////////////
public class C4_abstract {

 public static void main (String [] args)
 {

     boy b1 = new boy ();
     b1.print();
    
 }


    
}
