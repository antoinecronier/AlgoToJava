package imiepoecjava2017.utils.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ViewUtils {

	/**
	 * Allow to configure all screen of application with default size values.
	 * And Frame will be set to center of screen.
	 * @param contentPane
	 * @param jFrame
	 *
	 */
	public static void configureJFrame(JFrame jFrame, JPanel contentPane) {
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		jFrame.setContentPane(contentPane);
	}

	public static void configureFirstJFrame(JFrame jFrame){
		int frameWidth = 800;
		int frameHeight = 600;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = (int) screenSize.getWidth();
		int screenHeight = (int) screenSize.getHeight();

		int screenMiddleWidth = (screenWidth / 2) - (frameWidth / 2);
		int screenMiddleHeight = (screenHeight / 2) - (frameHeight / 2);

		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setBounds(screenMiddleWidth, screenMiddleHeight, frameWidth, frameHeight);
	}
}
