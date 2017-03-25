package com.lambdas;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Lewis","Carroll",42),
				new Person("Thomas","Carlyle",51),
				new Person("Charlotte","Bronte",45),
				new Person("Matthew","Arnold",39)
				);
		
		System.out.println("Using for loop");
		//using for loop
		for(int i=0;i<people.size();++i) {
			System.out.println(people.get(i));
		}
		
		System.out.println("Using for in");
		//using for in loop
		for(Person aperson : people) {
			System.out.println(aperson);
		}
		
		//The above two loops are external iteration because we are controlling how the 
		//loop should be executed and we are controlling but in java8 we have an internal 
		//iteration where we will not have control of how the iteration will be 
		//where it can leverage the multi processing where some elements can be iterated in 
		//one core and remaining in other core.
		System.out.println("Using for each");
		//people.forEach(p ->System.out.println(p));
		//This can be replaced with method reference
		people.forEach(System.out::println);
		
	}
}
