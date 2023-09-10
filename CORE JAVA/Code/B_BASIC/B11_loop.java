/*
1.while loop
2.do-while loop
3.for loop
4.foreach loop // use for acces array all element

note:
 continue- loop again start
 break - break the loop


 */

public class B11_loop {

    public static void main (String args [])
    {
        int a = 1;
        while (a<=10)
        {
            System.out.print(a + " ,");
            a++;
        }
        System.out.println();
       a=1;
       do {
           System.out.print(a + " ,");
           a++;

       }
     
       while (a <= 10);
       System.out.println();
        
        for (int i =1 ; i<=10 ; i++)
        {
            System.out.print(i + " ,");
        }
        System.out.println();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        
        for(int k : arr)
        {
            System.out.print(k + " ,");
        }




    }
    
}
