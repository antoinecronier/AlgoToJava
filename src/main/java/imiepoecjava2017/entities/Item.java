package imiepoecjava2017.entities;

public abstract class Item {
	private String name;
	private ItemType type;

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
	 * @return the type
	 */
	public ItemType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 * @throws Exception
	 */
	public void setType(ItemType type) throws Exception {
		this.type = type;
	}
}
