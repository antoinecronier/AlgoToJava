/**
 *
 */
package imiepoecjava2017;

import imiepoecjava2017.database.DatabaseManagerHibernate;
import imiepoecjava2017.entities.Skill;

public class PoecJavaApplication {

	public static void main(String[] args) {

		DatabaseManagerHibernate m = new DatabaseManagerHibernate();
		m.insert(new Skill());
		//ViewsManager.getInstance().start();
	}
}
