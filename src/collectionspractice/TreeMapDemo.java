package collectionspractice;

import java.util.Collections;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		// insertion order is not preserved
		// duplicate are not allowed
		// default natural sorting order ascending order
		// crud operation
		TreeMap tm = new TreeMap();
		// TreeMap tm = new TreeMap(Collections.reverseOrder());
		tm.put(1, "ravi");// create the data adding
		tm.put(3, "qerw");
		tm.put(7, "ramesh");
		tm.put(11, "mahesh");
		tm.put(2, "ramu");
		System.out.println(tm);
		System.out.println(tm.get(7));// read the data
		tm.replace(2, "ramakrishna");// replace the data or update the data
		System.out.println("after replce " + tm);
		tm.remove(2);// delete or remove
		System.out.println("after removal" + tm);
		

	}

}
