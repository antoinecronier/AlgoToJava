package imiepoecjava2017.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import imiepoecjava2017.entities.Armor;
import imiepoecjava2017.entities.ItemType;
import imiepoecjava2017.entities.Mage;
import imiepoecjava2017.entities.Weapon;
import imiepoecjava2017.views.MainWindow;

public class MainWindowController {

	private MainWindow view;

	public MainWindowController(MainWindow view){
		this.view = view;
		Init();
	}

	private void Init() {
		List<String> classesOption = new ArrayList<String>();
		classesOption.add("Mage");
		classesOption.add("Paladin");
		classesOption.add("Barbar");
		classesOption.add("Monstre");

		for (String item : classesOption) {
			view.getClassesComboBox().addItem(item);
		}

		List<Weapon> weaponOption = new ArrayList<Weapon>();
		try {
			weaponOption.add(new Weapon("Hache", 5, 3, ItemType.PHYSIC));
			weaponOption.add(new Weapon("Baton", 3, 2, ItemType.MAGIC));
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (Weapon weapon : weaponOption) {
			view.getArmeComboBox().addItem(weapon);
		}

		List<Armor> armorOption = new ArrayList<Armor>();
		try {
			armorOption.add(new Armor("Plastron",2,ItemType.PHYSIC));
			armorOption.add(new Armor("Robe",1,ItemType.MAGIC));
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (Armor armor : armorOption) {
			view.getArmureComboBox().addItem(armor);
		}

		view.getBtnAjouter().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (view.getClassesComboBox().getSelectedItem().equals("Mage")) {
					Mage mage = new Mage();
					mage.setName(view.getNomTextField().getText());
				}
			}
		});
	}
}
