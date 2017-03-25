package com.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Lewis","Carroll",42),
				new Person("Thomas","Carlyle",51),
				new Person("Charlotte","Bronte",45),
				new Person("Matthew","Arnold",39)
				);
		
		//performConditionally(people, person -> true, person -> System.out.println(person));
		//Here person -> System.out.println(person) === System.out::println
		//Because rule is there is one parameter and the same parameter is passing to this function
		//so we can useMethod reference instead of lambdas when there are zero argument or 1 argument
		//but not more than more that 1 argument.
		performConditionally(people, person -> true, System.out::println);
	}
	
	public static void performConditionally(List<Person> people,Predicate<Person> predicate,Consumer<Person> consumer) {
		for(Person aperson : people) {
			if(predicate.test(aperson)) {
				consumer.accept(aperson);
			}
		}

	}

}
