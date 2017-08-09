package imiepoecjava2017.entities;

import java.util.ArrayList;

public class Monster extends LivingCharacter {

	private ArrayList<Item> loots;
	private Fighter fighter;

	/**
	 * @return the loots
	 */
	public ArrayList<Item> getLoots() {
		return loots;
	}

	/**
	 * @param loots the loots to set
	 */
	public void setLoots(ArrayList<Item> loots) {
		this.loots = loots;
	}

	public Monster() {
		super();
		loots = new ArrayList<Item>();
	}

	public Monster(String name, int pv, int pa, Weapon weapon, Armor armor) {
		super(name, pv, pa, weapon, armor);
		loots = new ArrayList<Item>();
	}

	public Monster(String name, int pv, int pa, Weapon weapon, Armor armor, ArrayList<Item> loots) {
		super(name, pv, pa, weapon, armor);
		this.loots = loots;
	}

	public Monster(String name, int pv, int pa, Weapon weapon, Armor armor, Fighter fighter) {
		super(name, pv, pa, weapon, armor);
		loots = new ArrayList<Item>();
		this.fighter = fighter;
	}

	public Monster(String name, int pv, int pa, Weapon weapon, Armor armor, ArrayList<Item> loots, Fighter fighter) {
		super(name, pv, pa, weapon, armor);
		this.loots = loots;
		this.fighter = fighter;
	}

	/* (non-Javadoc)
	 * @see imiepoecjava2017.entities.LivingCharacter#fight(imiepoecjava2017.entities.LivingCharacter)
	 */
	@Override
	public void fight(LivingCharacter attack, LivingCharacter ennemi) {
		if (this.fighter != null) {
			this.fighter.fight(attack,ennemi);
		}else{
			super.fight(attack,ennemi);
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Monster [loots=" + loots
				+ ", getName()=" + getName() + ", getPv()=" + getPv()
				+ ", getPa()=" + getPa()
				//+ ", getWeapon()=" + getWeapon() + ", getArmor()=" + getArmor()
				+ "]\n";
	}
}
