package AN2;
import java.util.Scanner;
public class StudentArray {
public static void main(String[] agrs) {
	//dt var[] = new dt[size];
	int marks[] = new int[6];
	int i; //loop counter
	int tot=0;
	int fs=0;
	float per;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter 6 subject marks(out of 100)");
	for(i=0; i<6; i++) {
		marks[i] =sc.nextInt();
		tot =tot + marks[i];		
	}
	per=(float)((tot/600)*100);
	for(i=0; i<6; i++) {
		if(marks[i]<40) {
			fs=fs+1;
		}
	}
	if(fs>3) {
		System.out.println("Result: Failed");
	}
	else if(fs>0 && fs<=3) {
		System.out.println("Result: KT");
	}
	else {
		System.out.println("Result: Passed");
	}
}
}
