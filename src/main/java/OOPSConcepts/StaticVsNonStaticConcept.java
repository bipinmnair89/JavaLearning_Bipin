package OOPSConcepts;

public class StaticVsNonStaticConcept {
	
	String name="Tom";
	static int age=25;
	
	public void overDraft()
	{
		String balance = "200$";
		System.out.println("overdraft facility of bank");
	}
	public static void cashCard()
	{
		String limit = "400$";
		System.out.println("cashcard facility of bank");
	}

	public static void main(String[] args) {
		
		StaticVsNonStaticConcept ob1=new StaticVsNonStaticConcept();
		
		System.out.println(ob1.name);					//non static global variables can be accessed only by obj
		System.out.println(StaticVsNonStaticConcept.age); //static global variables can be accessed by classname or directly
		
		ob1.overDraft();					//non static methods can be accessed using obj
		StaticVsNonStaticConcept.cashCard();//static methods can be accessed using classname
	}
	
	
}
