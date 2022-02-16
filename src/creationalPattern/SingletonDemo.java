package creationalPattern;

//Demo for Lazy initialization in Java singleton

public class SingletonDemo {
	private static SingletonDemo instance ;
	
	private SingletonDemo() {
		
	}
	
	public static SingletonDemo getInstance() {
		if(instance ==null) { // create instance only if its null . 
			instance = new SingletonDemo(); // lazy initialization
			
		}
		return instance;
	}

}
