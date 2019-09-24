package OOPSConcepts;

public class MethodConcept {

	public static void main(String[] args) {
		// creating object of the class
		MethodConcept mc=new MethodConcept();
		mc.view();
		int total =mc.sum();
		System.out.println(total);
		mc.multiply(2,3);
		
		}
	public void view() //method without any value to return
	{
		int a=30;
		int b=20;
		System.out.println(a+b);
	}
	
	public int sum() //method with value to return
	{
		int i=10;
		int j=20;
		int k=i+j;
		return k;
	}
	public int multiply(int a,int b) //method which takes input and returns value
	{
		int c=a*b;
		return c;
	}
}
