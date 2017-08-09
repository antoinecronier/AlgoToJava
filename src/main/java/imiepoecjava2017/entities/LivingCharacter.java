package imiepoecjava2017.entities;

public abstract class LivingCharacter {

	private String name;
	private int pv;
	private int pa;
	private Weapon weapon;
	private Armor armor;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the pv
	 */
	public int getPv() {
		return pv;
	}
	/**
	 * @param pv the pv to set
	 */
	public void setPv(int pv) {
		this.pv = pv;
	}
	/**
	 * @return the pa
	 */
	public int getPa() {
		return pa;
	}
	/**
	 * @param pa the pa to set
	 */
	public void setPa(int pa) {
		this.pa = pa;
	}
	/**
	 * @return the weapon
	 */
	public Weapon getWeapon() {
		return weapon;
	}
	/**
	 * @param weapon the weapon to set
	 */
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	/**
	 * @return the armor
	 */
	public Armor getArmor() {
		return armor;
	}
	/**
	 * @param armor the armor to set
	 */
	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public LivingCharacter(String name, int pv, int pa, Weapon weapon,
			Armor armor) {
		super();
		this.name = name;
		this.pv = pv;
		this.pa = pa;
		this.weapon = weapon;
		this.armor = armor;
	}

	public LivingCharacter() {
	}
}
