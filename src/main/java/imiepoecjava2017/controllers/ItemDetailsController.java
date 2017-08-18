package imiepoecjava2017.controllers;

import imiepoecjava2017.entities.User;
import imiepoecjava2017.views.HomeView;
import imiepoecjava2017.views.ItemDetailsView;

import javax.swing.JFrame;

public class ItemDetailsController extends BaseController {

	public ItemDetailsController(JFrame frame) {
		super.frame = frame;
		super.view = new ItemDetailsView();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see imiepoecjava2017.controllers.BaseController#initView()
	 */
	@Override
	public void initView() {
		((ItemDetailsView) getView()).getMenuBar().getNavigationBar().setupEvents();

		((ItemDetailsView) getView())
				.getMenuBar()
				.getLblUserfirstname()
				.setText(
						((User) this.viewDatas
								.get(ViewsDatasTerms.CURRENT_USER))
								.getFirstname());
		((ItemDetailsView) getView())
				.getMenuBar()
				.getLblUserlastname()
				.setText(
						((User) this.viewDatas
								.get(ViewsDatasTerms.CURRENT_USER))
								.getLastname());
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see imiepoecjava2017.controllers.BaseController#onExit()
	 */
	@Override
	public void onExit() {
		((ItemDetailsView) getView()).getMenuBar().getNavigationBar()
				.resetEvents();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see imiepoecjava2017.controllers.BaseController#onEnter()
	 */
	@Override
	public void onEnter() {
	}

}
