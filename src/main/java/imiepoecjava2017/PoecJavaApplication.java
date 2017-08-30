/**
 *
 */
package imiepoecjava2017;

import java.sql.ResultSet;
import java.sql.SQLException;

import imiepoecjava2017.database.DBManager;
import imiepoecjava2017.database.SkillDAO;

public class PoecJavaApplication {

	public static void main(String[] args) {
		SkillDAO dao = new SkillDAO();
		ResultSet set = dao.executeRequest("CREATE DATABASE IF NOT EXISTS "
				+ DBManager.getInstance().getDBNAME() + ";");
		//ResultSet set = dao.executeRequest("SHOW TABLES;");
		try {
			while (set.next()) {
				System.out.println(set.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// DatabaseManagerHibernate m = new DatabaseManagerHibernate();
		// m.insert(new Skill());
		// ViewsManager.getInstance().start();
	}
}
