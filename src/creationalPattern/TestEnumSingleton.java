package creationalPattern;

public class TestEnumSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EnumSingletonDemo enumInstance = EnumSingletonDemo.INSTANCE;
		System.out.println(enumInstance.getName());
		enumInstance.setName("Surili");
		System.out.println(enumInstance.getName());
	}

}

/*
 * Java ensures internally that enum value is instantiated only once.
 *  Since java Enums are globally accessible, they can be used for singletons.
 *   Its only drawback is that it is not flexible i.e it does not allow lazy initialization.
 * 
 * 
 * */
 */