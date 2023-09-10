/*
#Data types
->Data types specify the different size and value that can be stored in the variable.
->There are two types of data types in java.
    (A) primitive data type
    (B) Non-primitive data type 
 

(A)Primitive data types
 -> In Java language, Primitive data types are the building blocks of dafa manipulation. These are the most basic language 
    are the types avaliable in java
  • There are 8 primitive data type supported by the java programing
 (i) byte
  -> • 8 bit signed two's complement integer, 
     • use to Store Small integer value 
	 • value-range → -128 to 127 
     • default value 0
   
 (ii) short
  -> • 16 but signed two's complement integer. 
     • Value - Hange → -32,768 to 32,767.
     • default value → 0
	 
 (iii) int
  -> • 32 bit signed two's complement integer. 
     • Value-range -> -2^31 to (2^31 -1 )
     • default Value 0
 (iv) long
  -> • 64 Bit two’s complement 
     • value-range → -(2^63) to (2^63-1)
	 • Default value 0L
     • always use L in the last of the value

  (v) float
  -> • single-precision 32bit IEEE 754 floating point 
     • value-range → 3.4e-38 to 3.4e+38
	 • Default value 0.0f
     • always use f in the last of the value

 (vi) double
  -> • double-precision 64bit IEEE 754 floating point 
     • value-range → 1.7e-308 to 1.7e+308
	 • Default value 0.0d
     • always use f in the last of the value
	 
  (v) char 
  -> • single 16 bit unicode 
     • use to store single character
     • default value → white space
  (vi) boolean
  -> • the boolean data type is used to stored only two possible , true or false. 
     • it size can't defined precisely
	 • defalut value → false
	 
(A)Primitive data types
 -> Unlike primitive data types, these are not predefined. These are user-defined data types created by programmers. 
    These data types are used to store multiple values.
 -> non-primitive data type variable is also reference variable.
 ->An object reference variable lives on the stack memory and the object to which it points always lives on the heap memory. 
   The stack holds a pointer to the object on the heap.
 ->The default value of any reference variable is null.
  
*/



public class B5_data_type
{   static byte byte_;
   static  short short_;
	static int int_;
	static long long_;
	static float float_;
	static double double_;
    static char char_;
    static boolean boolean_;
	public static void main (String [] args)
	{
		System.out.println(" byte defalut value "+byte_);
		System.out.println(" short value "+short_);
		System.out.println(" int defalut value "+int_);
		System.out.println(" long defalut value "+long_);
		System.out.println(" float defalut value "+float_);
		System.out.println(" double defalut value "+double_);
		System.out.println(" char defalut value "+char_);
		System.out.println(" boolean defalut value "+boolean_);
		
		
	}
	
}