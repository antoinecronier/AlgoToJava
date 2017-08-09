package imiepoecjava2017.entities;

public class Paladin extends Hero {

	/* (non-Javadoc)
	 * @see imiepoecjava2017.entities.LivingCharacter#setWeapon(imiepoecjava2017.entities.Weapon)
	 */
	@Override
	public void setWeapon(Weapon weapon) throws Exception {
		if (weapon.getDamage() > 3) {
			super.setWeapon(weapon);
		}else{
			throw new Exception("Paladin cannot pick weapon with less than 4 damage");
		}
	}

	/* (non-Javadoc)
	 * @see imiepoecjava2017.entities.LivingCharacter#setArmor(imiepoecjava2017.entities.Armor)
	 */
	@Override
	public void setArmor(Armor armor) throws Exception {
		if (armor.getDefence() > 5) {
			super.setArmor(armor);
		}else{
			throw new Exception("Paladin cannot wear armor with less than 6 defence");
		}
	}

	public Paladin() {
		super();
	}

	public Paladin(String name, int pv, int pa, Weapon weapon, Armor armor) throws Exception {
		this.setName(name);
		this.setPv(pv);
		this.setPa(pa);
		this.setWeapon(weapon);
		this.setArmor(armor);
	}

	@Override
	public void fight(LivingCharacter attack, LivingCharacter ennemi) {
		int pa = this.getPa();
		while (pa - this.getWeapon().getActionPoint() > 0) {
			pa -= this.getWeapon().getActionPoint();
			if (this.getWeapon().getDamage()
					- ennemi.getArmor().getDefence() > 0) {
				ennemi.setPv(ennemi.getPv()
						- (this.getWeapon().getDamage() - ennemi
								.getArmor().getDefence()));
				fightSuccessMessage(attack,ennemi);
				if (ennemi.getPv() <= 0) {
					return;
				}
			}else{
				fightLoseMessage(attack, ennemi);
			}
		}
	}
}
