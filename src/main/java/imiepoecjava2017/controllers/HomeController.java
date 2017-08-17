package imiepoecjava2017.controllers;

import imiepoecjava2017.views.HomeView;
import javax.swing.JFrame;

public class HomeController extends BaseController {

	public HomeController(JFrame frame){
		super.frame = frame;
		super.view = new HomeView(this.frame);
	}

	@Override
	public void initEvent() {

	}
}
