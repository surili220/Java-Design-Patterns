package abstractFactorypattern;

public class DaofactoryProducer {
	public static DaoAbstractFactory produce(String factoryType) {
		
		DaoAbstractFactory daf =null;
		if(factoryType.equals("xml")) {
			daf = new XMLAbstractFactory();
		}
		else if(factoryType.equals("db")) {
			daf = new DBAbstractFactory();
		}
				return daf;
	}
}
