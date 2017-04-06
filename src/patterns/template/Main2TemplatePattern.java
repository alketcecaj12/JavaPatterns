package patterns.template;

/*
 * The template method pattern is a behavioral class pattern. A behavioral class pattern uses inheritance for 
 * distribution of behavior. In the template method pattern, a method (the 'template method') defines the steps 
 * of an algorithm. The implementation of these steps (ie, methods) can be deferred to subclasses. Thus, a 
 * particular algorithm is defined in the template method, but the exact steps of this algorithm can be defined 
method is implemented in an abstract class. The steps (methods) of the algorithm are declared in the abstract 
class, and the methods whose implementations are to be delegated to subclasses are declared abstract.
 * Here is an example of the template method pattern. Meal is an abstract class with a template method called
 *  doMeal() that defines the steps involved in a meal. We declare the method as final so that it can't be
 *   overridden. The algorithm defined by doMeal() consists of four steps: prepareIngredients(), cook(), eat(),
 *    and cleanUp(). The eat() method is implemented although subclasses can override the implementation.
 *     The prepareIngredients(), cook(), and cleanUp() methods are are declared abstract so that subclasses 
 *     need to implement them.
 * 
 */

public class Main2TemplatePattern {

	public static void main(String[] args) {

		Meal meal1 = new HamburgerMeal();
		meal1.doMeal();

		System.out.println();

		Meal meal2 = new TacoMeal();
		meal2.doMeal();

	}

}