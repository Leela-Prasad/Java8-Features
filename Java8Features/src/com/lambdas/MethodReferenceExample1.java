package com.lambdas;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		//Thread t = new Thread(() -> printMessage());
		//Here () -> printMessage() === MethodReferenceExample1::printMessage
		//because rule1=there is no input argument passed and the method execution also don't take any argument
		Thread t = new Thread(MethodReferenceExample1::printMessage);
		t.start();
	}

	private static void printMessage() {
		 System.out.println("Hello!");
	}
	
	
}
