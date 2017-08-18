package imiepoecjava2017.controllers;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import imiepoecjava2017.entities.Candidate;
import imiepoecjava2017.entities.User;
import imiepoecjava2017.managers.ViewsManager;
import imiepoecjava2017.views.LoginView;

public class LoginController extends BaseController {

	private User user;
	private ActionListener btnValidateAction;

	public LoginController(JFrame frame) {
		super.frame = frame;
		user = new Candidate();
		super.view = new LoginView(this.frame);
	}

	@Override
	public void initEvent() {

		LoginView view = (LoginView) super.view;

		btnValidateAction = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				user.setLogin(view.getLoginTextField().getText());
				user.setPassword(new String(view.getPasswordField()
						.getPassword()));

				if (user.getLogin().equals("toto")
						&& user.getPassword().equals("pwd")) {
					user.setFirstname("toto");
					user.setLastname("el");
					ViewsManager.getInstance().next(new HomeController(frame));
				}
			}
		};
		view.getBtnValidate().addActionListener(btnValidateAction);
	}

	@Override
	public void setupDatas() {
		this.viewDatas.put(ViewsDatasTerms.CURRENT_USER, user);
	}

	/* (non-Javadoc)
	 * @see imiepoecjava2017.controllers.BaseController#onExit()
	 */
	@Override
	public void onExit() {
		((LoginView) view).getBtnValidate().removeActionListener(btnValidateAction);
	}


}