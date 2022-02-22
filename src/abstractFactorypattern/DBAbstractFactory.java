package abstractFactorypattern;

public class DBAbstractFactory extends DaoAbstractFactory{

	@Override
	public Dao createDao() {
		// TODO Auto-generated method stub
		return new DbEmpDao();
	}

}
