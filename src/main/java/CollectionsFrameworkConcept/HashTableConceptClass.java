package CollectionsFrameworkConcept;

import java.util.Hashtable;

public class HashTableConceptClass {
	
	/*Hashtable implements the Map interface
	 * hashtable consists of key.value pair
	 * hashtable is synchronized
	 */
	
	public void hashTableConcept1()
	{
		Hashtable t1=new Hashtable();
		t1.put(1, "Hector");
		t1.put(2, "Ford");
		t1.remove(2);
		System.out.println(t1);	//print the values in hashtable
		System.out.println("Value of containskey"+t1.containsKey(2)); //containskey to check if the key is present
		
	}
	public void hashTableConcept2()
	{
		Hashtable<Integer,String> t2=new Hashtable<Integer,String>();
		t2.put(2,"AUDI");
		t2.put(3, "MERC");
		//PRINTING VALUES FROM HASHTABLE USING KEYSET -IMPORTANT
		for(Object key:t2.keySet())
		{
			System.out.println("Key is :"+key+" Value is :"+t2.get(key));
		}
	}
	

	public static void main(String[] args) {

		HashTableConceptClass h1=new HashTableConceptClass();
		h1.hashTableConcept1();
		h1.hashTableConcept2();

	}

}
