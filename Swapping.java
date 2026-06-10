package bank;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20;
	       System.out.println("Before Swapping:");
	       System.out.println("a = " + a + ", b = " + b);
	       // Swapping logic
	       a = a + b; // a becomes 30
	       b = a - b; // b becomes 10
	       a = a - b; // a becomes 20
	       System.out.println("After Swapping:");
	       System.out.println("a = " + a + ", b = " + b);
	   }
	

	}


