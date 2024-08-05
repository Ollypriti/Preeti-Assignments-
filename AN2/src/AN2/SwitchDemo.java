package AN2;
import java.util.Scanner;
public class SwitchDemo {
public static void main(String[] args) {
	System.out.println("1.Circle");
	System.out.println("2.Rectangle");
	Scanner s =new Scanner(System.in);
	System.out.println("enter the choise");
	int ch1=s.nextInt();
	switch(ch1)
	{
			case 1:
			System.out.println("Enter the radius");
			int r=s.nextInt();
			System.out.println("Enter the choise");
			System.out.println("1.Area");
			System.out.println("2.Circumference");
			int ch2=s.nextInt();
			switch(ch2) 
			{
			case 1:
				float area= (float) 3.14*r*r;
				System.out.println("Area of circle"+area);
				break;
			case 2:
				float cir= (float) 3.14*2*r;
				System.out.println("circumference of circle"+cir);
				break;
		
	        }
			break;
			case 2:
				System.out.println("Enter the length");
				int l=s.nextInt();
				System.out.println("Enter the width");
				int b=s.nextInt();
				System.out.println("Enter the choise");
				System.out.println("1.Area");
				System.out.println("2.perimeter");
				int ch3=s.nextInt();
				switch(ch3) {
				case 1:
					float recarea= (float) l*b;
					System.out.println("Area of rectangle"+recarea);
					break;
				case 2:
					float recperi= (float) (l+b)*2;
					System.out.println("Perimeter of rectangle"+recperi);
				}
				
				
	}
}
		
}
