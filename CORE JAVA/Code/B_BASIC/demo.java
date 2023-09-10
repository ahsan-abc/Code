import java.util.Scanner;

public class demo
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] b = new boolean[n];
        for (boolean k : b)
        {
            System.out.println(k);
        }
    }
}