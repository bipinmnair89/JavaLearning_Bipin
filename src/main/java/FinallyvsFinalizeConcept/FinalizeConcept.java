package FinallyvsFinalizeConcept;

public class FinalizeConcept {
	
	public void finalize() // used for garbage collection
	{
		System.out.println("Finalize method called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalizeConcept f1=new FinalizeConcept();
			
		f1.finalize();
		
		System.out.println("Going to call garbage collector");
		System.gc();
			

	}
	
	

}
