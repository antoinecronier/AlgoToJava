package imiepoecjava2017.entities;

public class PetitePlanet extends Planete {

	private PetitAeroport aeroport;

	public PetitePlanet(String name) {
		super(name);
	}

	public PetitePlanet(String name, int attraction) {
		super(name, attraction);
	}

	@Override
	public boolean decolle(Fusee fusee) {
		if (fusee.getPuissance() - this.getAttraction() + 1 > 0) {
			return true;
		}else {
			return false;
		}
	}

}
