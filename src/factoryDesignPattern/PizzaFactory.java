package factoryDesignPattern;

public class PizzaFactory {
	
	//factory method is static method
	
	public static Pizza createPizza(String type) {
		
		
		if(type.equals("veg")) {
			 
			return new VegPizza();
		}
		else if(type.equals("nonveg")) {
		
			return new NonVeg();
		}
		
		return null;
		
	}

}
