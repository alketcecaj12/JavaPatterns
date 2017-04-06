package patterns.strategic;

public abstract class Duck {
FlyBehavior flyBehavior;
QuackBehavior quackBehavior ;

public abstract void display();
public void performFly(){
	flyBehavior.fly();
}
public void performQuack(){
	quackBehavior.quack();
}
public void swim(){
	System.out.println("all ducks swim even decoys");
}
public void setFlyBehavior(FlyBehavior fb){
	flyBehavior = fb;
}
public void setQuackBehavior(QuackBehavior qb){
	quackBehavior = qb;
	
}
}

