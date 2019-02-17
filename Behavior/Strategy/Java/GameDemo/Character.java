public abstract class Character {
	WeaponBehavior weaponBehavior;
	
	public Character() {}

	public abstract void display();
	
	public void setWeaponBehavior(WeaponBehavior wb) {
		weaponBehavior = wb;
	}

	public void performWeapon() {
		System.out.println("Estoy usando " + weaponBehavior.description() );
		weaponBehavior.use();
	}
	
	public void greet() {
		System.out.println("Hi !");
	}
}