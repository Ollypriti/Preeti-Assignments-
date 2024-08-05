package AN3;

import java.util.Scanner;

public class ArraySumSub {

	public static void main(String[] args) 
	{
		int arr[][] = new int [2][2];
		int arr1[][] = new int [2][2];
		int r = 0;
		int c = 0;
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first matrix elements:");
		for(r=0; r<2; r++)
		{
			for(c=0; c<2; c++)
			{
				arr[r][c]= sc.nextInt();
			
		}
	}
		
		System.out.println("Enter the second matrix elements:");
		for(r=0; r<2; r++) 
		{
			for(c=0; c<2; c++)
			{
				arr1[r][c]= sc.nextInt();
			
		}
	}
		System.out.println("Sum of Array");
		int sum=0;
		for(r=0; r<2; r++)
		{
			for(c=0; c<2; c++)
			{
				
		sum=arr[r][c]+arr1[r][c];
		System.out.print(" "+sum);
		
			}
			System.out.println("\n");
		
		}
		System.out.println("Sub of Array");
		int sub=0;
		for(r=0; r<2; r++)
		{
			for(c=0; c<2; c++)
			{
				
		sub=arr[r][c]+arr1[r][c];
		System.out.print(" "+sub);
		
			}
			System.out.println("\n");
		
		}
		
		
			}
			
}
	



