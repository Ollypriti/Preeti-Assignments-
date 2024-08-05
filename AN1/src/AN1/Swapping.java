package AN1;

public class Swapping {
	    public static void main(String[] args)
	    {
	        int x = 98, y = 32;
	 
	        System.out.println("Before Swap");
	        System.out.println("x = " + x);
	        System.out.println("y = " + y);
	 
	        // Swapping without three
	        // Variables
	        x = x + y;
	        y = x - y;
	        x = x - y;
	 
	        System.out.println("After swap");
	        System.out.println("x = " + x);
	        System.out.println("y = " + y);
	    }
	
}
