/**
 *
 */
package imiepoecjava2017;

import java.util.ArrayList;
import java.util.List;

import imiepoecjava2017.entities.Cosmonaute;
import imiepoecjava2017.entities.Fusee;
import imiepoecjava2017.entities.GrossePlanet;
import imiepoecjava2017.entities.PetitePlanet;
import imiepoecjava2017.entities.Planete;
import imiepoecjava2017.managers.StationDeControlle;

public class PoecJavaApplication {

	public static void main(String[] args) {
		StationDeControlle ctrl1 = new StationDeControlle("terre controle");
		ctrl1.getFusees().add(new Fusee("quick vessel",2000000));

		ArrayList<Cosmonaute> company1 = new ArrayList<Cosmonaute>();
		company1.add(new Cosmonaute("jean-loui", "on"));
		company1.add(new Cosmonaute("therese", "on"));

		ArrayList<Cosmonaute> company2 = new ArrayList<Cosmonaute>();
		company2.add(new Cosmonaute("jean-michel", "dupont"));
		company2.add(new Cosmonaute("huguette", "clairence"));

		ctrl1.embarque(ctrl1.getFusees().get(0), company1);

		ctrl1.getFusees().add(new Fusee("slow one",20 , company2));

		Planete mars = new GrossePlanet("Mars",3);
		GrossePlanet terre = new GrossePlanet("Terre");
		Planete saturne = new PetitePlanet("Saturne");
		Planete p062496 = new PetitePlanet("p062496", 50);

		ctrl1.prepareNavigue(ctrl1.getFusees().get(0), mars, terre);
		ctrl1.prepareNavigue(ctrl1.getFusees().get(1), saturne, p062496);

		ctrl1.naviguer();
	}
}
