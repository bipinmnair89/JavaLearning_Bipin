package OOPSConcepts;

public class ExceptionHandlingConcept {

	/* Throw keyword is used to throw an exception from within a method
	 * Throws keyword is used to notify method might return an exception and is used with
	 * the method signature
	 * Throwable keyword is the superclass of Exception and error, AND used if an error
	 * is coming
	 * THROW keyword is used to deliberately throw an error
	 */
	
	public void throwableExceptionConcept()
	{
		try {
			int i=10/0;
			System.out.println(i);
		}catch(Throwable e)
		{
			System.out.println("The catch block section");
		}
	}
	
	public void throwsExceptionConcept() throws Exception //JVM will give the exception hierarchy
	{
		int i=10/0;
		System.out.println("Throws concept");
	}
	
	public void throwKeywordConcept()
	{
		try
		{
			throw new Exception("Naveen exception");
			
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("PRINTING");
		}
	}
		
	
	public static void main(String[] args) throws Exception{
		
		ExceptionHandlingConcept obj1=new ExceptionHandlingConcept();
		//obj1.throwableExceptionConcept();
//		obj1.throwsExceptionConcept();
		obj1.throwKeywordConcept();

	}

}
