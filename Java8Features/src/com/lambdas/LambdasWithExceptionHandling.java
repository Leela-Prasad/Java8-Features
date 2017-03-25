package com.lambdas;

import java.util.function.BiConsumer;

public class LambdasWithExceptionHandling {

	public static void main(String[] args) {
		Integer[] someNumbers = {1,3,6,10,34,9};
		Integer divider =0;
		process(someNumbers,divider,(v,k) -> {
			// This try catch is ok but it is making the lambda verbose
			//for this what will do is we will create a wrapper which will execute the same functionality 
			//but in addition exception handling will be added to this wrapper
			//This wrapper can be made as generic so that it can be used for different lambdas
			try {
				System.out.println(v/k);
			}catch(ArithmeticException e) {
				System.out.println("Arthimetic Exception occured!");
			}
			
		});
	}

	private static void process(Integer[] someNumbers, Integer divider,BiConsumer<Integer,Integer> consumer) {
		for(Integer aNumber : someNumbers) {
			//We can't put try catch block on this line because the behaviour might change and different can occur and it is not possible to catch exception for a specific behaviour
			consumer.accept(aNumber, divider);
		}
	}
	
}
