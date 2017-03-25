package com.lambdas;

public class ClosuresExampleUsingLambdas {

	public static void main(String[] args) {
		
		Integer a=10;
		Integer b=20;
		doProcess(a, i -> System.out.println(i+b));
	}
	
	public static void doProcess(Integer i,Process p) {
		p.process(i);
	}
	
}

