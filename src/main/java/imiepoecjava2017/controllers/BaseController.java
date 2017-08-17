package imiepoecjava2017.controllers;

import imiepoecjava2017.utils.views.ViewUtils;
import imiepoecjava2017.views.BaseView;

import javax.swing.JFrame;

public abstract class BaseController implements IBaseController {
	protected JFrame frame;
	protected BaseView view;

	/**
	 * @return the view
	 */
	public BaseView getView() {
		return view;
	}

	@Override
	public BaseController loadController(JFrame frame) {
		initEvent();
		getView().loadView(frame);
		return this;
	}
}
