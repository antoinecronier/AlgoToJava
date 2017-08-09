package imiepoecjava2017.entities;

public final class GrossePlanet extends Planete {

	private GrosAeroport aeroport;

	/**
	 * @return the aeroport
	 */
	public GrosAeroport getAeroport() {
		return aeroport;
	}

	/**
	 * @param aeroport the aeroport to set
	 */
	public void setAeroport(GrosAeroport aeroport) {
		this.aeroport = aeroport;
	}

	public GrossePlanet(String name) {
		super(name);
	}

	public GrossePlanet(String name, int attraction) {
		super(name,attraction);
	}

	@Override
	public boolean decolle(Fusee fusee) {
		if (fusee.getPuissance() - this.getAttraction() + 2 > 0) {
			return true;
		}else {
			return false;
		}
	}
}
