/**
 *
 */
package imiepoecjava2017;

import imiepoecjava2017.entities.Role;
import imiepoecjava2017.entities.User;

public class PoecJavaApplication {

	public static void main(String[] args) {
		//Instanciate a new user
		User monUser = new User();
		monUser.setFirstname("jean-loui");
		monUser.getRoles().add(new Role(1,"role1"));
		monUser.getRoles().add(new Role(2,"role2"));
		System.out.println(monUser.getFirstname());
		System.out.println(monUser.toString());

		User monUser1 = new User();
		System.out.println(monUser1.toString());
	}
}
