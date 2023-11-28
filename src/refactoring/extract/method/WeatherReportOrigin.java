package refactoring.extract.method;

public class WeatherReportOrigin {

	private double temperature;
	private boolean isCelsius;
	private double windSpeed;
	private double humidity;

	public WeatherReportOrigin(double temperature, boolean isCelsius, double windSpeed, double humidity) {
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



		// Calcul de l'indice de chaleur
		if(isCelsius == false) {
			
			double temperatureFahrenheit = temperature *9/5+32; 
			report += "Température: " +  String.format("%.2f", temperatureFahrenheit)  + "°F\n";
		}else {
			report += "Température: " + String.format("%.2f", temperature) + "°C\n";
		}

		// Calcul de la vitesse du vent en km/h
		double windSpeedKmh = windSpeed * 1.60934;

		report += "Humidité: " + humidity + "%\n" ;
		// Calcul du point de rosée en fonction 
		double dewPoint = temperature - ((100 - this.humidity) / 5);
		if (isCelsius == false) { 
			dewPoint = dewPoint *9/5+32; 
			report += "Point de rosée: " + String.format("%.2f", dewPoint) + "°F\n";
		}else {
			report += "Point de rosée: " +  String.format("%.2f", dewPoint) + "°C\n";
		}


		report += "Vitesse du vent: " +  String.format("%.2f", windSpeedKmh) + " km/h\n";


		return report;
	}
}
