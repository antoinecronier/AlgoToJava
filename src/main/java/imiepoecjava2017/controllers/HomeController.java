package imiepoecjava2017.controllers;

import imiepoecjava2017.views.HomeView;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class HomeController {

	private JFrame frame;
	private HomeView view;

	public HomeController(JFrame frame){
		this.frame = frame;

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view = new HomeView(HomeController.this.frame);
					frame.setVisible(true);
					initEvent();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void initEvent() {

	}
}
