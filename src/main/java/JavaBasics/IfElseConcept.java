package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		if(a<b)
		{
			System.out.println("b is the greatest");
		}
		else
			System.out.println("a is the greatest");
		
		//finding the greatest between 3 numbers
		int x=10;
		int y=20;
		int z=30;
		if(x>y && z>z)
		{
			System.out.println("x is the greatest");
		}
		else if(y>x && y>z)
		{
			System.out.println("y is the greatest");
		}
		else
			System.out.println("z is the greatest");

	}

}
