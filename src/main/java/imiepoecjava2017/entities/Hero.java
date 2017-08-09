package imiepoecjava2017.entities;

import java.util.ArrayList;

public class Hero extends LivingCharacter {
	private ArrayList<Item> stuff;

	/**
	 * @return the stuff
	 */
	public ArrayList<Item> getStuff() {
		return stuff;
	}

	/**
	 * @param stuff the stuff to set
	 */
	public void setStuff(ArrayList<Item> stuff) {
		this.stuff = stuff;
	}

	public Hero(){
		this.stuff = new ArrayList<Item>();
	}

	public Hero(String name, int pv, int pa, Weapon weapon, Armor armor) {
		super(name, pv, pa, weapon, armor);
	}
}
