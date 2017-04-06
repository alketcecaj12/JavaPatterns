package patterns.decorator;

public class StarBuzzCoffe {

	public static void main (String[]args){
	
		Beverage beverage= new Espresso();
    	
	System.out.println(beverage.getDescription()+"$"+beverage.cost());

	Beverage beverage2= new DarkRoast();

	beverage2= new Mocha(beverage2);
 
 beverage2= new Milk(beverage2);

 System.out.println(beverage2.getDescription()+"$"+beverage2.cost());

 Beverage houseblend= new HouseBlend();
 houseblend = new Mocha(new Milk (new Whip(houseblend)));
 
// houseblend = new Mocha(houseblend);
 //houseblend = new Whip(houseblend);
 System.out.println(houseblend.getDescription()+"$"+houseblend.cost());
 Beverage decaf = new Decaf();
 decaf = new Mocha(new Whip(new Whip(new Mocha(decaf))));
 System.out.println(decaf.getDescription());
 
 Beverage be = new Espresso();
// Mocha m = new Mocha(b);
be = (new Whip(new Mocha(be)));
	System.out.println("la bevanda b è " +be.getDescription()+" e costa"+be.cost());
	}
}
