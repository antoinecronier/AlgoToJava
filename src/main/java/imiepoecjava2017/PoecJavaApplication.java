/**
 *
 */
package imiepoecjava2017;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import imiepoecjava2017.entities.Candidate;
import imiepoecjava2017.entities.User;
import imiepoecjava2017.utils.asciiart.AsciiArtCommandPrompt;
import imiepoecjava2017.utils.asciiart.AsciiArtMode;
import imiepoecjava2017.utils.file.FromFile;
import imiepoecjava2017.utils.introspection.DumpFields;

public class PoecJavaApplication {

	public static void main(String[] args) {

		//AsciiArtCommandPrompt.getInstance().print("~");
		AsciiArtCommandPrompt.getInstance().print("J'aime les frites une fois");

		AsciiArtCommandPrompt.getInstance().changeMode(AsciiArtMode.huge);
		AsciiArtCommandPrompt.getInstance().printAlhpaMaj("J'aime les frites une fois");
		AsciiArtCommandPrompt.getInstance().print(" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}");

		User user = new Candidate();
		user.setId(1);
		user.setLastname("lastname1");
		user.setFirstname("firstname1");
		user.setLogin("login1");
		user.setPassword("password1");

		Map<String,Object>userDump = DumpFields.fielderWithList(user);
		for (Entry<String, Object> item : userDump.entrySet()) {
			System.out.println(item.getKey() + " " + item.getValue());
		}

		System.out.println();

		ArrayList<String> listField = DumpFields.inspectBaseAttribut(User.class, Object.class);
		for (String string : listField) {
			AsciiArtCommandPrompt.getInstance().print(string);
		}

		ArrayList<Method> methods = DumpFields.getSetter(User.class);
		for (Method method : methods) {
			System.out.println(method.getName());
		}

		FromFile ff = new FromFile("C:\\Users\\tactfactory\\workspaceLuna\\IMIE-POEC-JAVA-2017\\.gitignore");
		for (String string : ff.getList()) {
			System.out.println(string);
		}
	}
}
