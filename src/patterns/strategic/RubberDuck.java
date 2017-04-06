package patterns.strategic;

public class RubberDuck extends Duck{
	public RubberDuck(){
		
		quackBehavior= new Squeak(); // definisco un oggetto quack
		flyBehavior = new FlyNoWay(); // definisco un oggetto FlyWithWings
	}
		
		public void display(){
		System.out.println("I'm a RubberDuck");
	}
		
}
