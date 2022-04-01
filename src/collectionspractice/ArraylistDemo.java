package collectionspractice;

import java.util.ArrayList;

public class ArraylistDemo {
	public static void main(String[] args) {
		
		//heterogenous type
		//order is preserved duplicates are allowed
		//growable in size
		
		ArrayList al= new ArrayList();
		//crud operations
		//c means creation nothing but data adding
		//r means read the data
		//u means update the data
		//d means delete the data
		
				al.add(12);//differnt type//creation c
				al.add(322);
				al.add("mani");
				al.add("raja");
				al.add('c');
				al.add("true");
				al.add(12);
				
				System.out.println("before removal "  + al);

				al.remove(4);//delete the data
				
				System.out.println("after removal "  + al);
				System.out.println(al.get(3));//read the data
				System.out.println(al.set(3, "ravi"));//update the data
						
		
	}

}
