package Genericspractice;

import java.util.ArrayList;

public class ArrayListGenericsDemo {
	public static void main(String[] args) {
		//homogenous type
		//wil add compile time safety
		ArrayList<Integer>al = new ArrayList<>();
		al.add(234);
		al.add(678);
		al.add(9);
		al.add(123);
		al.add(123);
		System.out.println(al);
		
		
		
		
	}

}
