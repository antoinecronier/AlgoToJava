package imiepoecjava2017.controllers;

import imiepoecjava2017.entities.User;
import imiepoecjava2017.views.HomeView;

import javax.swing.JFrame;

public class HomeController extends BaseController {

	public HomeController(JFrame frame) {
		super.frame = frame;
		super.view = new HomeView(this.frame);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see imiepoecjava2017.controllers.BaseController#initView()
	 */
	@Override
	public void initView() {
		((HomeView) getView())
				.getMenuBar()
				.getLblUserfirstname()
				.setText(
						((User) this.viewDatas.get(ViewsDatasTerms.CURRENT_USER))
								.getFirstname());
		((HomeView) getView())
				.getMenuBar()
				.getLblUserlastname()
				.setText(
						((User) this.viewDatas.get(ViewsDatasTerms.CURRENT_USER))
								.getLastname());
	}

	/* (non-Javadoc)
	 * @see imiepoecjava2017.controllers.BaseController#onExit()
	 */
	@Override
	public void onExit() {
		((HomeView) getView()).getMenuBar().getNavigationBar().resetEvents();
	}
}
