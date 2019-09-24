package OOPSConcepts;

public class CallByValueConcept {
	
	/* Here instead of passing values directly in c1.add, we are passing the variables
	 * Also in call by value the actual parameter value is copied to formal parameter
	 * and hence both occupy different memory location and hence values are not changed inside
	 * main method for a and b even after calling the swap method.
	 */
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		CallByValueConcept c1= new CallByValueConcept();
		c1.swap(a,b);	//the parameters passed to function are called actual parameters
		
		System.out.println("After swapping(outside method) the value of a "+a);
		System.out.println("After swapping(outside method) the value of b "+b);
	}
	public void swap(int x, int y) //the parameters received by function are called formal parameters
	{
			
		int z=x; //now z is 10
		x=y; 	 //now x is 20
		y=z;	 //now y is 10
				
		System.out.println("After swapping(inside method) the value of x "+x);
		System.out.println("After swapping(inside method) the value of y "+y);
		
		
	}
}
