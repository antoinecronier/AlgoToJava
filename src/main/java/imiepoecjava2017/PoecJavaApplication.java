/**
 *
 */
package imiepoecjava2017;

import java.util.ArrayList;

import imiepoecjava2017.entities.Hero;
import imiepoecjava2017.entities.Monster;
import imiepoecjava2017.entities.Weapon;
import imiepoecjava2017.entities.Armor;
import imiepoecjava2017.managers.Donjon;


public class PoecJavaApplication {

	public static void main(String[] args) {
		Weapon arme1 = new Weapon("concasseur",5,2);
		Armor armure1 = new Armor("gillet bleu", 1);

		ArrayList<Monster> monsters = new ArrayList<Monster>();
		ArrayList<Hero> heros = new ArrayList<Hero>();

		monsters.add(new Monster("m1",5,10,arme1,armure1));
		monsters.add(new Monster("m2",5,10,arme1,armure1));
		monsters.add(new Monster("m3",50000,100,arme1,armure1));
		monsters.add(new Monster("m4",5,10,arme1,armure1));
		monsters.add(new Monster("m5",5,10,arme1,armure1));

		heros.add(new Hero("h1",5,15,arme1,armure1));
		heros.add(new Hero("h2",5,15,arme1,armure1));
		heros.add(new Hero("h3",5,15,arme1,armure1));
		heros.add(new Hero("h4",5,200,arme1,armure1));

		Donjon donjon = new Donjon(heros, monsters);
		donjon.doTheDonjon();
	}
}
