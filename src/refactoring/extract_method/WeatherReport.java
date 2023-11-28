package refactoring.extract_method;

public class WeatherReport {

	private double temperature;
	private boolean isCelsius;
	private double windSpeed;
	private double humidity;

	public WeatherReport(double temperature, boolean isCelsius, double windSpeed, double humidity) {
		this.temperature = temperature;
		this.windSpeed = windSpeed;
		this.humidity = humidity;
		this.isCelsius = isCelsius;
	}


	public boolean isCelsius() {
		return isCelsius;
	}


	public void setCelsius(boolean isCelsius) {
		this.isCelsius = isCelsius;
	}


	public String generateReport() {

		String report = "Weather Report\n";

		Double temperatureFahrenheit = 0.0;

		report = temperatureReport(report);

		// Calcul de la vitesse du vent en km/h
		double windSpeedKmh = windSpeedToKilometer();

		report = dewReport(report);


		report += "Vitesse du vent: " +  String.format("%.2f", windSpeedKmh) + " km/h\n";


		return report;
	}


	private String dewReport(String report) {
		report += "Humidité: " + humidity + "%\n" ;
		// Calcul du point de rosée en fonction 
		double dewPoint = calculateDewPoint();
		if (isCelsius == false) { 
			dewPoint = dewPoint *9/5+32; 
			report += "Point de rosée: " + String.format("%.2f", dewPoint) + "°F\n";
		}else {
			report += "Point de rosée: " +  String.format("%.2f", dewPoint) + "°C\n";
		}
		return report;
	}


	private String temperatureReport(String report) {
		Double temperatureFahrenheit;
		// Calcul de l'indice de chaleur
		if(isCelsius == false) {

			temperatureFahrenheit = convertCelsiusToFahrenheit(); 
			report += "Température: " +  format2f(temperatureFahrenheit)  + "°F\n";
		}else {
			report += "Température: " + String.format("%.2f", temperature )+ "°C\n";
		}
		return report;
	}


	private double calculateDewPoint() {
		double dewPoint = temperature - ((100 - this.humidity) / 5);
		return dewPoint;
	}


	private double windSpeedToKilometer() {
		double windSpeedKmh = windSpeed * 1.60934;
		return windSpeedKmh;
	}


	private String format2f(Double weatherData) {
		return String.format("%.2f", weatherData);
	}


	private Double convertCelsiusToFahrenheit() {
		Double temperatureFahrenheit;
		temperatureFahrenheit = temperature *9/5+32;
		return temperatureFahrenheit;
	}
}
