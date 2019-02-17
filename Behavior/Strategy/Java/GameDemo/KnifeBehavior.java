public class KnifeBehavior implements WeaponBehavior {
	public void use() {
		System.out.println("use KnifeBehavior");
	}

	public String description(){
		return "Knife";
	}
}