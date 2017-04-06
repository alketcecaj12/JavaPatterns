package patterns.observer;

public class Statistics implements Observer, DisplayElement{
	private float temperature;
	 private float humidity;
	   private WeatherData weatherData;

	public Statistics(WeatherData weatherData){
		this.weatherData= weatherData;
		 weatherData.registerObserver(this);
	}
	public void update(float temperature, float humidity, float pressure){
		this.temperature=temperature;
		 this.humidity=humidity;
		  display();
	}
	public void display(){
		System.out.println("Current conditions are from Strìatistics: " +temperature+ " F degrees " +humidity+ " humidity");
	}
}
