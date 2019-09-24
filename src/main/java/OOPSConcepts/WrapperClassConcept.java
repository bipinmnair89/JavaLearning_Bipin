package OOPSConcepts;

public class WrapperClassConcept {

	public static void main(String[] args) {

		//Converting String to Integer, Float, Boolean etc
		String s ="144";
		int value = Integer.parseInt(s);
		System.out.println("value of int : "+value);
		
		float value1= Float.parseFloat(s);
		System.out.println("value of float :"+value1);
		
		//Converting Integer to String
		int x=23;
		String z=String.valueOf(x);
		System.out.println("Value of string is : "+z);
		
		//if not done properly it can easily result in numberformat exception

	}

}
