package refactoring.extract_method;

public class Main {

	public static void main(String[] args) {
		
		WeatherReport todayWeather = new WeatherReport(15, false, 20, 67); 
		System.out.println(todayWeather.generateReport());

	}

}
