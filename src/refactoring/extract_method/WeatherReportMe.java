package refactoring.extract_method;

public class WeatherReportMe {

	private double temperature;
	private boolean isCelsius;
	private double windSpeed;
	private double humidity;

	public WeatherReportMe(double temperature, boolean isCelsius, double windSpeed, double humidity) {
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
		double dewPoint = calculateDewPoint();
		String unitTemperature = "°C";
		// Calcul de l'indice de chaleur
		report += "Température: ";
		if(isCelsius == false) {
			unitTemperature = "°F";
			report += format2f(convertCelsiusToFahrenheit(temperature));
			dewPoint = convertCelsiusToFahrenheit(dewPoint);
		}else {
			report += format2f(temperature);
		}
		report += unitTemperature + "\n";
		report += "Humidité: " + humidity + "%\n" ;
		report += "Point de rosée: " + dewPoint + unitTemperature +"\n";
		report += "Vitesse du vent: " +  String.format("%.2f", windSpeedToKilometer()) + " km/h\n";


		return report;
	}


	private String format2f(Double weatherData) {
		return String.format("%.2f", weatherData);
	}

	private Double convertCelsiusToFahrenheit(double temperature) {
		double temperatureFahrenheit = temperature *9/5+32;
		return temperatureFahrenheit;
	}

	// Calcul de la vitesse du vent en km/h
	private double windSpeedToKilometer() {
		double windSpeedKmh = windSpeed * 1.60934;
		return windSpeedKmh;
	}

	private double calculateDewPoint() {
		double dewPoint = temperature - ((100 - this.humidity) / 5);
		return dewPoint;
	}
}
