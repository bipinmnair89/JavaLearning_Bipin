package FinallyvsFinalizeConcept;

public class FinallyBlockConcept {
	
	/*finally keyword is used to execute even after the execution stops.
	 * finally block will always get executed
	 * only if System.exit(0) is given in the catch block, finally block fails to execute
	 */

	public static void main(String[] args) {
		
		FinallyBlockConcept f1=new FinallyBlockConcept();
		f1.testMethod();
		
	}
	
	public void testMethod()
	{
		try
		{
			int x=10;
			int y=x/0;
		}catch(Exception e)
		{
			System.out.println("Arithmetic exception");
			e.printStackTrace();
//			System.exit(0);
		}
		finally
		{
			System.out.println("Finally block is always executed");
		}
	}

}
