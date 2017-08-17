package imiepoecjava2017.controllers;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import imiepoecjava2017.entities.Candidate;
import imiepoecjava2017.entities.User;
import imiepoecjava2017.views.LoginView;

public class LoginController {

	private JFrame frame;
	private LoginView view;
	private User user;

	public LoginController(JFrame frame) {
		this.frame = frame;
		user = new Candidate();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view = new LoginView(LoginController.this.frame);
					frame.setVisible(true);
					initEvent();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void initEvent() {

		view.getBtnValidate().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				user.setLogin(view.getLoginTextField().getText());
				user.setPassword(new String(view.getPasswordField()
						.getPassword()));

				if (user.getLogin().equals("toto")
						&& user.getPassword().equals("pwd")) {
					new HomeController(LoginController.this.frame);
				}
			}
		});
	}
}