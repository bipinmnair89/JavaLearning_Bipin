package CollectionsFrameworkConcept;

import java.util.Iterator;
import java.util.LinkedList;

		/*LinkedList is having 2 parts data and address of the next node
		 * the head section of the linked list points to the first node data part
		 * here insertion and deletion is easy
		 */

public class LinkedListConceptClass {
	
	public void carTypes()
	{
		LinkedList l1=new LinkedList();
		l1.add("Alpharomeo");
		l1.addFirst(2);
		System.out.println(l1);	//direct printing of values from the linkedlist	
		System.out.println(l1.get(1)); //using the get method
		
		LinkedList<String> l2=new LinkedList();
		l2.add("Hyundai");
		l2.addFirst("Chevrolet");
		l2.addLast("Suzuki");
		for(int i=0;i<l2.size();i++)		//different ways to print the data
		{
			System.out.println(l2.get(i));
		}
		
		for(String str:l2) {				//different ways to print the data
			System.out.println(str);
		}
		
		Iterator<String> it=l2.iterator();	//using iterator
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}
	

	public static void main(String[] args) {

		LinkedListConceptClass obj1=new LinkedListConceptClass();
		obj1.carTypes();

	}

}
