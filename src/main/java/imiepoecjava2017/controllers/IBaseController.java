package imiepoecjava2017.controllers;

import javax.swing.JFrame;

public interface IBaseController {
	public BaseController loadController(JFrame frame);
	public void initEvent();
}
