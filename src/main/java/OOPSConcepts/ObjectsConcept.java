package OOPSConcepts;

public class ObjectsConcept {
	
	/*Class is an entity which is having properties like variables, methods ,constructors etc
	 * Object is created using new keyword and is used to as reference for the above
	 * mentioned properties
	 */
	
	int x;
	int y; //2 non static global variables
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating objects
		ObjectsConcept obj1=new ObjectsConcept();
		ObjectsConcept obj2=new ObjectsConcept();
		
		/*here obj1 and obj2 are object reference variable and
		 * new ObjectsConcept() and new ObjectsConcept() are the objects
		 */
		
		
		obj1.x=1;
		obj1.y=3;
		obj2.x=2;
		obj2.y=5;
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		System.out.println(obj2.x);
		System.out.println(obj2.y);

	}

}
