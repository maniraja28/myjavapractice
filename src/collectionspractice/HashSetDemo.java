package collectionspractice;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		//hetrogenous type
		//order is not preserved,duplicates are not allowed
		//size is growable
		//crud operations
		//in hash set class read operations and update operations is not possible because of insertion orser is not preserved
		hs.add(23);//create the data
		hs.add(33);
		hs.add(44);
		hs.add(23);
		hs.add("raja");
		hs.add("fale");
		System.out.println("hs" + hs);//read the data r
		hs.remove("raja");//delete the data d
		System.out.println("after removal" + hs);
	
	}
}
