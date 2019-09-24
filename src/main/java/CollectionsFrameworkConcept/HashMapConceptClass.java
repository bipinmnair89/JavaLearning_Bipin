package CollectionsFrameworkConcept;

import java.util.HashMap;
import java.util.Map;

public class HashMapConceptClass {

	/*hashmap is nonsynchronized
	 * 
	 */
	
	public void hashMapConcept1()
	{
		HashMap h1=new HashMap();
		h1.put(1, "30");
		h1.put(null,"Stinger");
		System.out.println(h1);
		System.out.println("Check key contains 2 :"+h1.containsKey(2));
	}
	
	public void hashMapConcept2()
	{
		HashMap<Integer,String> h2=new HashMap<Integer,String>();
		h2.put(1, "Verna");
		h2.put(2, "Vento");
		h2.put(3, "City");
		for(Map.Entry<Integer,String> m: h2.entrySet())
		{
			System.out.println("Key is "+m.getKey()+" Value is "+m.getValue());
		}
	}
	public static void main(String[] args) {
		
		HashMapConceptClass obj1=new HashMapConceptClass();
		obj1.hashMapConcept1();
		obj1.hashMapConcept2();
	}

}
