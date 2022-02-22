package behavioural.templatepattern;

//parent class
public abstract class DataRender {

	public  void render(){
		System.out.println(readData());
	}
	public abstract String readData() ;
	
}
