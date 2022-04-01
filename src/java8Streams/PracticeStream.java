package java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeStream {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "banana", "grapes", "dates", "cherris");
		System.out.println(fruits);
		// 1.print all the fruits by using stream apis with the help of java8 features
		fruits.stream().forEach(fruit -> System.out.println(fruit));// foreach is used for printing purpose
		// 2.Print each fruit length
		fruits.stream().forEach(fruit -> System.out.println(fruit.length()));// length method is used to calculate the
																				// length of each fruit
		// 3.Find fruits whose length/charcount is 5 and print it
		fruits.stream().filter(fruit -> fruit.length() == 6).forEach(fruit -> System.out.println(" fruit " + fruit));
//4.find all fruits whose length is 5 and store in list
		List<String>fivelengthfruits =fruits.stream()
				                            .filter(fruit -> fruit.length() == 5)
                                            .collect(Collectors.toList());
		System.out.println(fivelengthfruits);
		// 5.convert all fruit names into uppercase and print it.
		fruits.stream()
		      .map(fruit -> fruit.toUpperCase())//transforming into one case to another case we have to choose map
		      .forEach(fruit -> System.out.println(fruit));
		// 6.conver all fruits name into lower case and print it
		fruits.stream()
		.map(fruit -> fruit.toLowerCase())
		.forEach(fruit -> System.out.println(fruit));
		// 7.convert all fruit names into uppercase and store into a list
		 List<String>uppercaselist = fruits.stream()
				                           .map(fruit -> fruit.toUpperCase())
				                           .collect(Collectors.toList());
		 System.out.println(uppercaselist);
//		 8. find fruits whose length is 5 and then convert to uppercase and get as list	
		 List<String>uppercaseandislengthisfive = fruits.stream()
				 .filter(fruit -> fruit.length()==5)//filter the data definding upon the condition
				 .map(fruit-> fruit.toUpperCase())//transform the data into one case to another case is nothing but map
				 .collect(Collectors.toList());//collect is used for the purpose of collect the data in the form of set
		 System.out.println(uppercaseandislengthisfive );

	}

}