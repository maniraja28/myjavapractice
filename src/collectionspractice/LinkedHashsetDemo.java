package collectionspractice;

import java.util.LinkedHashSet;

public class LinkedHashsetDemo {// insertion order is preserved
	// duplicates are not allowed
	// crud operations
	// read and update operatios are not possible
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(23);// create the data
		lhs.add(44);
		lhs.add(337);
		lhs.add(21);
		lhs.add(88);
		lhs.add(90);
		lhs.add(23);
		lhs.add(90);
		lhs.add("hari");
		lhs.add("polnati");
		System.out.println(lhs);
		System.out.println(lhs.remove(9));// delete or remove the data

	}

}
