/*
 Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

The table below shows the primitive type and the equivalent wrapper class:

Primitive Data Type	         Wrapper Class
byte	                     Byte
short	                     Short
int	                         Integer
long	                     Long
float	                     Float
double	                     Double
boolean	                     Boolean
char	                     Character


The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.
Since J2SE 5.0, autoboxing and unboxing feature convert primitives into objects and objects into primitives automatically. The automatic conversion of primitive into an object is known as autoboxing and vice-versa unboxing.

important method

1.valueOf()  // for Autoboxing -> primitive to object
-> static method. 
-> returnn onject refrence of relative wrapper class. 

2.intValue() // for unboxing -> object to primitive 
->instance method.
->return corresponding primitive type.

3.parseint()
->static method
->it return int type value


 */

public class C8_wapper_class {

    public static void main (String [] args)
    {
        int a = 90;
        Integer b = Integer.valueOf(50);

        a = b.intValue();
        System.out.println("a = " + a);

        int k = Integer.parseInt("123");

        System.out.println("k = " + k);


        


    }
    
}
