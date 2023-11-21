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


    public String generateReport() {
    	
    	String report = "Weather Report\n";
    	
        // Calcul de l'indice de chaleur
        if(isCelsius == false) {
        	temperature = temperature *9/5+32; 
        	report += "Température: " + temperature + "°F\n";
        }else {
        	report += "Température: " + temperature + "°C\n";
        }

        // Calcul de la vitesse du vent en km/h
        double windSpeedKmh = windSpeed * 1.60934;

        report += "Humidité: " + humidity + "%\n" ;
        // Calcul du point de rosée en fonction 
        double dewPoint = temperature - ((100 - this.humidity) / 5);
        if (isCelsius == true) { 
        	 report += "Point de rosée: " + dewPoint + "°C\n";
        }else {
        	 report += "Point de rosée: " + dewPoint + "°F\n";
        }
        
        
        report += "Vitesse du vent: " + windSpeedKmh + " km/h\n";
       

        return report;
    }
}
