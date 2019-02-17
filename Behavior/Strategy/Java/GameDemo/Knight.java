public class Knight extends Character{

	public Knight() {
		weaponBehavior = new SwordBehavior();
	}

	public void display(){
		System.out.println("I'm a Knight");
	}
}