package factoryDesignPattern;

public class NonVeg implements Pizza{

	@Override
	public void prepare() {
		System.out.println("non veg pizza");
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("non veg pizza");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("non veg pizza");
		
	}

}
