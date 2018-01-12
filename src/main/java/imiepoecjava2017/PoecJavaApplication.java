/**
 *
 */
package imiepoecjava2017;

import java.util.ArrayList;

import imiepoecjava2017.entities.Barbarian;
import imiepoecjava2017.entities.Fighter;
import imiepoecjava2017.entities.Hero;
import imiepoecjava2017.entities.Item;
import imiepoecjava2017.entities.ItemType;
import imiepoecjava2017.entities.LivingCharacter;
import imiepoecjava2017.entities.Mage;
import imiepoecjava2017.entities.Monster;
import imiepoecjava2017.entities.Paladin;
import imiepoecjava2017.entities.Weapon;
import imiepoecjava2017.entities.Armor;
import imiepoecjava2017.managers.Donjon;

public class PoecJavaApplication {

	public static void main(String[] args) throws Exception {
		Weapon arme1 = new Weapon("arme1", 5, 2, ItemType.PHYSIC);
		Armor armure1 = new Armor("armure1", 1, ItemType.PHYSIC);

		Weapon arme2 = new Weapon("arme2", 5, 2, ItemType.MAGIC);
		Armor armure2 = new Armor("armure2", 1, ItemType.MAGIC);

		Weapon arme3 = new Weapon("arme3", 5, 2, ItemType.PHYSIC);
		Armor armure3 = new Armor("armure3", 7, ItemType.MIXTE);

		ArrayList<LivingCharacter> monsters = new ArrayList<LivingCharacter>();
		ArrayList<LivingCharacter> heros = new ArrayList<LivingCharacter>();
		ArrayList<Item> loots = new ArrayList<Item>();
		loots.add(new Weapon("arme1", 5, 2, ItemType.PHYSIC));

		monsters.add(new Monster("m1", 5, 10, arme1, armure1));
		monsters.add(new Monster("m2", 5, 10, arme1, armure1));
		monsters.add(new Monster("m3", 50000, 100, arme1, armure1));
		monsters.add(new Monster("m4", 5, 10, arme3, armure1,loots));
		monsters.add(new Monster("m5", 500, 10, arme1, armure1,new Fighter() {

			@Override
			public void fight(LivingCharacter attack, LivingCharacter ennemi) {
				ennemi.setPv(-1);
				System.out.println("Le combatant m5 tue " + ennemi.getName());
			}

			@Override
			public void fightSuccessMessage(LivingCharacter attack,
					LivingCharacter ennemi) {
			}

			@Override
			public void fightLoseMessage(LivingCharacter attack,
					LivingCharacter ennemi) {
			}
		}));

		heros.add(new Paladin("h1", 5, 15, arme1, armure3));
		heros.add(new Barbarian("h2", 5, 15, arme1, arme3, armure1));
		heros.add(new Mage("h3", 5, 15, arme2, armure2));

//		Weapon arme4 = new Weapon("arme3", 500000, 1, ItemType.PHYSIC);
//		Armor armure4 = new Armor("armure3", 500, ItemType.MIXTE);
//
//		heros.add(new Paladin("jean paul",50000,200,arme4,armure4));

		Donjon donjon = new Donjon(heros, monsters);
		donjon.doTheDonjon();
	}
}
