package AbstractionConcept;

public class ClassSupportingInterface implements ImplementInterface1,ImplementInterface2 {

	public void credentialStorage() {

		System.out.println("Credential storage method implemententation");
		
		System.out.println("Rate is "+rate);
		//rate=0;  cannot change value of final variables
		}

	public void launchDetails() {

		System.out.println("launch details method implemententation");
		System.out.println("Make  :"+make);
		String make2="";
		}
	
	public static void main(String[] args) {
		
		ClassSupportingInterface obj1=new ClassSupportingInterface();
		obj1.credentialStorage();
		obj1.launchDetails();
		
	}

}
