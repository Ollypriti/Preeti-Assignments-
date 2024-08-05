package AN2;
import java.util.Scanner;
public class AcceptSubject {
public static void main(String[] args) {
	int fs =0;
	Scanner rev=new Scanner(System.in);
	System.out.println("Enter the marks of 1 subject");
	int a=rev.nextInt();
	System.out.println("Enter the marks of 2 subject");
	int b=rev.nextInt();
	System.out.println("Enter the marks of 3 subject");
	int c=rev.nextInt();
	System.out.println("Enter the marks of 4 subject");
	int d=rev.nextInt();
	System.out.println("Enter the marks of 5 subject");
	int e=rev.nextInt();
	System.out.println("Enter the marks of 6 subject");
	int f=rev.nextInt();
	int sum= a+b+c+d+e+f;
	System.out.println("Sum:"+sum);
	float per= ((sum*100)/600);
	System.out.println("Persentage"+per);
	if(a>=40) {
		fs++;
	}
	if(b>=40) {
		fs++;
	}
	if(c>=40) {
		fs++;
	}
	if(d>=40) {
		fs++;
	}
	if(e>=40) {
		fs++;
	}
	if(f>=40) {
		fs++;
	}
	if(fs<3)
	{
		System.out.println("Result: Failed");
	}
	else if(fs>0 && fs<=3)
	{
		System.out.println("Result: KT");
	}
	else {
		System.out.println(" Result: Passed");
	}
}
}
