public class Game {
	public static void main(String[] args) {
		System.out.println("Start");
		Character king = new King();
		king.display();
		king.performWeapon();
		System.out.println("Change weapon");
		king.setWeaponBehavior( new BowAndArrowBehavior() );
		king.performWeapon();

		System.out.println("Change weapon");
		king.setWeaponBehavior( new AxeBehavior() );
		king.performWeapon();
	}
}