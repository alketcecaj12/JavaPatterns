package patterns.observer;

public class WeatherStation {
public static void main (String[] args){
	WeatherData weatherData= new WeatherData();
	
CurrentConditionsDisplay currentDisplay= new CurrentConditionsDisplay(weatherData);
 
 Statistics statistics1 = new Statistics(weatherData);

 Forecast forecast1 = new Forecast(weatherData);

 ThirdPartyDisplay tpd=new ThirdPartyDisplay(weatherData);
 weatherData.setMeasurements(35, 70, 3f);
}
}
