package factoryDesignPatternExample2;

public class Personfactory {

	public static Person createPerson(String type) {
		
		if(type.equals("female")) {
		return new Female();
		}
		else if(type.equals("male")) {
			return new Male();
		}
		return null;
	}
}
