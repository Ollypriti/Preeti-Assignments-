package AN1;
import java.util.Scanner;
public class Circle {
	double area(int a){
	return 3.14*a*a;
	}
	double circumference(int a){
	return 2*3.14*a;
	}

	public static void main(String[] args){
	Circle myobj=new Circle();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius");
	int r=sc.nextInt();
	System.out.println("Area:"+myobj.area(r));
	System.out.println("Circumference:"+myobj.circumference(r));
}
}