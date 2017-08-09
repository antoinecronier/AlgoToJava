package imiepoecjava2017.managers;

import imiepoecjava2017.entities.Cosmonaute;
import imiepoecjava2017.entities.Fusee;
import imiepoecjava2017.entities.GrossePlanet;
import imiepoecjava2017.entities.Planete;

import java.util.ArrayList;

public class StationDeControlle {

	private String name;
	private ArrayList<Fusee> fusees;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the fusees
	 */
	public ArrayList<Fusee> getFusees() {
		return fusees;
	}

	/**
	 * @param fusees
	 *            the fusees to set
	 */
	public void setFusees(ArrayList<Fusee> fusees) {
		this.fusees = fusees;
	}

	public StationDeControlle(String name, ArrayList<Fusee> fusees) {
		super();
		this.name = name;
		this.fusees = fusees;
	}

	public StationDeControlle(String name) {
		super();
		this.name = name;
		this.fusees = new ArrayList<Fusee>();
	}

	public void embarque(Fusee fusee, ArrayList<Cosmonaute> cosmonautes) {
		for (Cosmonaute cosmonaute : cosmonautes) {
			fusee.getCosmonautes().add(cosmonaute);
		}
	}

	public void prepareNavigue(Fusee fusee, Planete depart, Planete arrive) {

		if (depart.decolle(fusee) && arrive.atterir(fusee)) {
			fusee.setDepart(depart);
			fusee.setArrive(arrive);
			System.out.println("Destination OK");
		}else{
			System.out.println("NOP");
		}
	}

	public void naviguer() {
		for (Fusee fusee : fusees) {
			if (fusee.getDepart() != null && fusee.getArrive() != null) {
				System.out.println("La fusee : \"" + fusee.getName() + "\" part de \""
						+ fusee.getDepart().getName() + "\" pour aller a \"" + fusee.getArrive().getName()
						+ "\" avec a son bord \n" + fusee.getCosmonautes());
			}else{
				System.out.println("La fusee : \"" + fusee.getName()+"\" n'a pas pu voyagé");
			}
			System.out.println();
		}
	}
}
