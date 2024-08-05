package AN2;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
	 int i,fact=1;  
	  int number; 
	  Scanner obj=new Scanner(System.in);
	  System.out.println("enter the number");
	  int num=obj.nextInt();
	  for(i=1;i<=num;i++){    
	      fact=fact*i;    
	  }    
	  System.out.println("Factorial of "+num+" is: "+fact);    
	}
}
