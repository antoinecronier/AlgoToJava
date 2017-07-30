/**
 *
 */
package imiepoecjava2017;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import imiepoecjava2017.entities.Role;
import imiepoecjava2017.entities.User;
import imiepoecjava2017.utils.asciiart.AsciiArtCommandPrompt;
import imiepoecjava2017.utils.asciiart.AsciiArtMode;
import imiepoecjava2017.utils.introspection.DumpFields;

public class PoecJavaApplication {

	public static void main(String[] args) {

		//AsciiArtCommandPrompt.getInstance().print("~");
		AsciiArtCommandPrompt.getInstance().print("J'aime les frites une fois");

		AsciiArtCommandPrompt.getInstance().changeMode(AsciiArtMode.huge);
		AsciiArtCommandPrompt.getInstance().printAlhpaMaj("J'aime les frites une fois");
		AsciiArtCommandPrompt.getInstance().print(" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}");

		User user = new User();
		user.setId(1);
		user.setLastname("lastname1");
		user.setFirstname("firstname1");
		user.setLogin("login1");
		user.setPassword("password1");
		ArrayList<Role> roles = new ArrayList<Role>();
		Role role1 = new Role();
		role1.setId(1);
		role1.setName("role1");
		roles.add(role1);

		Role role2 = new Role();
		role2.setId(2);
		role2.setName("role2");
		roles.add(role2);

		user.setRoles(roles);

		Map<String,Object>userDump = DumpFields.fielderWithList(user);
		for (Entry<String, Object> item : userDump.entrySet()) {
			System.out.println(item.getKey() + " " + item.getValue());
		}

		System.out.println();

		ArrayList<String> listField = DumpFields.inspectBaseAttribut(User.class, Object.class);
		for (String string : listField) {
			//System.out.println(string);
		}
	}
}
