package abstractFactorypattern;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaoAbstractFactory daf=DaofactoryProducer.produce("xml");
		Dao dao= daf.createDao();
		dao.save();
		
	}

}

//creational pattern
//factory of factories