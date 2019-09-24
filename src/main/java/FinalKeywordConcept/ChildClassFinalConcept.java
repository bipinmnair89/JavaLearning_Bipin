package FinalKeywordConcept;

public class ChildClassFinalConcept {
	
	//extends ParentClassFinalConcept will not work as the parentclass is final
	
	public final void conditionCheck() //if we make parent class as non final and 
									   //inherit the parent class from subclass then
									   // then the override function will throw error
	{
		System.out.println("Trying to override");
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Main method");
	}

}
