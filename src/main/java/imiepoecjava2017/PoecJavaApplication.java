/**
 *
 */
package imiepoecjava2017;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import imiepoecjava2017.database.CandidateDAO;
import imiepoecjava2017.database.SkillDAO;
import imiepoecjava2017.entities.Candidate;
import imiepoecjava2017.entities.Skill;
import imiepoecjava2017.entities.base.BaseEntity;

public class PoecJavaApplication {

	public static void main(String[] args) {
		SkillDAO skillDao = new SkillDAO();
		ResultSet set = skillDao.executeQuery("SHOW TABLES;");
		try {
			while (set.next()) {
				System.out.println(set.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Skill firstSkill = new Skill();
		firstSkill.setLevel(10);
		firstSkill.setName("skill1");

		for (int i = 0; i < 100; i++) {
			skillDao.insert(firstSkill);
		}

		List<BaseEntity> skills = skillDao.get();

		Skill updateS = (Skill) skills.get(10);
		updateS.setName("new name to test");
		skillDao.update(updateS);

		CandidateDAO candidateDao = new CandidateDAO();
		Candidate c1 = new Candidate();
		c1.setFirstname("toto");
		c1.setLastname("dupont");
		c1.setLogin("toto");
		c1.setPassword("eltoto");

		c1.getSkills().add((Skill) skills.get(0));
		c1.getSkills().add((Skill) skills.get(1));
		c1.getSkills().add((Skill) skills.get(2));

		candidateDao.insert(c1);
		candidateDao.insertSkills(c1);
//		candidateDao.deleteSkills(c1);
//		c1.getSkills().clear();

		Candidate c2 = new Candidate();
		c2 = (Candidate) candidateDao.get(c1.getId());
		candidateDao.getSkills(c2);

		for (BaseEntity baseEntity : skills) {
			skillDao.delete(baseEntity);
		}

		// DatabaseManagerHibernate m = new DatabaseManagerHibernate();
		// m.insert(new Skill());
		// ViewsManager.getInstance().start();
	}
}
