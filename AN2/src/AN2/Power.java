package AN2;
import java.util.Scanner;
public class Power {
public static void main(String[] args) {
	int p=1,i=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the base number");
	int a=sc.nextInt();
	System.out.println("Enter the power number");
	int b=sc.nextInt();
	while(i<b) {
		p=p*a;
		i++;
		
	}
	System.out.println(""+p);
}
}
