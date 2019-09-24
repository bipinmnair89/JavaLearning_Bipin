package AbstractionConcept;

public class ImplementAbstractionDerived extends ImplementAbstractionMain{
	
	public  void credentialsStorage() //abstract method implemented 
	{
		String userName="Kia";
		String passWord="Seltos";
		System.out.println("Username is :"+userName+" and Password is :"+passWord);
	}
	
	
	public static void main(String[] args) {
		
		//ImplementAbstractionDerived obj= new ImplementAbstractionDerived();
		ImplementAbstractionMain obj1=new ImplementAbstractionDerived();
		obj1.credentialsStorage();

	}

}
