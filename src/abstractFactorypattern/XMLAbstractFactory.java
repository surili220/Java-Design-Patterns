package abstractFactorypattern;

public class XMLAbstractFactory extends DaoAbstractFactory{

	@Override
	public Dao createDao() {
		// TODO Auto-generated method stub
		return new XMLEmpDao();
	}

}
