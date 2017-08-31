/**
 *
 */
package imiepoecjava2017;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import imiepoecjava2017.database.SkillDAO;
import imiepoecjava2017.entities.Skill;
import imiepoecjava2017.entities.base.BaseEntity;

public class PoecJavaApplication {

	public static void main(String[] args) {
		SkillDAO dao = new SkillDAO();
		ResultSet set = dao.executeQuery("SHOW TABLES;");
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
			dao.insert(firstSkill);
		}

		List<BaseEntity> skills = dao.get();

		Skill updateS = (Skill) skills.get(10);
		updateS.setName("new name to test");
		dao.update(updateS);

		for (BaseEntity baseEntity : skills) {
			dao.delete(baseEntity);
		}



		// DatabaseManagerHibernate m = new DatabaseManagerHibernate();
		// m.insert(new Skill());
		// ViewsManager.getInstance().start();
	}
}
