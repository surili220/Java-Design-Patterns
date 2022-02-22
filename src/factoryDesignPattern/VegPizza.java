package factoryDesignPattern;

public class VegPizza implements Pizza {

	
	@Override
	public void prepare() {
		System.out.println("preparing");
	}

	@Override
	public void bake() {
		System.out.println("baking");
	}

	@Override
	public void cut() {
		System.out.println("cutting");
	}
	

}
