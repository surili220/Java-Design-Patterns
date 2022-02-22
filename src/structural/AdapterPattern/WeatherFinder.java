package structural.AdapterPattern;

public class WeatherFinder {

	public String find(String city) {
		if(city.equals("abd")) {
			return "Rainy day";
			
		}
		else {
			return "Summer day";
		}
	}
}
