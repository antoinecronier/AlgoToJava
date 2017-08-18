package imiepoecjava2017.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import imiepoecjava2017.entities.Candidate;
import imiepoecjava2017.entities.Company;
import imiepoecjava2017.entities.Job;
import imiepoecjava2017.entities.Skill;
import imiepoecjava2017.entities.User;
import imiepoecjava2017.managers.ViewsManager;
import imiepoecjava2017.views.HomeView;
import imiepoecjava2017.views.customrenders.ListCellUserRender;

import javax.swing.JFrame;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class HomeController extends BaseController {

	private ActionListener selectUSerListener;
	private ListSelectionListener userListListener;

	public HomeController(JFrame frame) {
		super.frame = frame;
		super.view = new HomeView();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see imiepoecjava2017.controllers.BaseController#initEvent()
	 */
	@Override
	public void initEvent() {
		selectUSerListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewsManager.getInstance().next(
						new ItemDetailsController(frame));
			}
		};
		((HomeView) getView()).getBtnBtnvalidate().addActionListener(
				selectUSerListener);

		userListListener = new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (!e.getValueIsAdjusting()) {
					User user = ((User)
							((HomeView) getView()).getUserList().getSelectedValue());
					((HomeView) getView()).getLblLbluser()
					.setText(
							user.getLastname() + " " + user.getFirstname()
						);
	                }
			}
		};
		((HomeView) getView()).getUserList().addListSelectionListener(userListListener);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see imiepoecjava2017.controllers.BaseController#initView()
	 */
	@Override
	public void initView() {
		((HomeView) getView()).getMenuBar().getNavigationBar().setupEvents();

		((HomeView) getView())
				.getMenuBar()
				.getLblUserfirstname()
				.setText(
						((User) this.viewDatas
								.get(ViewsDatasTerms.CURRENT_USER))
								.getFirstname());
		((HomeView) getView())
				.getMenuBar()
				.getLblUserlastname()
				.setText(
						((User) this.viewDatas
								.get(ViewsDatasTerms.CURRENT_USER))
								.getLastname());

		for (User user : generateUsers()) {
			((HomeView) getView()).getComboBox().addItem(user);
		}
		((HomeView) getView()).getComboBox().setRenderer(
				new ListCellUserRender());

		User[] users = (User[]) generateUsers().toArray(
				new User[generateUsers().size()]);
		((HomeView) getView()).getUserList().setCellRenderer(
				new ListCellUserRender());
		((HomeView) getView()).getUserList().setListData(users);
	}

	public List<User> generateUsers() {
		List<User> result = new ArrayList<User>();

		List<Skill> skills1 = new ArrayList<Skill>();
		List<Skill> skills2 = new ArrayList<Skill>();
		List<Skill> skills3 = new ArrayList<Skill>();

		Skill s1 = new Skill();
		s1.setId(1);
		s1.setLevel(20);
		s1.setName("JAVA");

		Skill s2 = new Skill();
		s2.setId(2);
		s2.setLevel(20);
		s2.setName("C");

		Skill s3 = new Skill();
		s3.setId(3);
		s3.setLevel(30);
		s3.setName("C++");

		Skill s4 = new Skill();
		s4.setId(4);
		s4.setLevel(40);
		s4.setName("HTML");

		Skill s5 = new Skill();
		s5.setId(5);
		s5.setLevel(50);
		s5.setName("CSS");

		skills1.add(s1);
		skills1.add(s2);
		skills1.add(s3);

		skills2.add(s4);
		skills2.add(s5);

		skills3.add(s3);
		skills3.add(s4);
		skills3.add(s5);

		Candidate c1 = new Candidate();
		c1.setId(1);
		c1.setLastname("duplon");
		c1.setFirstname("dumetal");
		c1.setLogin("dudu");
		c1.setPassword("dudu");
		c1.setSkills(skills1);

		Candidate c2 = new Candidate();
		c2.setId(2);
		c2.setLastname("el");
		c2.setFirstname("commery");
		c2.setLogin("elco");
		c2.setPassword("comcom");
		c2.setSkills(skills2);

		Company comp1 = new Company();
		comp1.setId(3);
		comp1.setLastname("Da company");
		comp1.setFirstname("el holding");
		comp1.setLogin("comp1");
		comp1.setPassword("comp1");

		Job j1 = new Job();
		j1.setSkills(skills3);

		Job j2 = new Job();
		j2.setSkills(skills2);

		comp1.getJobs().add(j1);
		comp1.getJobs().add(j2);

		result.add(c1);
		result.add(c2);
		result.add(comp1);

		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see imiepoecjava2017.controllers.BaseController#onExit()
	 */
	@Override
	public void onExit() {
		((HomeView) view).getBtnBtnvalidate().removeActionListener(
				selectUSerListener);
		((HomeView) getView()).getMenuBar().getNavigationBar().resetEvents();
	}
}
