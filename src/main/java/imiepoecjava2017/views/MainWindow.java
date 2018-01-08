package imiepoecjava2017.views;

import imiepoecjava2017.controllers.MainWindowController;
import imiepoecjava2017.entities.Armor;
import imiepoecjava2017.entities.LivingCharacter;
import imiepoecjava2017.entities.Weapon;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MainWindow {

	private JFrame frame;
	private JTextField nomTextField;
	private JTextField pvTextField;
	private JTextField paTextField;
	private JLabel lblClasses;
	private JComboBox<String> classesComboBox;
	private JLabel lblNom;
	private JLabel lblPv;
	private JLabel lblPa;
	private JLabel lblArme;
	private JComboBox<Weapon> armeComboBox;
	private JLabel lblArmure;
	private JComboBox<Armor> ArmureComboBox;
	private JButton btnAjouter;
	private JList<LivingCharacter> jlistHeros;

	/**
	 * @return the frame
	 */
	public JFrame getFrame() {
		return frame;
	}

	/**
	 * @param frame the frame to set
	 */
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	/**
	 * @return the nomTextField
	 */
	public JTextField getNomTextField() {
		return nomTextField;
	}

	/**
	 * @param nomTextField the nomTextField to set
	 */
	public void setNomTextField(JTextField nomTextField) {
		this.nomTextField = nomTextField;
	}

	/**
	 * @return the pvTextField
	 */
	public JTextField getPvTextField() {
		return pvTextField;
	}

	/**
	 * @param pvTextField the pvTextField to set
	 */
	public void setPvTextField(JTextField pvTextField) {
		this.pvTextField = pvTextField;
	}

	/**
	 * @return the paTextField
	 */
	public JTextField getPaTextField() {
		return paTextField;
	}

	/**
	 * @param paTextField the paTextField to set
	 */
	public void setPaTextField(JTextField paTextField) {
		this.paTextField = paTextField;
	}

	/**
	 * @return the lblClasses
	 */
	public JLabel getLblClasses() {
		return lblClasses;
	}

	/**
	 * @param lblClasses the lblClasses to set
	 */
	public void setLblClasses(JLabel lblClasses) {
		this.lblClasses = lblClasses;
	}

	/**
	 * @return the classesComboBox
	 */
	public JComboBox<String> getClassesComboBox() {
		return classesComboBox;
	}

	/**
	 * @param classesComboBox the classesComboBox to set
	 */
	public void setClassesComboBox(JComboBox<String> classesComboBox) {
		this.classesComboBox = classesComboBox;
	}

	/**
	 * @return the lblNom
	 */
	public JLabel getLblNom() {
		return lblNom;
	}

	/**
	 * @param lblNom the lblNom to set
	 */
	public void setLblNom(JLabel lblNom) {
		this.lblNom = lblNom;
	}

	/**
	 * @return the lblPv
	 */
	public JLabel getLblPv() {
		return lblPv;
	}

	/**
	 * @param lblPv the lblPv to set
	 */
	public void setLblPv(JLabel lblPv) {
		this.lblPv = lblPv;
	}

	/**
	 * @return the lblPa
	 */
	public JLabel getLblPa() {
		return lblPa;
	}

	/**
	 * @param lblPa the lblPa to set
	 */
	public void setLblPa(JLabel lblPa) {
		this.lblPa = lblPa;
	}

	/**
	 * @return the lblArme
	 */
	public JLabel getLblArme() {
		return lblArme;
	}

	/**
	 * @param lblArme the lblArme to set
	 */
	public void setLblArme(JLabel lblArme) {
		this.lblArme = lblArme;
	}

	/**
	 * @return the armeComboBox
	 */
	public JComboBox<Weapon> getArmeComboBox() {
		return armeComboBox;
	}

	/**
	 * @param armeComboBox the armeComboBox to set
	 */
	public void setArmeComboBox(JComboBox<Weapon> armeComboBox) {
		this.armeComboBox = armeComboBox;
	}

	/**
	 * @return the lblArmure
	 */
	public JLabel getLblArmure() {
		return lblArmure;
	}

	/**
	 * @param lblArmure the lblArmure to set
	 */
	public void setLblArmure(JLabel lblArmure) {
		this.lblArmure = lblArmure;
	}

	/**
	 * @return the armureComboBox
	 */
	public JComboBox<Armor> getArmureComboBox() {
		return ArmureComboBox;
	}

	/**
	 * @param armureComboBox the armureComboBox to set
	 */
	public void setArmureComboBox(JComboBox<Armor> armureComboBox) {
		ArmureComboBox = armureComboBox;
	}

	/**
	 * @return the btnAjouter
	 */
	public JButton getBtnAjouter() {
		return btnAjouter;
	}

	/**
	 * @param btnAjouter the btnAjouter to set
	 */
	public void setBtnAjouter(JButton btnAjouter) {
		this.btnAjouter = btnAjouter;
	}

	/**
	 * @return the jlistHeros
	 */
	public JList<LivingCharacter> getJlistHeros() {
		return jlistHeros;
	}

	/**
	 * @param jlistHeros the jlistHeros to set
	 */
	public void setJlistHeros(JList<LivingCharacter> jlistHeros) {
		this.jlistHeros = jlistHeros;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
		new MainWindowController(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE, 1.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);

		lblClasses = new JLabel("Classes");
		GridBagConstraints gbc_lblClasses = new GridBagConstraints();
		gbc_lblClasses.anchor = GridBagConstraints.EAST;
		gbc_lblClasses.insets = new Insets(0, 0, 5, 5);
		gbc_lblClasses.gridx = 0;
		gbc_lblClasses.gridy = 0;
		frame.getContentPane().add(lblClasses, gbc_lblClasses);

		classesComboBox = new JComboBox();
		GridBagConstraints gbc_classesComboBox = new GridBagConstraints();
		gbc_classesComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_classesComboBox.insets = new Insets(0, 0, 5, 0);
		gbc_classesComboBox.gridx = 1;
		gbc_classesComboBox.gridy = 0;
		frame.getContentPane().add(classesComboBox, gbc_classesComboBox);

		lblNom = new JLabel("nom");
		GridBagConstraints gbc_lblNom = new GridBagConstraints();
		gbc_lblNom.anchor = GridBagConstraints.EAST;
		gbc_lblNom.insets = new Insets(0, 0, 5, 5);
		gbc_lblNom.gridx = 0;
		gbc_lblNom.gridy = 1;
		frame.getContentPane().add(lblNom, gbc_lblNom);

		nomTextField = new JTextField();
		GridBagConstraints gbc_nomTextField = new GridBagConstraints();
		gbc_nomTextField.insets = new Insets(0, 0, 5, 0);
		gbc_nomTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_nomTextField.gridx = 1;
		gbc_nomTextField.gridy = 1;
		frame.getContentPane().add(nomTextField, gbc_nomTextField);
		nomTextField.setColumns(10);

		lblPv = new JLabel("PV");
		GridBagConstraints gbc_lblPv = new GridBagConstraints();
		gbc_lblPv.anchor = GridBagConstraints.EAST;
		gbc_lblPv.insets = new Insets(0, 0, 5, 5);
		gbc_lblPv.gridx = 0;
		gbc_lblPv.gridy = 2;
		frame.getContentPane().add(lblPv, gbc_lblPv);

		pvTextField = new JTextField();
		GridBagConstraints gbc_pvTextField = new GridBagConstraints();
		gbc_pvTextField.insets = new Insets(0, 0, 5, 0);
		gbc_pvTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_pvTextField.gridx = 1;
		gbc_pvTextField.gridy = 2;
		frame.getContentPane().add(pvTextField, gbc_pvTextField);
		pvTextField.setColumns(10);

		lblPa = new JLabel("PA");
		GridBagConstraints gbc_lblPa = new GridBagConstraints();
		gbc_lblPa.anchor = GridBagConstraints.EAST;
		gbc_lblPa.insets = new Insets(0, 0, 5, 5);
		gbc_lblPa.gridx = 0;
		gbc_lblPa.gridy = 3;
		frame.getContentPane().add(lblPa, gbc_lblPa);

		paTextField = new JTextField();
		GridBagConstraints gbc_paTextField = new GridBagConstraints();
		gbc_paTextField.insets = new Insets(0, 0, 5, 0);
		gbc_paTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_paTextField.gridx = 1;
		gbc_paTextField.gridy = 3;
		frame.getContentPane().add(paTextField, gbc_paTextField);
		paTextField.setColumns(10);

		lblArme = new JLabel("Arme");
		GridBagConstraints gbc_lblArme = new GridBagConstraints();
		gbc_lblArme.anchor = GridBagConstraints.EAST;
		gbc_lblArme.insets = new Insets(0, 0, 5, 5);
		gbc_lblArme.gridx = 0;
		gbc_lblArme.gridy = 4;
		frame.getContentPane().add(lblArme, gbc_lblArme);

		armeComboBox = new JComboBox();
		GridBagConstraints gbc_armeComboBox = new GridBagConstraints();
		gbc_armeComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_armeComboBox.insets = new Insets(0, 0, 5, 0);
		gbc_armeComboBox.gridx = 1;
		gbc_armeComboBox.gridy = 4;
		frame.getContentPane().add(armeComboBox, gbc_armeComboBox);

		lblArmure = new JLabel("Armure");
		GridBagConstraints gbc_lblArmure = new GridBagConstraints();
		gbc_lblArmure.anchor = GridBagConstraints.EAST;
		gbc_lblArmure.insets = new Insets(0, 0, 5, 5);
		gbc_lblArmure.gridx = 0;
		gbc_lblArmure.gridy = 5;
		frame.getContentPane().add(lblArmure, gbc_lblArmure);

		ArmureComboBox = new JComboBox();
		GridBagConstraints gbc_ArmureComboBox = new GridBagConstraints();
		gbc_ArmureComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_ArmureComboBox.insets = new Insets(0, 0, 5, 0);
		gbc_ArmureComboBox.gridx = 1;
		gbc_ArmureComboBox.gridy = 5;
		frame.getContentPane().add(ArmureComboBox, gbc_ArmureComboBox);

		btnAjouter = new JButton("Ajouter");
		GridBagConstraints gbc_btnAjouter = new GridBagConstraints();
		gbc_btnAjouter.gridx = 1;
		gbc_btnAjouter.gridy = 6;
		frame.getContentPane().add(btnAjouter, gbc_btnAjouter);

		jlistHeros = new JList<LivingCharacter>();
		GridBagConstraints gbc_jlistHeros = new GridBagConstraints();
		gbc_jlistHeros.fill = GridBagConstraints.HORIZONTAL;
		gbc_jlistHeros.gridheight = 6;
		gbc_jlistHeros.gridx = 2;
		gbc_jlistHeros.gridy = 0;
		frame.getContentPane().add(jlistHeros, gbc_jlistHeros);
	}

}
