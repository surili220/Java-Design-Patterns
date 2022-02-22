package structural.AdapterPattern;

public class TestMain {

	public static void main(String[] args) {
		WeatherUI ui = new WeatherUI();
		ui.getTemp(12345);
		ui.getTemp(1234);
	}
}
//adapter pattern is a bridge between two incompatible interfaces
//A single class that joins the incompatible or independent interfaces
//helps achieve reusability and flexibility