package creationalPattern;

// Demo for eager Initialization in  Singleton pattern.
// Here we are initializing it even before the get instances are invoked.
//This is helpful, when we know class we be used at least once in the application.

public class EagerSingletonDemo {

	private static EagerSingletonDemo instance  = new EagerSingletonDemo(); //eager initialization
	
	private EagerSingletonDemo() {
		
	}
	
	public static EagerSingletonDemo getInstance() {
		return instance;
	}
	
}
