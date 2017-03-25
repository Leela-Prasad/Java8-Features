package com.lambdas;

public class ThisReferenceExampleUsingLambdas {

	public static void main(String[] args) {
		ThisReferenceExampleUsingLambdas obj = new ThisReferenceExampleUsingLambdas();
		obj.doProcess(2,i ->  {
			System.out.println(i);
			//below line is not allowed as this is ThisReferenceExampleUsingLambdas instance
			//System.out.println(this);
		});
	}
	
	public void  doProcess(Integer i,Process p) {
		p.process(i);
	}
}