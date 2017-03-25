package com.lambdas;

import java.util.function.BiConsumer;

public class LambdasWithExceptionHandlingWithWrapper {

	public static void main(String[] args) {
		Integer[] someNumbers = {1,3,6,10,34,9};
		Integer divider =0;
		process(someNumbers,divider,wrapperLambda((v,k) -> System.out.println(v/k)));
	}

	private static void process(Integer[] someNumbers, Integer divider,BiConsumer<Integer,Integer> consumer) {
		for(Integer aNumber : someNumbers) {
			consumer.accept(aNumber, divider);
		}
	}
	
	private static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer) {
		  return (v,k) ->  {
			  try {
				  consumer.accept(v, k);  
			  }catch(ArithmeticException e) {
				  System.out.println("Arthimetic Exception caught in Wrapper!");
			  }
			  
		  };
	}
	
}
