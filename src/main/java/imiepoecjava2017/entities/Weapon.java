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

	/* (non-Javadoc)
	 * @see imiepoecjava2017.entities.Item#setType(imiepoecjava2017.entities.ItemType)
	 */
	@Override
	public void setType(ItemType type) throws Exception {
		if (!type.equals(ItemType.MIXTE)) {
			super.setType(type);
		}else{
			throw new Exception();
		}
	}

	public Weapon(String name, int damage, int actionPoint, ItemType type) throws Exception {
		super();
		this.setName(name);
		this.setDamage(damage);
		this.setActionPoint(actionPoint);
		this.setType(type);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Weapon [damage=" + damage + ", actionPoint=" + actionPoint
				+ ", getName()=" + getName() + ", getType()=" + getType() + "]\n";
	}
}
