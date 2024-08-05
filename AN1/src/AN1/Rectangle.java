package AN1;
import java.util.Scanner;
public class Rectangle {
	double area(int l,int b){
		return l*b;
		}
		double parameter(int l,int b){
		return 2*(l+b);
		}

		public static void main(String[] args){
		Rectangle myobj=new Rectangle();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the length");
		int le=sc.nextInt();
		System.out.println("Enter the breadth");
		int be=sc.nextInt();
		System.out.println("Area:"+myobj.area(le,be));
		System.out.println("Circumference:"+myobj.parameter(le,be));
	}
}
