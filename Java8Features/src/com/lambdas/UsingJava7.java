package com.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsingJava7 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Lewis","Carroll",42),
				new Person("Thomas","Carlyle",51),
				new Person("Charlotte","Bronte",45),
				new Person("Matthew","Arnold",39)
				);
		
		Collections.sort(people,new Comparator<Person>() {

			@Override
			public int compare(Person person1, Person person2) {
				return  person1.getLastName().compareTo(person2.getLastName());
			}
		});
		System.out.println("Printing All Elements");
		printAll(people);
		printLine();
		/*System.out.println("Printing Elements Begining with C");
		printLastNameBeginingWithC(people);*/
		System.out.println("Printing Elements Conditionally");
		
		//This methodology is called "Passing Behaviour as argument" 
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person person) {
				if(person.getLastName().startsWith("C") || person.getLastName().startsWith("c"))
					return true;
				return false;
			}
			
		});
		printLine();
		
		//print All Elements using printConditionally method
		System.out.println("print All Elements using printConditionally method");
		printConditionally(people,new  Condition() {

			@Override
			public boolean test(Person person) {
				return true;
			}
			
		});
	}
	
	public static void printAll(List<Person> people) {
		for(Person aperson : people) {
			System.out.println(aperson);
		}
	}
	
	/*public static void printLastNameBeginingWithC(List<Person> people) {
		for(Person aperson : people) {
			if(aperson.getLastName().startsWith("C") || aperson.getLastName().startsWith("c")) {
				System.out.println(aperson);
			}
		}
	}*/
	
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

@FunctionalInterface
interface Condition {
	boolean test(Person person);
}
