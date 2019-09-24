package CollectionsFrameworkConcept;

import java.util.ArrayList;
import java.util.Iterator;

	/*here a user defined generic arraylist is created to get multiple details of objects
	 * the iterator concept and while loop is used to traverse through the arraylist
	 * 
	 */


public class CarDetailsObjArrayList {
	
	int modelNumber;
	String modelName;
	String fuelType;	
	
	public CarDetailsObjArrayList()
	{
		System.out.println("Default constructor");
	}
	public CarDetailsObjArrayList(int modelNumber, String modelName, String fuelType)
	{
		this.modelNumber=modelNumber;
		this.modelName=modelName;
		this.fuelType=fuelType;
	}
	
	public void genericObjectArrayList()
	{
		CarDetailsObjArrayList a1=new CarDetailsObjArrayList(4,"Verna","Petrol");
		CarDetailsObjArrayList a2=new CarDetailsObjArrayList(5,"Seltos","Diesel");
		CarDetailsObjArrayList a3=new CarDetailsObjArrayList(8,"Camry","Hybrid");
		
		ArrayList<CarDetailsObjArrayList> arr1=new ArrayList<CarDetailsObjArrayList>();
		arr1.add(a1);
		arr1.add(a2);
		arr1.add(a3);

		//traverse object arraylist using iterator
		Iterator<CarDetailsObjArrayList> it=arr1.iterator();
		while(it.hasNext())
		{
			CarDetailsObjArrayList obj=it.next();
			System.out.println(obj.modelNumber);
			System.out.println(obj.modelName);
			System.out.println(obj.fuelType);
		}
		
	}
	
	public static void main(String[] args) {
		
		CarDetailsObjArrayList a1=new CarDetailsObjArrayList();
		a1.genericObjectArrayList();
			

	}

}
