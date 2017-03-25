package com.lambdas;

public class ClosuresExample {

	public static void main(String[] args) {
		
		Integer a=10;
		Integer b=20;
		doProcess(a,new Process() {

			@Override
			public void process(Integer i) {
				//Here we are using a variable 'b' which is not passes in the method argument and
				//is a scoped variable but when this behaviour is passed this variable is not available
				//then how compiler is resolving, actually before 1.8 this 'b' should be a final variable
				//so when compiler passes the actual value instead of variable 'b'.But in Java8 the variable 
				//is effectively final means the user need not to specify this variable as final and compiler
				//will take this as final variable so if the user is trying to assign some another value
				//before actually passing this behaviour to a function then compiler will generate error 
				//like the below line. Making of variable as effective final is called closures.
				//b=4;
				System.out.println(i+b);
				
			}
			
		});
	}
	
	public static void doProcess(Integer i,Process p) {
		p.process(i);
	}
	
}

interface Process {
	void process(Integer i);
}
