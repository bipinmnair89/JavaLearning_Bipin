package OOPSConcepts;

public class MethodOverloadingConcept {
	/*Multiple methods with the same name but diff parameters or datatype 
	 * All methods must be present inside the same class for method overloading
	 */

	public static void main(String[] args) {

		MethodOverloadingConcept obj= new MethodOverloadingConcept();
		obj.add();
		obj.add(2);
		obj.add(2.33);
		obj.add(4, 5.2);
		
		
	}
	
	public void add()
	{
		System.out.println("Overloaded method 1");
	}
	public void add(int a)
	{
		System.out.println("Overloaded method 2 : "+a);
	}
	public void add(double a)
	{
		System.out.println("Overloaded method 3 : "+a);
	}
	public void add(int a, double b)
	{
		System.out.println("Overloaded method 4 : "+a+","+b);
	}
	
}


