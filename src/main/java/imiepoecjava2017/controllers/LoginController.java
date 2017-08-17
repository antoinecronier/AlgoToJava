package imiepoecjava2017.controllers;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import imiepoecjava2017.entities.Candidate;
import imiepoecjava2017.entities.User;
import imiepoecjava2017.views.LoginView;

public class LoginController extends BaseController {

	private User user;

	public LoginController(JFrame frame) {
		super.frame = frame;
		user = new Candidate();
		super.view = new LoginView(this.frame);
	}

	@Override
	public void initEvent() {

		LoginView view = (LoginView) super.view;
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