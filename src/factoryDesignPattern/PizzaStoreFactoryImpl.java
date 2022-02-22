package factoryDesignPattern;

public class PizzaStoreFactoryImpl {

	public Pizza orderPizza(String type) {
		Pizza p= PizzaFactory.createPizza(type);

		p.prepare();
		p.bake();
		p.cut();
		return p;
	}
	
}
