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
		String message = "";
		Integer key = 0;
		int[] hidenMsg;
		String readableMsg = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome, please insert your message");
		message = sc.nextLine();
		key = CallIntMessage(sc, Integer.MIN_VALUE, Integer.MAX_VALUE, "Please enter your key");

		hidenMsg = HideMessage(message,key);

		System.out.println();
		for (int i = 0; i < hidenMsg.length; i++) {
			System.out.print(hidenMsg[i] + " ");
		}
		System.out.println();

		readableMsg = ShowMessage(hidenMsg,key);

		System.out.println(readableMsg);
	}

	/**
	 * Decrypt message from int[] and key
	 * @param hidenMsg
	 * @param key
	 * @return
	 */
	private static String ShowMessage(int[] hidenMsg, Integer key) {
		String result = "";

		for (int item : hidenMsg) {
			for (int i = 0; i < 10000000; i++) {
				if ((i*i-i+key) == item) {
					result += (char)i;
				}
			}
		}

		return result;
	}

	/***
	 * Hide current posted message with formula ascii^2 - ascii + key
	 * @param message
	 * @param key
	 * @return
	 */
	private static int[] HideMessage(String message, Integer key) {
		int[] result = new int[message.length()];

		char[] charMsg = message.toCharArray();

		for (int i = 0; i < message.length(); i++) {
			result[i] = ((int)charMsg[i]) * ((int)charMsg[i]) - ((int)charMsg[i]) + key;
		}

		return result;
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

	public static String CallStringMessage(Scanner scan, String[] acceptable, String message){
		String result;
		boolean isNOK = true;

		do {
			System.out.println(message);
			result = scan.next();
			for (String string : acceptable) {
				if (result.equals(string)) {
					isNOK = false;
				}
			}
		} while (isNOK);

		return result;
	}
}
