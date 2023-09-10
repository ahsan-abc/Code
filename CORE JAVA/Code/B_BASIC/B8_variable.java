/*
# variable
->A variable is a container which holds the value while the Java program is executed. 
  A variable is assigned with a data type.
->Variable is a name of memory location.

->There are three types of variables in java: local, instance and static.



1.local variable
->A variable declared inside the body of the method is called local variable.
->You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.
 
2.instance variable
->A variable declared inside the class but outside the body of method called an instance variable.
->It is called an instance variable because its value is instance(object)-specific and is not shared among instance.

3.Static
->A variable that is declared as static is called a static variable.
->It cannot be local 
->you can create a single copy of the static variables and share it amonge all the instance of the class.
->using static keyword for declaration.

NOTE : java is statically-typed programing laguage .it means all variable must be declard before it use.
        
		It always necessary to assign a value when a local variable is declared.

*/



public class B8_variable
{
	int var ;      // instance variable
	static int var2 ;  // static variable
	public static void main (String [] args )
	{
		int var3 = 90;// local variable
		
		
	}
}




























