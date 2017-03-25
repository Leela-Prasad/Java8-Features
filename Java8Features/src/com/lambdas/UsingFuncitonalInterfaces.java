package com.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UsingFuncitonalInterfaces {

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
		performConditionally(people, person -> true, person -> System.out.println(person));
		printLine();
		System.out.println("Printing Conditionally");
		performConditionally(people, person -> person.getLastName().startsWith("C") || person.getLastName().startsWith("c"),person ->System.out.println(person));
	}
	
	public static void performConditionally(List<Person> people,Predicate<Person> predicate,Consumer<Person> consumer) {
		for(Person aperson : people) {
			if(predicate.test(aperson)) {
				consumer.accept(aperson);
			}
		}

	}
	public static void printLine() {
		System.out.println();
	}
}
