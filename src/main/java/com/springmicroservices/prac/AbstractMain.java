package com.springmicroservices.prac;

abstract class AbstractClass {
	
	abstract void hello();
	
	protected int i=20;
	
	public final void hi() {
		System.out.println("Hi from childclass");
		
	}

	
}
class ChildClass extends AbstractClass {

	@Override
	public void hello() {
		System.out.println("Hello from childclass");
		
	}

}

public class AbstractMain {
	
	public static void main(String args[]) {
		
		AbstractClass ac = new ChildClass();
		ac.hello();
		ac.hi();
		System.out.println(ac.i);
	}
}
