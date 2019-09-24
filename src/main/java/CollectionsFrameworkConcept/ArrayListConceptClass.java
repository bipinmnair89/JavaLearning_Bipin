package CollectionsFrameworkConcept;

import java.util.ArrayList;

public class ArrayListConceptClass {
	
	public void captureNonGeneric()
	{
		ArrayList ar1=new ArrayList();   //non generic arraylist
		ar1.add(20);
		ar1.add("Barcode");	
		for(int i=0;i<ar1.size();i++)
		{
			System.out.println(ar1.get(i));
		}
		
		System.out.println("Contents of arraylist : "+ar1); //can be printed in this way also
	}
	
	public void captureGeneric()  //generic arraylist
	{
		ArrayList<Integer> ar2=new ArrayList<Integer>();
		ArrayList<Integer> ar3=new ArrayList<Integer>();
		ar2.add(30);
		ar3.add(40);
		ar2.addAll(ar3);
		for(int i=0;i<ar2.size();i++)
		{
			System.out.println(ar2.get(i));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListConceptClass obj1=new ArrayListConceptClass();
		obj1.captureNonGeneric();
		obj1.captureGeneric();

	}

}
