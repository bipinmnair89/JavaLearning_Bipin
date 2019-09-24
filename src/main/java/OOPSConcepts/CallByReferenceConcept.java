package OOPSConcepts;

public class CallByReferenceConcept {
	
	/*Here in call by ref, both the actual and formal parameters refer to the same memory
	 * location and hence after swap method is called the value of a and b changes * 
	 */
	
	int a;
	int b;

	public static void main(String[] args) {
		
		CallByReferenceConcept c1=new CallByReferenceConcept();
		c1.a=10;
		c1.b=20;
		c1.swap(c1);
		
		System.out.println("After swapping(outside method) the value of a "+c1.a);
		System.out.println("After swapping(outside method) the value of b "+c1.b);
		

	}
	public void swap(CallByReferenceConcept p)
	{
		int temp=p.a;
		p.a=p.b;
		p.b=temp;
		
		System.out.println("After swapping(inside method) the value of x "+p.a);
		System.out.println("After swapping(inside method) the value of y "+p.b);
	}
}
