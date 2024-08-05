package AN2;
import java.util.Scanner;
public class PalindromeDemo {
	public static void main(String[]agrs) {
	int r,sum=0,temp;    
	  int num;
	  System.out.println("enter the number");
	  Scanner name = new Scanner(System.in);
		int n=name.nextInt();
		  //tempt stores the original value of n
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }
	
	  if(temp==sum)    
	   System.out.println("palindrome number ");    
	  else    
	   System.out.println("not palindrome");    
	}
}
