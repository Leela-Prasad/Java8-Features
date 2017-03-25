package com.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
		printAll(people);
		printLine();
		System.out.println("Printing Conditionally");
		printConditionally(people, person -> person.getLastName().startsWith("C") || person.getLastName().startsWith("c"));
		printLine();
		System.out.println("Printing All using conditionally method");
		printConditionally(people, person -> true);
		
	}
	
	public static void printAll(List<Person> people) {
		for(Person aperson : people) {
			System.out.println(aperson);
		}
	}
	
	public static void printConditionally(List<Person> people,Condition condition) {
		for(Person aperson : people) {
			if(condition.test(aperson)) {
				System.out.println(aperson);
			}
		}

	}
	public static void printLine() {
		System.out.println();
	}
}
