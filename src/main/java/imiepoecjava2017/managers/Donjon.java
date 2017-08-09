package imiepoecjava2017.managers;

import imiepoecjava2017.entities.Hero;
import imiepoecjava2017.entities.LivingCharacter;
import imiepoecjava2017.entities.Monster;

import java.util.ArrayList;

public class Donjon {

	private ArrayList<Hero> heros;
	private ArrayList<Monster> monsters;

	public Donjon(ArrayList<Hero> heros, ArrayList<Monster> monsters) {
		super();
		this.heros = heros;
		this.monsters = monsters;
	}

	public void doTheDonjon() {
		while(!heros.isEmpty() && !monsters.isEmpty()){
			LivingCharacter dead = fight(heros.get(0), monsters.get(0));
			if (dead instanceof Monster) {
				monsters.remove(dead);
			}else{
				heros.remove(dead);
			}
		}

		if (!heros.isEmpty()) {
			System.out.println("Les heros gagnent");
		}else{
			System.out.println("Les monstres gagnent");
		}

		System.out.println(heros);
		System.out.println(monsters);
	}

	private LivingCharacter fight(LivingCharacter fighter1,
			LivingCharacter fighter2) {

		while (fighter1.getPv() > 0 && fighter2.getPv() > 0) {
			fighter1.fight(fighter1,fighter2);
			if (fighter2.getPv() > 0) {
				fighter2.fight(fighter2,fighter1);
			}
		}

		if (fighter1.getPv() <= 0) {
			return fighter1;
		}else{
			return fighter2;
		}
	}
}
