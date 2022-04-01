package Genericspractice;

import java.util.HashSet;

public class HashSetGenericsDemo {
	public static void main(String[] args) {
		HashSet<Boolean> hs = new HashSet<Boolean>();
		hs.add(true);
		hs.add(false);
		hs.add(true);
		hs.add(true);
		System.out.println(hs);

	}

}
