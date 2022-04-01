package collectionspractice;

import java.util.HashMap;
//insertion order is not preserved
//dupicates are not allowed
//map(key,value)
//crud operations
//create the data
//read operation method name should be get
//update operation is replace method
//delete operation remove the data

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(1, "ramarao");//create the data
		hm.put(4,"mahesh");
		hm.put(2, "ravi");
		hm.put(3, "mani");
		hm.put(1,"raju");
		System.out.println(hm);
		System.out.println(hm.get(2));//directly call the read value because of insertion order is not preserved
		hm.replace(2,"raju");//update
		System.out.println("after replce" + hm);//update
		hm.remove(4);
		System.out.println("after remov" + hm);//delete
	
		
}
}