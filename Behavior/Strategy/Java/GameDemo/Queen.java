public class Queen extends Character{

	public Queen() {
		weaponBehavior = new KnifeBehavior();
	}

	public void display(){
		System.out.println("I'm a Queen");
	}
}