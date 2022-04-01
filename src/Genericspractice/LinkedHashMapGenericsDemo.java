package Genericspractice;

import java.util.LinkedHashMap;

public class LinkedHashMapGenericsDemo {
	public static void main(String[] args) {
		//insertion order is preserved
		//duplicates are not allowed
		//homogenous type
		//will add only compile time safety purpose
		LinkedHashMap<Integer,String>lhm = new LinkedHashMap<>();
		lhm.put(1, "rana");
		lhm.put(2, "rahul");
		lhm.put(5, "ramu");
		lhm.put(2,"aser");
		System.out.println(lhm);
		
		
	}

}
