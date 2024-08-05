package AN2;
import java.util.Scanner;
public class FibonacciDemo {
public static void main(String[] args) {
	int p=1;
	int r=0;
	int i=0;
	System.out.print("enter the number");
	Scanner nam=new Scanner(System.in);
	int n=nam.nextInt();
	while(p<n) {
		i=p;
		p=p+r;
		r=i;
		System.out.println(""+p);
	}
}
}
