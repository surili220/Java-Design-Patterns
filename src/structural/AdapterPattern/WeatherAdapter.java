package structural.AdapterPattern;

public class WeatherAdapter {

		WeatherFinder f = new WeatherFinder();
		public String findWeather(int zipCode) {
			
			String city =null;
			if(zipCode ==1234) {
				city="abd";
				return f.find(city);
			}
			else {
				city= "somevalue";
			}
				
			
			
			
			return f.find(city); 
					
		}
}
