package imiepoecjava2017.views.usercontrols;

import imiepoecjava2017.views.BaseView;
import imiepoecjava2017.views.ViewsTerms;

import javax.swing.JPanel;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JSeparator;

public class MenuBar extends BaseView {

	private JLabel lblWelcome;
	private JLabel lblUserlastname;
	private JLabel lblUserfirstname;
	private JSeparator separator;
	private NavigationBar navigationBar;

	/**
	 * @return the navigationBar
	 */
	public NavigationBar getNavigationBar() {
		return navigationBar;
	}

	/**
	 * @return the lblWelcome
	 */
	public JLabel getLblWelcome() {
		return lblWelcome;
	}

	/**
	 * @param lblWelcome the lblWelcome to set
	 */
	public void setLblWelcome(JLabel lblWelcome) {
		this.lblWelcome = lblWelcome;
	}

	/**
	 * @return the lblUserlastname
	 */
	public JLabel getLblUserlastname() {
		return lblUserlastname;
	}

	/**
	 * @param lblUserlastname the lblUserlastname to set
	 */
	public void setLblUserlastname(JLabel lblUserlastname) {
		this.lblUserlastname = lblUserlastname;
	}

	/**
	 * @return the lblUserfirstname
	 */
	public JLabel getLblUserfirstname() {
		return lblUserfirstname;
	}

	/**
	 * @param lblUserfirstname the lblUserfirstname to set
	 */
	public void setLblUserfirstname(JLabel lblUserfirstname) {
		this.lblUserfirstname = lblUserfirstname;
	}

	/**
	 * Create the frame.
	 */
	public MenuBar() {
		super.pageName = ViewsTerms.MENUBAR_PAGE_NAME;
		JPanel panel = new JPanel();
		super.contentPane = panel;
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		navigationBar =  new NavigationBar();
		panel.add(navigationBar.getContentPane());

		separator = new JSeparator();
		separator.setBounds(0,40,0,0);
		panel.add(separator);

		lblWelcome = new JLabel(ViewsTerms.MENUBAR_WELCOME);
		panel.add(lblWelcome);

		lblUserlastname = new JLabel(ViewsTerms.MENUBAR_USER_LASTNAME);
		panel.add(lblUserlastname);

		lblUserfirstname = new JLabel(ViewsTerms.MENUBAR_USER_FIRSTNAME);
		panel.add(lblUserfirstname);
	}
}
