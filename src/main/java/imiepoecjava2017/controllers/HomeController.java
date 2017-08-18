package imiepoecjava2017.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import imiepoecjava2017.entities.User;
import imiepoecjava2017.managers.ViewsManager;
import imiepoecjava2017.views.HomeView;
import imiepoecjava2017.views.LoginView;

import javax.swing.JFrame;

public class HomeController extends BaseController {

	private ActionListener selectUSerListener;

	public HomeController(JFrame frame) {
		super.frame = frame;
		super.view = new HomeView();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see imiepoecjava2017.controllers.BaseController#initView()
	 */
	@Override
	public void initView() {
		((HomeView) getView()).getMenuBar().getNavigationBar().setupEvents();

		((HomeView) getView())
				.getMenuBar()
				.getLblUserfirstname()
				.setText(
						((User) this.viewDatas
								.get(ViewsDatasTerms.CURRENT_USER))
								.getFirstname());
		((HomeView) getView())
				.getMenuBar()
				.getLblUserlastname()
				.setText(
						((User) this.viewDatas
								.get(ViewsDatasTerms.CURRENT_USER))
								.getLastname());

		selectUSerListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewsManager.getInstance().next(
						new ItemDetailsController(frame));
			}
		};
		((HomeView) getView()).getBtnBtnvalidate().addActionListener(
				selectUSerListener);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see imiepoecjava2017.controllers.BaseController#onExit()
	 */
	@Override
	public void onExit() {
		((HomeView) view).getBtnBtnvalidate().removeActionListener(
				selectUSerListener);
		((HomeView) getView()).getMenuBar().getNavigationBar().resetEvents();
	}
}
