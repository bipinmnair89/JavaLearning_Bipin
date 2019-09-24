package OOPSConcept2_Inheritance_Overriding;

public class ParentClass {
	
	public void websiteLoginFunctionalities()
	{
		System.out.println("List of login functionalities to be covered");
	}
	
	public void effortEstimation()
	{
		System.out.println("The effort estimation inside the Parent class");
	}
	
	public void viewResults()
	{
		System.out.println("Test method invoked using super keyword from subclass");
	}
	
	public static void testMethod()
	{
		System.out.println("Static method in base class");
	}
	
	public final void testMethod2()
	{
		System.out.println("Final method in base class");
	}
	private void testMethod3()
	{
		System.out.println("Private method in base class");
	}
	protected void testMethod4()
	{
		System.out.println("protected method in base class");
	}
	
	
}
