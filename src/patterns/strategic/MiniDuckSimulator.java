package patterns.strategic;

public class MiniDuckSimulator {

	public static void main (String[] args){
  
Duck mallard= new MallardDuck();// è possibile in quanto MallardDuck eredita da Duck
System.out.print("La mallard fa : ");	
mallard.performQuack(); // l'oggetto può chiamare i due mettodi la MaallardDuck eredetita da Duck
System.out.println("");
System.out.print("La mallard vola : ");
mallard.performFly(); 
System.out.println("");
System.out.print("La mallard vola con un missile : ");
	mallard.setFlyBehavior(new FlyRockedPowered());
	System.out.println("");
	
	System.out.print("La mallard puo fare anche squeak : ");
	mallard.setQuackBehavior(new Squeak());
	System.out.println("");
	System.out.print("tocca alla Model duck");
	Duck model = new ModelDuck();
	model.performFly();
	System.out.println("");
	model.setFlyBehavior(new FlyRockedPowered());
	model.performFly();
	
	System.out.println("tocca alla rubber duck");
	Duck rubber = new RubberDuck();
	rubber.display();
	rubber.performFly();
	rubber.performQuack();
	System.out.println("fine");
	rubber.setFlyBehavior(new FlyRockedPowered());
	System.out.print("ma posso volare con un missile");
	rubber.performFly();
	rubber.setQuackBehavior(new Quack());
	System.out.print("ma posso fare anche quack se qualcuno mi doppia");
	rubber.performQuack();
	}

}
