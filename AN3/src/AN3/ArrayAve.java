package AN3;

import java.util.Scanner;

public class ArrayAve {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the array size");
		 int size=obj.nextInt();
		int arr[] = new int [size];
		int i, sum = 0;
		int ave=0;
		
		System.out.println("Enter the element of array");
		for(i=0; i<size; i++ ) {
				arr[i]=obj.nextInt();
		 sum= sum+arr[i];
		 ave= sum/size;
		}
		System.out.println("Sum of array is:"+sum);
		System.out.println("Sum of array is:"+ave);

	}

}
