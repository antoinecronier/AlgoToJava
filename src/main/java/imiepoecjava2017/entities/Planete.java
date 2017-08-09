package imiepoecjava2017.entities;

public abstract class Planete {
	private String name;
	private int attraction;

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
	 * @return the attraction
	 */
	public int getAttraction() {
		return attraction;
	}

	/**
	 * @param attraction the attraction to set
	 */
	public void setAttraction(int attraction) {
		this.attraction = attraction;
	}

	public Planete(String name) {
		super();
		this.name = name;
		attraction = 1;
	}

	public Planete(String name, int attraction) {
		super();
		this.name = name;
		this.attraction = attraction;
	}

	public abstract boolean decolle(Fusee fusee);

	public boolean atterir(Fusee fusee){
		if (fusee.getPuissance() - this.attraction*5 > 0) {
			return true;
		}else {
			return false;
		}
	}
}
