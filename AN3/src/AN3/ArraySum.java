package AN3;
import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the array size");
		 int size=obj.nextInt();
		int arr[] = new int [size];
		int i, sum = 0;
		
		
		System.out.println("Enter the element of array");
		for(i=0; i<size; i++ ) {
				arr[i]=obj.nextInt();
		 sum= sum+arr[i];
		}
		System.out.println("Sum of array is:"+sum);
		
	}

}
