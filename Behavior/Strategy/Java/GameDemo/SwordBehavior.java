public class SwordBehavior implements WeaponBehavior {
	public void use() {
		System.out.println("use SwordBehavior");
	}

	public String description(){
		return "Sword";
	}
}