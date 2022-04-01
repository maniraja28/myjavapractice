package collectionspractice;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		// TreeSet ts = new TreeSet();// ascending
		TreeSet ts = new TreeSet(Collections.reverseOrder()); // descend
		ts.add(23);// create the data
		ts.add(12);
		ts.add(67);
		ts.add(99);
		ts.add(104);
		System.out.println(ts);
		ts.remove(104);//remove or delete
		System.out.println("after remove the data " + ts);
	}

}
