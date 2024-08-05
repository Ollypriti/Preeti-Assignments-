package AN2;
import java.util.Scanner;
public class PrimeNumber1 {
public static void main(String[] args) {
	int i =0;
    int num =0;
    //Empty String
    String  primeNumbers = "";
    System.out.println("enter the number");
    Scanner nav =new Scanner(System.in);
    int n=nav.nextInt();

    for (i = 1; i <= n; i++)         
    { 		  	  
       int counter=0; 	  
       for(num =i; num>=1; num--)
	  {
          if(i%num==0)
	     {
		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
    }	
    System.out.println("Prime numbers are :");
    System.out.println(primeNumbers);
}
}
