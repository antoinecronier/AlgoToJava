/**
 *
 */
package imiepoecjava2017;

import javax.swing.JFrame;

import imiepoecjava2017.controllers.LoginController;

public class PoecJavaApplication {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		new LoginController(frame);

	}
}
