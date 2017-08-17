package imiepoecjava2017.views;

import imiepoecjava2017.utils.views.ViewUtils;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class HomeView {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public HomeView(JFrame frame) {
		contentPane = new JPanel();
		ViewUtils.configureJFrame(frame, contentPane);
	}

}
