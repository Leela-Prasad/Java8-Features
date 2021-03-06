Lamda Expressions

Problem : In Java 7 we cannot pass a block of code without creation of class and this looks fine when it comes to Object oriented programming but we can acheive this passing block of code independently using Lambda Expressions. 
Lambda Expressions are useful to write elegant and crisp code in certain situations, so we will use this Lambda expression whenever possible  

In Java 8 we can pass functions as a value to a variable and this variable holds that function definition NOT the return type which was returned after execution of function.

greetingFunciton=public void greet() {
					System.out.println("Hello World!");
				};
				
In this greetingFunciton variable holds the fuction definition as a inline value just like string and integer holds the inline values.
String str = "greet";
Integer i = 10;

In Java8 the block of method definition which is passed as a value is called Lambda Expression;
The above Lamdba Expression can be reduced further as below.

greetingFunction = 	void () {
	System.out.println("Hello World!");
};

public keyword is removed because it doesn't make any sense as this method not present in a class.
method name is removed becuase this method definition will be used by the code useing greetingFunction variable name.

The above Lambda Expression is reduced further as below.

greetingFunction = () -> {
	System.out.println("Hello World!");
};

return type is removed because In Java8 they made compiler smart enough to detect the return value automatically from the block of code;	
Here -> is Lambda and should be used between parathesis and block of code

If we have only one line of code in the block then we can further reduce it to 

greetingFunciton = () -> System.out.println("Hello World!");

With this set we will write some lambda expressions

doubleNumberFuncitn=(int a) -> return a*2;

If there is only one line of statement in a block of code return keyword is not required and compiler will automatically detect.so the above code is rewritten as 
doubleNumberFunction=(int a,) -> a*2;		


addFunction=(int a,int b) -> a+b;

safeDivideFunction=(int a,int b) -> {
	if(b==0)
		return 0;
	return a/b;	
}

stringLengthFunciton=(String str) -> str.length();

The interface which is used for Lambda expression is called Functional Interface and this functional interface should have only ONE method.	


public class Test {

	public static void main(String[] args) {
		
		StringLengthLambda lambda = (String str) -> str.length();
		System.out.println(lambda.getLength("Hello Lambda"));
	}

}

interface StringLengthLambda {
	int getLength(String str);
}


Lambda expressions are backed with interface types so we need not metion the input type in the lambda expression and if there is only one input parameter then we need not write parenthesis then the above lambda expression will be reduced to 

	StringLengthLambda lambda = str -> str.length;

Lambda in Runnable Interface

Thread t = new Thread(() ->System.out.println("Thread Executed"));
t.start();

Functional Interface
An Interface which has only ONE abstract method is called Functional Interface.

at some point of time some one add another abstract method then that interface is no longer Functional Interface. To avoid this situation we will mark the interface with annotation “@FuncationalInterface”

example:

@FunctionalInterface
public interface Greeting {
	public void perform();
}
