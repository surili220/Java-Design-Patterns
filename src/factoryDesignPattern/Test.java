package factoryDesignPattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PizzaStore ps = new PizzaStore();
		ps.orderPizza("nonveg");
		
		
		//***************///
		
		PizzaStoreFactoryImpl psi = new PizzaStoreFactoryImpl();
		psi.orderPizza("veg");
	}

}
