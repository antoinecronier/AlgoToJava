package imiepoecjava2017.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

import imiepoecjava2017.entities.Armor;
import imiepoecjava2017.entities.Barbarian;
import imiepoecjava2017.entities.Hero;
import imiepoecjava2017.entities.ItemType;
import imiepoecjava2017.entities.LivingCharacter;
import imiepoecjava2017.entities.Mage;
import imiepoecjava2017.entities.Monster;
import imiepoecjava2017.entities.Paladin;
import imiepoecjava2017.entities.Weapon;
import imiepoecjava2017.managers.Donjon;
import imiepoecjava2017.views.MainWindow;

public class MainWindowController {

	private MainWindow view;
	ArrayList<LivingCharacter> heros = new ArrayList<LivingCharacter>();
	ArrayList<LivingCharacter> monstres = new ArrayList<LivingCharacter>();

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
					mage.setPv(Integer.parseInt(view.getPvTextField().getText()));
					mage.setPa(Integer.parseInt(view.getPaTextField().getText()));
					try {
						mage.setWeapon((Weapon)view.getArmeComboBox().getSelectedItem());
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					try {
						mage.setArmor((Armor)view.getArmureComboBox().getSelectedItem());
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					heros.add(mage);
				}else if (view.getClassesComboBox().getSelectedItem().equals("Paladin")) {
					Paladin paladin = new Paladin();
					paladin.setName(view.getNomTextField().getText());
					paladin.setPv(Integer.parseInt(view.getPvTextField().getText()));
					paladin.setPa(Integer.parseInt(view.getPaTextField().getText()));
					try {
						paladin.setWeapon((Weapon)view.getArmeComboBox().getSelectedItem());
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					try {
						paladin.setArmor((Armor)view.getArmureComboBox().getSelectedItem());
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					heros.add(paladin);
				}else if (view.getClassesComboBox().getSelectedItem().equals("Barbar")) {
					Barbarian barbarian = new Barbarian();
					barbarian.setName(view.getNomTextField().getText());
					barbarian.setPv(Integer.parseInt(view.getPvTextField().getText()));
					barbarian.setPa(Integer.parseInt(view.getPaTextField().getText()));
					try {
						barbarian.setWeapon((Weapon)view.getArmeComboBox().getSelectedItem());
						barbarian.setSecondWeapon(new Weapon("bbWeap", 4, 1, ItemType.PHYSIC));
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					try {
						barbarian.setArmor((Armor)view.getArmureComboBox().getSelectedItem());
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					heros.add(barbarian);
				}else if (view.getClassesComboBox().getSelectedItem().equals("Monstre")) {
					Monster monstre = new Monster();
					monstre.setName(view.getNomTextField().getText());
					monstre.setPv(Integer.parseInt(view.getPvTextField().getText()));
					monstre.setPa(Integer.parseInt(view.getPaTextField().getText()));
					try {
						monstre.setWeapon((Weapon)view.getArmeComboBox().getSelectedItem());
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					try {
						monstre.setArmor((Armor)view.getArmureComboBox().getSelectedItem());
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					monstres.add(monstre);
				}

				view.SetJListHeros(heros);
				view.SetJListMonstres(monstres);
			}
		});

		view.getBtnCombat().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Donjon d = new Donjon(heros,monstres);
				d.doTheDonjon();
			}
		});
	}
}
