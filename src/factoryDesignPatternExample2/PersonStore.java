package factoryDesignPatternExample2;

public class PersonStore {
	
	public void makePerson(String type) {
		
		Person p = Personfactory.createPerson(type);
		
		p.wish();
		
	}

}
