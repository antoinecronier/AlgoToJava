package imiepoecjava2017.views.usercontrols;

import javax.swing.JPanel;

import imiepoecjava2017.managers.ViewsManager;
import imiepoecjava2017.views.BaseView;
import imiepoecjava2017.views.ViewsTerms;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class NavigationBar extends BaseView {

	private JButton btnBack;
	private JButton btnNext;
	private ActionListener backListener;
	private ActionListener nextListener;

	/**
	 * @return the btnBack
	 */
	public JButton getBtnBack() {
		return btnBack;
	}

	/**
	 * @param btnBack
	 *            the btnBack to set
	 */
	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}

	/**
	 * @return the btnNext
	 */
	public JButton getBtnNext() {
		return btnNext;
	}

	/**
	 * @param btnNext
	 *            the btnNext to set
	 */
	public void setBtnNext(JButton btnNext) {
		this.btnNext = btnNext;
	}

	public NavigationBar() {
		super.pageName = ViewsTerms.NAVIGATIONBAR_PAGE_NAME;
		JPanel panel = new JPanel();
		super.contentPane = panel;
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		btnBack = new JButton("Back");
		panel.add(btnBack);

		btnNext = new JButton("Next");
		panel.add(btnNext);

		setupEvents();
	}

	public void setupEvents() {
		if (!ViewsManager.getInstance().canBack()) {
			btnBack.setEnabled(false);
		}

		if (!ViewsManager.getInstance().canNext()) {
			btnNext.setEnabled(false);
		}

		backListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewsManager.getInstance().back();
			}
		};
		this.btnBack.addActionListener(backListener);

		nextListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewsManager.getInstance().next();
			}
		};
		this.btnNext.addActionListener(nextListener);
	}

	public void resetEvents() {
		this.btnBack.removeActionListener(backListener);
		this.btnNext.removeActionListener(nextListener);
	}
}
