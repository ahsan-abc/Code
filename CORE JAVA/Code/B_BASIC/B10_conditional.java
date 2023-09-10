/*
  1.if 
  2.if-else 
  3.if- else ladder 
  4.switch statement
  5.ternary oprator

 */


public class B10_conditional {
    

    public static void main (String [] args )
    {
        if (true) // in if case 
        {
            System.out.println("in if statment");
        }
        if(false)        // if else ladder
        {
            System.out.println("in if statment");
        }
        else if (true) {
            System.out.println("in else if");

        }
        else
        {
            System.out.println("in else");
        }
        int a = 1;
       
         switch(a)  // switch case
         {
             case 1:
                 System.out.println(" I am in case 1");
            
             case 2:
                 System.out.println("in case 2");

            default : System.out.println("in defalut case ");
         }
          
        a = 100;
         int b;
         b = (a == 100 ? 2 : 0); // using ternary operator
        
         System.out.println("a = " + a + " , b = " + b);

         

            

    }
}
