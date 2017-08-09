package imiepoecjava2017.entities;

public class Barbarian extends Hero {

	private Weapon secondWeapon;

	/**
	 * @return the secondWeapon
	 */
	public Weapon getSecondWeapon() {
		return secondWeapon;
	}

	/**
	 * @param secondWeapon the secondWeapon to set
	 * @throws Exception
	 */
	public void setSecondWeapon(Weapon secondWeapon) throws Exception {
		if (secondWeapon.getType().equals(ItemType.PHYSIC)) {
			super.setWeapon(secondWeapon);
		}else{
			throw new Exception("Barbarian can only equipe physic weapon");
		}
	}

	/* (non-Javadoc)
	 * @see imiepoecjava2017.entities.LivingCharacter#setWeapon(imiepoecjava2017.entities.Weapon)
	 */
	@Override
	public void setWeapon(Weapon weapon) throws Exception {
		if (weapon.getType().equals(ItemType.PHYSIC)) {
			super.setWeapon(weapon);
		}else{
			throw new Exception("Barbarian can only equipe physic weapon");
		}
	}

	/* (non-Javadoc)
	 * @see imiepoecjava2017.entities.LivingCharacter#setArmor(imiepoecjava2017.entities.Armor)
	 */
	@Override
	public void setArmor(Armor armor) throws Exception {
		if (armor.getType().equals(ItemType.PHYSIC)) {
			super.setArmor(armor);
		}else{
			throw new Exception("Barbarian can only equipe physic armor");
		}
	}

	public Barbarian() {
		super();
	}

	public Barbarian(String name, int pv, int pa, Weapon weapon, Weapon secondWeapon, Armor armor) throws Exception {
		this.setName(name);
		this.setPv(pv);
		this.setPa(pa);
		this.setWeapon(weapon);
		this.setArmor(armor);
		this.setSecondWeapon(secondWeapon);
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
