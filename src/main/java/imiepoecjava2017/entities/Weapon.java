package imiepoecjava2017.entities;

public class Weapon extends Item {
	private int damage;
	private int actionPoint;

	/**
	 * @return the damage
	 */
	public int getDamage() {
		return damage;
	}

	/**
	 * @param damage the damage to set
	 */
	public void setDamage(int damage) {
		this.damage = damage;
	}

	/**
	 * @return the actionPoint
	 */
	public int getActionPoint() {
		return actionPoint;
	}

	/**
	 * @param actionPoint the actionPoint to set
	 */
	public void setActionPoint(int actionPoint) {
		this.actionPoint = actionPoint;
	}

	public Weapon(String name, int damage, int actionPoint) {
		super();
		this.setName(name);
		this.setDamage(damage);
		this.setActionPoint(actionPoint);
	}
}
