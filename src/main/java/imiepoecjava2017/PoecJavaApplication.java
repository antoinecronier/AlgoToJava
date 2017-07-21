/**
 *
 */
package imiepoecjava2017;

import java.util.Scanner;

/**
 * @author tactfactory
 *
 */
public class PoecJavaApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String monString = "";
		monString = "s;vlsdjlksj dlfj sldk;fl jlsdjlf lkdsj fksdftoto tata";

		if (monString.equals("toto")) {

		}else if (monString.contains("toto")) {

		}else if (monString.endsWith("tata")) {

		}else if (monString.startsWith("s;")) {

		}else if (monString.isEmpty()) {

		}else if (monString == null) {

		}else if (monString.matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$")) {

		}else if (monString.length() ==  0) {

		}else if (monString.charAt(0) == 'O') {

		}else if (monString.trim().equals("")) {

		}else if (monString.replace(" - ", "").equals("")) {

		}else if (monString.replaceAll(" - ", "").equals("")) {

		}else if (monString.indexOf("toto") == 1) {

		}else if (monString.split(";")[0].equals("s")) {

		}else if (monString.substring(5, 8).equals("")) {

		}

		monString.substring(monString.indexOf("toto"), monString.indexOf("tata")+3).length();
	}

	/**
	 * Get only int value if between desired interval Ever print message
	 *
	 * @param valMin
	 * @param valMax
	 * @param message
	 * @return
	 */
	public static int CallIntMessage(Scanner scan, int valMin, int valMax,
			String message) {

		int result;

		do {
			System.out.println(message);
			while (!scan.hasNextInt())scan.next();

			result = scan.nextInt();
		} while (result > valMax || result < valMin);

		return result;
	}
}
