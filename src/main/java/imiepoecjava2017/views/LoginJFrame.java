package imiepoecjava2017.views;

import imiepoecjava2017.utils.views.ViewUtils;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class LoginJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginJFrame frame = new LoginJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginJFrame() {
		contentPane = new JPanel();

		ViewUtils.configureJFrame(this,contentPane);

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{200, 0, 0, 0, 0, 0, 200};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);

		JLabel lblLoginPage = new JLabel("Login Page");
		GridBagConstraints gbc_lblLoginPage = new GridBagConstraints();
		gbc_lblLoginPage.insets = new Insets(0, 0, 5, 0);
		gbc_lblLoginPage.gridx = 5;
		gbc_lblLoginPage.gridy = 2;
		getContentPane().add(lblLoginPage, gbc_lblLoginPage);

		JLabel lblLogin = new JLabel("Login");
		GridBagConstraints gbc_lblLogin = new GridBagConstraints();
		gbc_lblLogin.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogin.gridx = 3;
		gbc_lblLogin.gridy = 4;
		getContentPane().add(lblLogin, gbc_lblLogin);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 5;
		gbc_textField.gridy = 4;
		getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);

		JLabel lblPassword = new JLabel("Password");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 3;
		gbc_lblPassword.gridy = 6;
		getContentPane().add(lblPassword, gbc_lblPassword);

		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 5;
		gbc_passwordField.gridy = 6;
		getContentPane().add(passwordField, gbc_passwordField);

		JButton btnValidate = new JButton("Validate");
		GridBagConstraints gbc_btnValidate = new GridBagConstraints();
		gbc_btnValidate.gridx = 5;
		gbc_btnValidate.gridy = 8;
		getContentPane().add(btnValidate, gbc_btnValidate);
	}

}
