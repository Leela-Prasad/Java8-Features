package com.lambdas;

import java.util.Arrays;
import java.util.List;

public class StreamExamples {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Lewis","Carroll",42),
				new Person("Thomas","Carlyle",51),
				new Person("Charlotte","Bronte",45),
				new Person("Matthew","Arnold",39)
				);
		
		//here for each is a terminate condition because it doesn't return anything.
		people.stream()
		.forEach(p -> System.out.println(p));
		
		people.stream()
		.filter(p -> p.getLastName().startsWith("C"))
		.forEach(System.out::println);
		
		//It can potentially make a parallel stream to execute in different cores of cpu
		Integer count = (int) people.parallelStream()
		.filter(p -> p.getLastName().startsWith("C"))
		.count(); //count is a terminating condition because it returns an integer
		System.out.println("count :"+count);
	}
}
