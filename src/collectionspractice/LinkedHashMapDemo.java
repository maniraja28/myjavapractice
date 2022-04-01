package collectionspractice;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap lhm = new LinkedHashMap();
		// insertion order is preserved
		// duplicates are not allowed
		// crud operations

		lhm.put(1, "sunny");// create the data or add the data
		lhm.put(6, "pinky");
		lhm.put(8, "praksh");
		lhm.put(1, "ravi");
		System.out.println(lhm);

		lhm.get(1);// read the data
		System.out.println("after reading the data" + lhm);

		lhm.replace(8, "venu");// replace the data or update the data
		System.out.println("after replacing the data " + lhm);

		lhm.remove(6);// delete or remove the data
		System.out.println("after remve the data " + lhm);
	}

}
