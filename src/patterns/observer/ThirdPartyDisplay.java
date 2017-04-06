package patterns.observer;

public class ThirdPartyDisplay implements Observer, DisplayElement{
	private float temperature;
	private float humidity;
	private Subject weatherData;

	public ThirdPartyDisplay(Subject weatherData){
		this.weatherData= weatherData;
		weatherData.registerObserver(this);
	}
	public void update(float temperature, float humidity, float pressure){
		this.temperature=temperature;
		this.humidity=humidity;
		display();
	}
	public void display(){
		System.out.println("Current conditions from ThirdPartyDisplay: "+temperature+"F degrees"+humidity+"humidity");
	}

} 


