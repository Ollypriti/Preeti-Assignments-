package AN3;

import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		Scanner ob= new Scanner(System.in);
		System.out.println("Enter the array size");
		 int size=ob.nextInt();
		int arr[] = new int [size];
		int max= arr[ 0];
		int temp;
		System.out.println("Enter the element of array");
		for(int i=0; i<size; i++ ) {
				arr[i]=ob.nextInt();
		}
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++)
			if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		System.out.print("Ascending Array:");
		for(int i=0; i<size; i++) {
			System.out.println(" "+arr[i]);
		}
	}

}
