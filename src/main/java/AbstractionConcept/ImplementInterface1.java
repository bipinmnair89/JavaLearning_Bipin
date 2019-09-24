package AbstractionConcept;

public interface ImplementInterface1 {
	
	/*All methods in an interface are abstract by default
	 * All variables in an interface is static final and public
	 * All methods in an interface are also public
	 * A class can implement multiple interfaces using using Implements keyword
	 * and hence overcomes the problem of multiple inheritance in java
	 * The class implementing interface must have all the methods 
	 * variables in an interface can be accessed by class implementing the interface directly
	 */
	
	int rate=10;		//variables must be initialized and are static final and public
	public void credentialStorage(); //all methods are abstract and final
		
}
