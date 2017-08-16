package imiepoecjava2017test.entities;

import static org.junit.Assert.*;

import java.util.ArrayList;

import imiepoecjava2017.entities.Armor;
import imiepoecjava2017.entities.ItemType;
import imiepoecjava2017.entities.Monster;
import imiepoecjava2017.entities.Paladin;
import imiepoecjava2017.entities.Weapon;
import imiepoecjava2017test.TestConfigurater;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PaladinTest {

	private Paladin paladinEmptyTest;
	private Paladin paladinTest;

	private static ArrayList<Weapon> weapons;
	private static ArrayList<Armor> armors;

	private static int PALADIN_MIN_WEAPON = 3;
	private static int PALADIN_MIN_ARMOR = 6;

	@BeforeClass
	public static void setUpBeforeClass() {
		weapons = new ArrayList<Weapon>();
		armors = new ArrayList<Armor>();

		TestConfigurater.generateWeapons(weapons);
		TestConfigurater.generateArmors(armors);
	}

	@Before
	public void setUp() throws Exception {
		paladinTest = new Paladin("paladin", 10, 5, new Weapon("weapon1", 6, 2,
				ItemType.MAGIC), new Armor("armor1", 6, ItemType.MIXTE));
		paladinEmptyTest = new Paladin();
	}

	@After
	public void tearDown() throws Exception {
		paladinTest = null;
		paladinEmptyTest = null;
	}

	@Test
	public void testSetWeapon() {
		try {
			for (Weapon weapon : weapons) {

				if (weapon.getDamage() >= PALADIN_MIN_WEAPON) {
					paladinTest.setWeapon(weapon);
					paladinEmptyTest.setWeapon(weapon);
					assertEquals(weapon, paladinTest.getWeapon());
					assertEquals(weapon, paladinEmptyTest.getWeapon());
				}
			}
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test(expected = Exception.class)
	public void testSetWeaponException() throws Exception {
		try {
			for (Weapon weapon : weapons) {

				if (weapon.getDamage() < PALADIN_MIN_WEAPON) {
					paladinTest.setWeapon(weapon);
					paladinEmptyTest.setWeapon(weapon);
				}
			}
		} catch (Exception e) {
			throw e;
		}
	}

	@Test
	public void testSetArmor() {
		try {
			for (Armor armor : armors) {

				if (armor.getDefence() >= PALADIN_MIN_ARMOR) {
					paladinTest.setArmor(armor);
					paladinEmptyTest.setArmor(armor);
					assertEquals(armor, paladinTest.getArmor());
					assertEquals(armor, paladinEmptyTest.getArmor());
				}
			}
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test(expected = Exception.class)
	public void testSetArmorException() throws Exception {
		try {
			for (Armor armor : armors) {

				if (armor.getDefence() < PALADIN_MIN_ARMOR) {
					paladinTest.setArmor(armor);
					paladinEmptyTest.setArmor(armor);
				}
			}
		} catch (Exception e) {
			throw e;
		}
	}

	@Test
	public void testFight() {
		try {
			//Paladin inflige 12 points de dégats en 2 tours
			paladinTest = new Paladin("paladin", 10, 5, new Weapon("weapon1", 6, 2,
					ItemType.MAGIC), new Armor("armor1", 6, ItemType.MIXTE));

			//Monstre bloque 4 points de dégats en 2 tours
			Monster monster = new Monster("monster1", 5, 2, new Weapon(
					"weapon1", 8, 2, ItemType.PHYSIC), new Armor("armor1", 2,
					ItemType.MAGIC));
			//Monstre reçoit 8 points de dégat
			paladinTest.fight(paladinTest, monster);

			assertEquals(-3, monster.getPv());
			assertEquals(10, paladinTest.getPv());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	int pa = this.getPa();
//	while (pa - this.getWeapon().getActionPoint() > 0) {
//		pa -= this.getWeapon().getActionPoint();
//		if (this.getWeapon().getDamage()
//				- ennemi.getArmor().getDefence() > 0) {
//			ennemi.setPv(ennemi.getPv()
//					- (this.getWeapon().getDamage() - ennemi
//							.getArmor().getDefence()));
//			fightSuccessMessage(attack,ennemi);
//			if (ennemi.getPv() <= 0) {
//				return;
//			}
//		}else{
//			fightLoseMessage(attack, ennemi);
//		}
//	}

	@Test
	public void testGetWeapon() {
		try {
			for (Weapon weapon : weapons) {

				if (weapon.getDamage() >= PALADIN_MIN_WEAPON) {
					paladinTest.setWeapon(weapon);
					paladinEmptyTest.setWeapon(weapon);
					assertEquals(weapon, paladinTest.getWeapon());
					assertEquals(weapon, paladinEmptyTest.getWeapon());
				}
			}
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testGetArmor() {
		try {
			for (Armor armor : armors) {

				if (armor.getDefence() >= PALADIN_MIN_ARMOR) {
					paladinTest.setArmor(armor);
					paladinEmptyTest.setArmor(armor);
					assertEquals(armor, paladinTest.getArmor());
					assertEquals(armor, paladinEmptyTest.getArmor());
				}
			}
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
