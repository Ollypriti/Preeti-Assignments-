package AN1;
public class Equation{
	   
	  public static void main(String[] args) {
		  int a = 6;
		  int b = -18;
		  int c = -3;
		  float d = 2*a;
		  float q1 =(float) ((-b) + Math.sqrt ((b*b)- (4*a*c)));
		  float q2 =(float) ((-b) - Math.sqrt ((b*b)- (4*a*c)));
		  float f1 = q1/d;
		  float f2 = q2/d;
		  System.out.print("factor:"  +f1);
		  System.out.print("factor:" +f2);
}
}