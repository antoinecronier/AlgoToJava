package imiepoecjava2017.entities;

public abstract class LivingCharacter implements Fighter {

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
	 * @throws Exception
	 */
	public void setWeapon(Weapon weapon) throws Exception {
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
	 * @throws Exception
	 */
	public void setArmor(Armor armor) throws Exception {
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

	/* (non-Javadoc)
	 * @see imiepoecjava2017.entities.Fighter#fight(imiepoecjava2017.entities.LivingCharacter)
	 */
	@Override
	public void fight(LivingCharacter attack, LivingCharacter ennemi) {
		int pa = this.getPa();
		while (pa - this.getWeapon().getActionPoint() > 0) {
			pa -= this.getWeapon().getActionPoint();
			if (this.getWeapon().getDamage()
					- ennemi.getArmor().getDefence() > 0) {
				ennemi.setPv(ennemi.getPv()
						- (this.getWeapon().getDamage() - ennemi
								.getArmor().getDefence()));
				fightSuccessMessage(attack, ennemi);
				if (ennemi.getPv() <= 0) {
					return;
				}
			}else{
				fightLoseMessage(attack, ennemi);
			}
		}
	}

	/* (non-Javadoc)
	 * @see imiepoecjava2017.entities.Fighter#fightSuccessMessage(imiepoecjava2017.entities.LivingCharacter, imiepoecjava2017.entities.LivingCharacter)
	 */
	@Override
	public void fightSuccessMessage(LivingCharacter attack,
			LivingCharacter ennemi) {
//		System.out.println("Le combatant " + this.getName() + " arrache la tronche de " + ennemi.getName() + " pour " + (this.getWeapon().getDamage() - ennemi
//				.getArmor().getDefence() + " degat"));
//		System.out.println("L'ennemi " + ennemi.getName() + " ne possède plus que " + ennemi.getPv() + " pv");
	}

	/* (non-Javadoc)
	 * @see imiepoecjava2017.entities.Fighter#fightLoseMessage(imiepoecjava2017.entities.LivingCharacter, imiepoecjava2017.entities.LivingCharacter)
	 */
	@Override
	public void fightLoseMessage(LivingCharacter attack, LivingCharacter ennemi) {
//		System.out.println("Le combatant " + this.getName() + " n'arrive a rien face a " + ennemi.getName());
//		System.out.println("L'ennemi " + ennemi.getName() + " a toujours " + ennemi.getPv() + " pv");
	}
}
