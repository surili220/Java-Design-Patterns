package abstractFactorypattern;

import factoryDesignPatternExample2.Person;

public class DbEmpDao implements Dao {

	

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("DB employee saved");
	}

}
