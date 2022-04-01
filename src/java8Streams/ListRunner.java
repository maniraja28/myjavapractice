package java8Streams;

import java.util.ArrayList;
import java.util.List;

public class ListRunner {
	public static void main(String[] args) {
		List<String>list = new ArrayList<>();//object creation
		list.add("mani");
		list.add("ravi");
		list.add("prasad");
		list.add("raja");
		list.add("raja");
		list.add("mani");
		list.add("mani");
		System.out.println(" list is.... " + list);
		//create + process + consume
		list.stream()
		.filter(data -> data.equals("mani"))
		.forEach(data -> System.out.println(data));
		list.stream()
		.forEach(data -> System.out.println(data.length()));
	}
}
