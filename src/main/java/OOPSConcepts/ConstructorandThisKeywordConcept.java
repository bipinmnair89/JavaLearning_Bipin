package OOPSConcepts;

public class ConstructorandThisKeywordConcept {
	
	/*Constructor is property of class to assign values to global variables
	 * Constructor must have same name as classname and no return type
	 * Constructor can be default and parameterized constructors
	 * Constructor is called when an object of class is created
	 * Constructors can be overloaded (same name, diff parameters) as shown below
	 * this keyword is used to initialize the global variables
	 * if the name of global and local variables are diff then this keyword is not required
	 */
	
	int serialNumber; //global variables
	String carMaker;
	static String carName;
	String fuelType;
	int mileage;
	
	public ConstructorandThisKeywordConcept()
	{
		System.out.println("This is the default Constructor");
	}
	public ConstructorandThisKeywordConcept(String carMaker, String carName, String gasType) //parameterised constructor
	{
		this.carMaker=carMaker;
		this.carName=carName;
		fuelType=gasType;   //if names are different then no need of this keyword
	}

	public static void main(String[] args) {
		
		ConstructorandThisKeywordConcept obj1=new ConstructorandThisKeywordConcept();
		ConstructorandThisKeywordConcept obj2=new ConstructorandThisKeywordConcept("Kia","Seltos","Hybrid");
		System.out.println("Make :"+obj2.carMaker);
		System.out.println("Model :"+obj2.carName);
		System.out.println("Fuel Type :"+obj2.fuelType);
	}

}
