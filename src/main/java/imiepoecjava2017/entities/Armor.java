package imiepoecjava2017.entities;

public class Armor extends Item {
	private int defence;

	/**
	 * @return the defence
	 */
	public int getDefence() {
		return defence;
	}

	/**
	 * @param defence the defence to set
	 */
	public void setDefence(int defence) {
		this.defence = defence;
	}

	public Armor(String name, int defence) {
		super();
		this.setName(name);
		this.setDefence(defence);
	}
}
