package com.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class UsingLambdas {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Lewis","Carroll",42),
				new Person("Thomas","Carlyle",51),
				new Person("Charlotte","Bronte",45),
				new Person("Matthew","Arnold",39)
				);
		
		Collections.sort(people,(person1,person2) -> person1.getLastName().compareTo(person2.getLastName()));
		System.out.println("After sorting list based on lastname");
		printConditionally(people, person -> true);
		printLine();
		System.out.println("Printing Conditionally");
		printConditionally(people, person -> person.getLastName().startsWith("C") || person.getLastName().startsWith("c"));
	}
	
	public static void printConditionally(List<Person> people,Predicate<Person> predicate) {
		for(Person aperson : people) {
			if(predicate.test(aperson)) {
				System.out.println(aperson);
			}
		}

	}
	public static void printLine() {
		System.out.println();
	}
}
