package imiepoecjava2017test;

import imiepoecjava2017.entities.Armor;
import imiepoecjava2017.entities.ItemType;
import imiepoecjava2017.entities.Weapon;

import java.util.ArrayList;

public class TestConfigurater {
	public static void generateWeapons(ArrayList<Weapon> weapons) {
		try {
			weapons.add(new Weapon("weapon1", 8, 2, ItemType.PHYSIC));
			weapons.add(new Weapon("weapon2", -8, 2, ItemType.PHYSIC));
			weapons.add(new Weapon("weapon3", 2, 2, ItemType.PHYSIC));
			weapons.add(new Weapon("weapon4", 1000000, 2, ItemType.PHYSIC));

			weapons.add(new Weapon("weapon5", 8, 0, ItemType.PHYSIC));
			weapons.add(new Weapon("weapon6", -8, 0, ItemType.PHYSIC));
			weapons.add(new Weapon("weapon7", 2, 0, ItemType.PHYSIC));
			weapons.add(new Weapon("weapon8", 1000000, 0, ItemType.PHYSIC));

			weapons.add(new Weapon("weapon9", 8, -5, ItemType.PHYSIC));
			weapons.add(new Weapon("weapon10", -8, -5, ItemType.PHYSIC));
			weapons.add(new Weapon("weapon11", 2, -5, ItemType.PHYSIC));
			weapons.add(new Weapon("weapon12", 1000000, -5, ItemType.PHYSIC));

			weapons.add(new Weapon("weapon13", 8, 1000000, ItemType.PHYSIC));
			weapons.add(new Weapon("weapon14", -8, 1000000, ItemType.PHYSIC));
			weapons.add(new Weapon("weapon15", 2, 1000000, ItemType.PHYSIC));
			weapons.add(new Weapon("weapon16", 1000000, 1000000, ItemType.PHYSIC));

			weapons.add(new Weapon("weapon17", 8, 2, ItemType.MAGIC));
			weapons.add(new Weapon("weapon18", -8, 2, ItemType.MAGIC));
			weapons.add(new Weapon("weapon19", 2, 2, ItemType.MAGIC));
			weapons.add(new Weapon("weapon20", 1000000, 2, ItemType.MAGIC));

			weapons.add(new Weapon("weapon21", 8, 0, ItemType.MAGIC));
			weapons.add(new Weapon("weapon22", -8, 0, ItemType.MAGIC));
			weapons.add(new Weapon("weapon23", 2, 0, ItemType.MAGIC));
			weapons.add(new Weapon("weapon24", 1000000, 0, ItemType.MAGIC));

			weapons.add(new Weapon("weapon25", 8, -5, ItemType.MAGIC));
			weapons.add(new Weapon("weapon26", -8, -5, ItemType.MAGIC));
			weapons.add(new Weapon("weapon27", 2, -5, ItemType.MAGIC));
			weapons.add(new Weapon("weapon28", 1000000, -5, ItemType.MAGIC));

			weapons.add(new Weapon("weapon29", 8, 1000000, ItemType.MAGIC));
			weapons.add(new Weapon("weapon30", -8, 1000000, ItemType.MAGIC));
			weapons.add(new Weapon("weapon31", 2, 1000000, ItemType.MAGIC));
			weapons.add(new Weapon("weapon32", 1000000, 1000000, ItemType.MAGIC));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void generateArmors(ArrayList<Armor> armors){
		try {
			armors.add(new Armor("armor1", 2, ItemType.MAGIC));
			armors.add(new Armor("armor2", -2, ItemType.MAGIC));
			armors.add(new Armor("armor3", 1000000, ItemType.MAGIC));

			armors.add(new Armor("armor4", 2, ItemType.MIXTE));
			armors.add(new Armor("armor5", -2, ItemType.MIXTE));
			armors.add(new Armor("armor6", 1000000, ItemType.MIXTE));

			armors.add(new Armor("armor7", 2, ItemType.PHYSIC));
			armors.add(new Armor("armor8", -2, ItemType.PHYSIC));
			armors.add(new Armor("armor9", 1000000, ItemType.PHYSIC));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
