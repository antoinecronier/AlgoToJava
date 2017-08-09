package imiepoecjava2017.entities;

public interface Fighter {

	public abstract void fight(LivingCharacter attack, LivingCharacter ennemi);
	public void fightSuccessMessage(LivingCharacter attack,
			LivingCharacter ennemi);
	public void fightLoseMessage(LivingCharacter attack,
			LivingCharacter ennemi);
}
