package structural.AdapterPattern;

public class WeatherUI {
	
	WeatherAdapter w = new WeatherAdapter();
	
	void getTemp(int zipCode) {
		String s =w.findWeather(zipCode);
		System.out.println(s);
		
	}

}
