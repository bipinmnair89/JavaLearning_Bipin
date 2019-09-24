package OOPSConcept2_Inheritance_Overriding;

public class CoreConfiguration extends ParentClass {

	public static void main(String[] args) {

		Derived1 d1=new Derived1();
		d1.effortEstimation(); //calling the sub class method effortEstimation
		d1.websiteLoginFunctionalities(); //calling the base class method
		d1.testMethod4();
		
		
		ParentClass p1=new ParentClass();
		p1.effortEstimation(); //calling the main class method effortEstimation
		p1.websiteLoginFunctionalities(); //calling the base class method
		
		
		ParentClass p2=new Derived1(); //obj of sub class with obj ref variable of base class
		p2.effortEstimation(); 	//calls the sub class method effortEstimation
		p2.websiteLoginFunctionalities();
		p2.testMethod();	//shows why static methods cannot be overridden as instead of subclass method, it calls base class method and implements data hiding instead of overriding
		p2.testMethod4();
		
	}

}

/* <Important Points to Remember>
 * subclass can access the properties of the main class by inheritance
 * extends keyword is used to achieve inheritance
 * java doesn't support multiple inheritance and this is achieved using Interface
 * java supports multilevel inheritance A->B->C here subclass C can access baseclass A
 * super keyword is used to access the properties of the main class from the sub class
 * if static methods are overridden then instead of overriding, data hiding is achieved
 * final methods cannot be overridden
 * private methods cannot be overridden
 * while overriding the access modifier cannot be reduced but can be increased
   for example protected can be overridden to public but not to private
 */







