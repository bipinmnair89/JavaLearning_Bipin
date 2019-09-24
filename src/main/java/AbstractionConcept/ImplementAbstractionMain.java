package AbstractionConcept;

abstract class ImplementAbstractionMain {
	
	/*Abstract class can have abstract methods,concrete methods,def and para constructors
	 * Abstract class can have main method
	 * An object of abstract class cannot be created
	 * All abstract methods in abstract class must be implemented in the derived class
	 * An abstract method must not have a body and should end with semicolon
	 */
	
	
	public ImplementAbstractionMain() //abstract class constructor
	{
		System.out.println("Abstract class default constructor");
	}
	
	public abstract void credentialsStorage(); //abstract method ending with semicolon
	
	public void verificationMethod() //non abstract method in abstract class
	{
		System.out.println("concrete method in abstract class");
	}
	
	public static void main(String[] args) {
		// an abstract class can have main method
		System.out.println("Main method");
		//ImplementAbstraction obj1=new ImplementAbstraction(); cannot create object of abstract class
	}

}
