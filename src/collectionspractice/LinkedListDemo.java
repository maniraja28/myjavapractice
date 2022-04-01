package collectionspractice;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		//homogenous type
		//order is preserved duplicates are allowed
		//growable in size
		//crud operations 
		LinkedList ll= new LinkedList();
		ll.add(23);//create the data is nothing but adding
		ll.add(34);
		ll.add("ravi");
		ll.add("raju");
		ll.add("mani");
		ll.add("true");
		ll.add('c');
		
		System.out.println("before adding "  + ll);
		
		ll.add(3, 33);//update the data
		ll.add(6, "character");//update the data
		ll.set(2, "ram");//replacing the data
		
		System.out.println("after adding "  + ll);
		System.out.println(ll.get(6));//read the data
		ll.remove(5);//delete the data
		System.out.println("after removal " +ll);
		
		
	}

}
