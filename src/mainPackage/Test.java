package mainPackage;

import creationalPattern.EagerSingletonDemo;
import creationalPattern.SingletonDemo;

public class Test {
	
	public static void main(String[] args) {
		
		
		/*Lazy initialization in  Singleton */
		SingletonDemo sd = SingletonDemo.getInstance();
		SingletonDemo sd2 = SingletonDemo.getInstance();
		
		System.out.println("Lazy Initialization   "+ (sd==sd2)); // same object , hence returns true
		
		// if we write 
		// SingletonDemo sd = new SingletonDemo() // this line will give error. cause constructor is private in SingletonDemo.
		
		//****************************************************/
		
		
		
		/* Eager Initilization in Singleton */
		
		EagerSingletonDemo  eager = EagerSingletonDemo.getInstance();
		EagerSingletonDemo  eager2 = EagerSingletonDemo.getInstance();
		System.out.println("Eager Initialization   " + (eager==eager2));
		
	}

}
