package refactoring.extract.method;

public class Main {

	public static void main(String[] args) {
		
		WeatherReport todayWeather = new WeatherReport(15, false, 20, 67); 
		System.out.println(todayWeather.generateReport());
		
		todayWeather.setCelsius(true);
		System.out.println(todayWeather.generateReport());

	}

}
