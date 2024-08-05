package AN1;
import java.util.Scanner;
public class BasicArithmaticOpreation {
	public static void main(String[] args)
    {
	int a,b,sum,sub,mul,div;
        Scanner obj=new Scanner(System.in);
	System.out.println("enter the first number");
	a=obj.nextInt();
	System.out.println("enter the second number");
	b=obj.nextInt();
	sum=a+b;
	System.out.println("Addition:"+sum);
	sub=a-b;
	System.out.println("Substation:"+sub);
	mul=a*b;
	System.out.println("Multiplication:"+mul);
	div=a/b;
	System.out.println("Division:"+div);
    }
}
