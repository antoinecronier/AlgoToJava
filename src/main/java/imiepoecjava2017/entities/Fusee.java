package imiepoecjava2017.entities;

import java.util.ArrayList;

public class Fusee {
	private String name;
	private ArrayList<Cosmonaute> cosmonautes;
	private Planete depart;
	private Planete arrive;
	private int puissance;

	/**
	 * @return the puissance
	 */
	public int getPuissance() {
		return puissance;
	}
	/**
	 * @param puissance the puissance to set
	 */
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
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
	 * @return the cosmonautes
	 */
	public ArrayList<Cosmonaute> getCosmonautes() {
		return cosmonautes;
	}
	/**
	 * @param cosmonautes the cosmonautes to set
	 */
	public void setCosmonautes(ArrayList<Cosmonaute> cosmonautes) {
		this.cosmonautes = cosmonautes;
	}

	/**
	 * @return the depart
	 */
	public Planete getDepart() {
		return depart;
	}

	/**
	 * @param depart the depart to set
	 */
	public void setDepart(Planete depart) {
		this.depart = depart;
	}

	/**
	 * @return the arrive
	 */
	public Planete getArrive() {
		return arrive;
	}

	/**
	 * @param arrive the arrive to set
	 */
	public void setArrive(Planete arrive) {
		this.arrive = arrive;
	}

	public Fusee(String name, int puissance, ArrayList<Cosmonaute> cosmonautes) {
		super();
		this.name = name;
		this.cosmonautes = cosmonautes;
		this.puissance = puissance;
	}

	public Fusee(String name, int puissance) {
		super();
		this.name = name;
		this.cosmonautes = new ArrayList<Cosmonaute>();
		this.puissance = puissance;
	}
}
