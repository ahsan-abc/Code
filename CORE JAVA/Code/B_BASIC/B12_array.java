/*
A array is a container object/elements that holds a fixed number of value of a single type.

the length of an array is established when the array is created , after cretion , its length is fixed .

SYNTAX

data_type [] name = new int [size];
         OR

data_type [] name ; // declaration 
name = new data_type [size]; //intialization
       OR

data_type [] name = {87,90,78,67,90}; //size of this array will be 5

@ 2d ARRAY
  data_type [][] name = new data_type [row ][column];
   ->not nececarry to mention column 







*/


public class B12_array
{
	
	public static void main (String [] args )
	{
		int[] arr = new int[5];
		
		arr[0] = 12;
		arr[1] = 34;
		arr[2] = 40;
		arr[3] = 50;
		arr[4] = 70;
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println("arr [" + i + "] = " + arr[i]);

		}

		int[][] arr2d = new int[3][2]; // not nececarray to mention column size 
		
		arr2d [0][0] = 1;
		arr2d [0][1] = 2;
		arr2d [1][0] = 3;
		arr2d [1][1] =4;
		arr2d [2][0] =5;
		arr2d[2][1] = 6;



		for (int i = 0 ; i<3 ; i++)
		{
			for (int j = 0; j < 2; j++) {
				System.out.print(arr2d[i][j] + " ");
			}

			System.out.println();
		}
		

		
		}
}