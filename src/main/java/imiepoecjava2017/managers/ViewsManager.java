package imiepoecjava2017.managers;

import imiepoecjava2017.controllers.BaseController;
import imiepoecjava2017.controllers.LoginController;
import imiepoecjava2017.utils.views.ViewUtils;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class ViewsManager {

	private static ViewsManager instance = null;

	protected ViewsManager() {
		this.frame = new JFrame();
		controllers = new ArrayList<BaseController>();
		currentControllerIndex = 0;
	}

	public static ViewsManager getInstance() {
		if (instance == null) {
			instance = new ViewsManager();
		}
		return instance;
	}

	private JFrame frame;
	private List<BaseController> controllers;
	private int currentControllerIndex;
	private BaseController currentController;

	public void start(){
		ViewUtils.configureFirstJFrame(frame);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		controllers.add(new LoginController(frame));
		controllers.get(currentControllerIndex).loadController(frame);
	}

	public ViewsManager add(BaseController controller) {
		this.controllers.add(controller);
		return this;
	}

	public ViewsManager next(BaseController controller) {
		currentController = controller;
		this.controllers.add(currentController);
		currentControllerIndex++;
		return this;
	}
}
