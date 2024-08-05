package AN3;
import java.util.Scanner;
public class EvenOdd {
	public EvenOdd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array element");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Oddsum os = new Oddsum();
		int sum=os.sum(n, arr);
		System.out.println("Sum of odd elements in arrayis:"+sum);
	}
}
