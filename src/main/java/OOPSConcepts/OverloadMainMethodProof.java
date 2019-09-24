package OOPSConcepts;

public class OverloadMainMethodProof {
	
	//Yes main method overloading is possible but JVM detects only String[] args

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("JVM detects this main method with String[] args");
		main(2);
		main(2.34);
		

	}
	
	public static void main(int a)
	{
		System.out.println("METHOD 1 value :"+a);
	}
	public static void main(double a)
	{
		System.out.println("METHOD 2 value :"+a);
	}
}
