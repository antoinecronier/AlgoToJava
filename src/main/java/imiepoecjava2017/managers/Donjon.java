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
	}

	private LivingCharacter fight(LivingCharacter fighter1,
			LivingCharacter fighter2) {

		while (fighter1.getPv() > 0 && fighter2.getPv() > 0) {
			fightTurn(fighter1, fighter2);
			if (fighter2.getPv() > 0) {
				fightTurn(fighter2, fighter1);
			}
		}

		if (fighter1.getPv() < 0) {
			return fighter1;
		}else{
			return fighter2;
		}
	}

	private void fightTurn(LivingCharacter fighter1, LivingCharacter fighter2) {
		int pa = fighter1.getPa();
		while (pa - fighter1.getWeapon().getActionPoint() > 0) {
			pa -= fighter1.getWeapon().getActionPoint();
			if (fighter1.getWeapon().getDamage()
					- fighter2.getArmor().getDefence() > 0) {
				fighter2.setPv(fighter2.getPv()
						- (fighter1.getWeapon().getDamage() - fighter2
								.getArmor().getDefence()));
				System.out.println("Le combatant " + fighter1.getName() + " arrache la tronche de " + fighter2.getName() + " pour " + (fighter1.getWeapon().getDamage() - fighter2
								.getArmor().getDefence() + " degat"));
				if (fighter2.getPv() <= 0) {
					return;
				}
			}else{
				System.out.println("Le combatant " + fighter1.getName() + " n'arrive a rien face a " + fighter2.getName());
			}
		}
	}
}
