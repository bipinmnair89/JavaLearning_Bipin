package OOPSConcept2_Inheritance_Overriding;

public class Derived1 extends ParentClass {
	
	public void effortEstimation()	//overridden method
	{
		System.out.println("The effort estimation inside the Derived1 class");
		
		super.viewResults(); //calling the base class method from sub class using super keyword
	}
	
	public static void testMethod()	//overridden method
	{
		System.out.println("Static method in subclass");
	}
	private void testMethod3()
	{
		System.out.println("Private method in base class");
	}
	public void testMethod4()
	{
		System.out.println("protected method changed to public in sub class");
	}
	

}
