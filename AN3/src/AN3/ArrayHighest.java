package AN3;

import java.util.Scanner;

public class ArrayHighest {

	public static void main(String[] args) {
		Scanner ob= new Scanner(System.in);
		System.out.println("Enter the array size");
		 int size=ob.nextInt();
		int arr[] = new int [size];
		int max= arr[ 0];
		System.out.println("Enter the element of array");
		for(int i=0; i<size; i++ ) {
				arr[i]=ob.nextInt();
		}
		for(int i=0; i<size; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Highest no in array:"+max);
	}
}
