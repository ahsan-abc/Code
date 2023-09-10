
/*
  class - class is blueprint of object 
   
  object - real entity
  
  constructor 
  -> constructor is  a special type of method , it automatic call when object created.
  -> it name same as class name
  -> java doesn't have distructor.

 */
import java.util.Scanner;


class Student  //creating a class
{
    public String name;  // properties of class
    public int roll;
    public int clas;

    public void print ()
    {
        System.out.println("Name = " + name);
        System.out.println("Roll = " + roll);
        System.out.println("class = " + clas);

    }

    public void get ()      // method/fuction of class 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name - ");
        name = sc.nextLine();
        System.out.println("Enter your class - ");
        clas = sc.nextInt();
        System.out.println("Enter your roll - ");
        roll = sc.nextInt();
        sc.close();
    }
    
    Student  ()  // creating  a constructor
    {
        System.out.println("i am a constructor");
    }


}

/////////////////////MAIN/////////////////////////

public class C1_class 
{

    public static void main (String [] args)
    {
        Student s1 = new Student(); //creating  a object of the student class
        /*OR
          Student s1 ; // s1 is refrence variable of Student
          s1 = new Student(); // assign with object 
         */

        s1.get();
        s1.print();
        

    }
}