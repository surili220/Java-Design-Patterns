package factoryDesignPattern;

public class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza p = null;
		if(type.equals("veg")) {
			p= new VegPizza();
			
		}
		else if(type.equals("nonveg")) {
			p= new NonVeg();
		}
		
		p.prepare();
		p.bake();
		p.cut();
		
		return p;
	}
	
	
	//here the pizzaStore is responsible for object creation . so create a separate factory method that is responsible for object creation and 
	//pizza store will focus on logic.
}
