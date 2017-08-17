package imiepoecjava2017.views;

import javax.swing.JFrame;
import javax.swing.JPanel;

import imiepoecjava2017.utils.views.ViewUtils;

public abstract class BaseView implements IBaseView {

	protected JPanel contentPane;

	/**
	 * @return the contentPane
	 */
	public JPanel getContentPane() {
		return contentPane;
	}

	@Override
	public void loadView(JFrame frame) {
		ViewUtils.configureJFrame(frame,getContentPane());
	}
}
