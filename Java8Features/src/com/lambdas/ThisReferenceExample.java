package com.lambdas;

public class ThisReferenceExample {

	public static void main(String[] args) {
		ThisReferenceExample obj = new ThisReferenceExample();
		obj.doProcess(1,new Process() {

			@Override
			public void process(Integer i) {
				System.out.println(i);
				//Here this keyword indicates inner class reference
				//if this is for outer class compiler should give error as
				//this is not allowed in static context and this concept is 
				//entirely differently from lambdas and this in lambdas will 
				//point ot outer class reference which clearly proves that 
				//lambdas are not shortcut to inner classes
				System.out.println(this);
			}
			
			public String toString() {
				return "This is inner class toString";
			}
			
		});
	}
	
	public void  doProcess(Integer i,Process p) {
		p.process(i);
	}
}