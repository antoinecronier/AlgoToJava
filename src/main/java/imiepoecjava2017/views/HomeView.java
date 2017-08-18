package imiepoecjava2017.views;

import imiepoecjava2017.entities.User;
import imiepoecjava2017.views.usercontrols.MenuBar;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridBagLayout;

import java.awt.GridBagConstraints;

import javax.swing.JComboBox;

import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JList;

public class HomeView extends BaseView {

	private MenuBar menuBar;
	private JComboBox<User> comboBox;
	private JButton btnBtnvalidate;
	private JButton btnBtnrefresh;
	private JList<User> userList;

	/**
	 * @return the comboBox
	 */
	public JComboBox<User> getComboBox() {
		return comboBox;
	}

	/**
	 * @param comboBox the comboBox to set
	 */
	public void setComboBox(JComboBox<User> comboBox) {
		this.comboBox = comboBox;
	}

	/**
	 * @return the btnBtnvalidate
	 */
	public JButton getBtnBtnvalidate() {
		return btnBtnvalidate;
	}

	/**
	 * @param btnBtnvalidate the btnBtnvalidate to set
	 */
	public void setBtnBtnvalidate(JButton btnBtnvalidate) {
		this.btnBtnvalidate = btnBtnvalidate;
	}

	/**
	 * @return the btnBtnrefresh
	 */
	public JButton getBtnBtnrefresh() {
		return btnBtnrefresh;
	}

	/**
	 * @param btnBtnrefresh the btnBtnrefresh to set
	 */
	public void setBtnBtnrefresh(JButton btnBtnrefresh) {
		this.btnBtnrefresh = btnBtnrefresh;
	}

	/**
	 * @return the userList
	 */
	public JList<User> getUserList() {
		return userList;
	}

	/**
	 * @param userList the userList to set
	 */
	public void setUserList(JList<User> userList) {
		this.userList = userList;
	}

	/**
	 * @return the menuBar
	 */
	public MenuBar getMenuBar() {
		return menuBar;
	}

	/**
	 * @param menuBar
	 *            the menuBar to set
	 */
	public void setMenuBar(MenuBar menuBar) {
		this.menuBar = menuBar;
	}

	/**
	 * Create the frame.
	 */
	public HomeView() {
		super.pageName = ViewsTerms.HOMEVIEW_PAGE_NAME;
		JPanel panel = new JPanel();
		super.contentPane = panel;

		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		menuBar = new MenuBar();
		GridBagConstraints gbc_menuBar = new GridBagConstraints();
		gbc_menuBar.fill = GridBagConstraints.HORIZONTAL;
		gbc_menuBar.gridx = 0;
		gbc_menuBar.gridy = 0;
		gbc_menuBar.gridwidth = 10;
		panel.add(menuBar.getContentPane(), gbc_menuBar);

		comboBox = new JComboBox<User>();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 2;
		panel.add(comboBox, gbc_comboBox);

		btnBtnvalidate = new JButton("btnValidate");
		GridBagConstraints gbc_btnBtnvalidate = new GridBagConstraints();
		gbc_btnBtnvalidate.insets = new Insets(0, 0, 5, 5);
		gbc_btnBtnvalidate.gridx = 1;
		gbc_btnBtnvalidate.gridy = 2;
		panel.add(btnBtnvalidate, gbc_btnBtnvalidate);

		btnBtnrefresh = new JButton("btnRefresh");
		GridBagConstraints gbc_btnBtnrefresh = new GridBagConstraints();
		gbc_btnBtnrefresh.insets = new Insets(0, 0, 5, 5);
		gbc_btnBtnrefresh.gridx = 0;
		gbc_btnBtnrefresh.gridy = 3;
		panel.add(btnBtnrefresh, gbc_btnBtnrefresh);

		userList = new JList<User>();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.insets = new Insets(0, 0, 0, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 4;
		panel.add(userList, gbc_list);
	}
}
