/*
oop key fetaure

1.Inheritence
->Inheritance means creating new classes based on existing ones 
->It is a mechanism in java by which one class allowed to inherit the features(fileds , mrthod, variable) of anoter class.
->A class that inherits from another class can reuse the method and fileds of that class . in addition , you can add
new fileds and method to your current class as well.
-> not inherit constructor.
->using extends keyword for inheritence.

2.Polymorphism
-> polymorphism in java is a concept by which we can perform a single action in diffrent ways.
-> poly means many and morphis means forms.
->there are two types of polymorphism 
   (a)Compile time/static polymorphism
   ->achieved via method overloading 
   (b)Runtime/Dynamic polymorphism
   ->achieved via method overriding

3.Encapsulation
-> Encapsulation in java is a process of wrapping code (method ) and data (variable) together into a single unit.
-> Encapsulation in java can be achived by 
   (a) Declaring variable of a class as private.
   (b) Providing public set and get methods to modify and views the variables values.

4.Abstraction
->Abstraction is a process of hiding implementation details.
-> In java abstraction achieved by interfaces and abstract classes.

5.Data hiding
->Data hiding means hiding teh internal data access to class member within the class prevent its direct access  from   outside the class.
->in java data hiding achieved by access modifiers , and declaring the class filed(data member) private and providing public get and set method to access and modify teh filed values. 
 */

class Calculation {

    public int sum(int a, int b) //Polymorphism method overloading
    {
        return (a + b);
    }

    public int sum(int a, int b, int c) //Polymorphism method overloading
    {
        return (a + b + c);
    }

    public void print ()
    {
        System.out.println("I am  calculation class method");
    }

    Calculation ()
    {
        System.out.println("I am constructor of Calculation class");
    }
}
 
class Float_calculation  extends Calculation  // Inheritence
{
    public void print () //overriding the print function of parent class
    {
        System.out.println("I am in Float_calculation class method");
    }

   
    
}

/////////////////// Main /////////////////////////////////////
public class C3_key_feature_oop {
  
    public static void main (String [] args)
    {
        Calculation c = new Calculation();

        System.out.println("addition of two number 45 + 55 = "+c.sum(45, 55));
        System.out.println("addition of three number 45 + 55 + 100 = " + c.sum(45, 55, 100));
        
        Float_calculation f = new Float_calculation();

        c.print();
        f.print();

        

        

    }






 }

 