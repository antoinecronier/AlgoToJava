/**
 *
 */
package imiepoecjava2017;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * In stations and airports you often see this type of screen. Have you ever
 * asked yourself how it might be possible to simulate this display on a good
 * old terminal? We have: with ASCII art!
 *
 * ASCII art allows you to represent forms by using characters. To be precise,
 * in our case, these forms are words. For example, the word "MANHATTAN" could
 * be displayed as follows in ASCII art: # # # ### # # # ### ### # ### ### # # #
 * # # # # # # # # # # # ### ### # # ### ### # # ### # # # # # # # # # # # # # #
 * # # # # # # # # # # # # # # # # # # # # ​Your mission is to write a program
 * that can display a line of text in ASCII art.
 *
 * INPUT: Line 1: the width L of a letter represented in ASCII art. All letters
 * are the same width. Line 2: the height H of a letter represented in ASCII
 * art. All letters are the same height. Line 3: The line of text T, composed of
 * N ASCII characters. Following Lines: the string of characters
 * ABCDEFGHIJKLMNOPQRSTUVWXYZ? Represented in ASCII art.
 *
 * OUTPUT: The text T in ASCII art. The characters a to z are shown in ASCII art
 * by their equivalent in upper case. The characters which are not in the
 * intervals [a-z] or [A-Z] will be shown as a question mark in ASCII art.
 *
 * CONSTRAINTS : 0 < L < 30 0 < H < 30 0 < N < 200
 *
 * @author DruidKuma
 * @version 1.0 Build 04.07.2014
 *
 */
public class PoecJavaApplication {

	static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";

	public static void main(String[] args) {

		int choice;
		ArrayList<String> ascii = new ArrayList<String>();
		int width = 0;
		int height = 0;

		Scanner in = new Scanner(System.in);

		//do {
			choice = CallIntMessage(in, 1, 3,
					"Please select a pattern\n1)6*6 pattern\n2)27*9\n3)Random");

			switch (choice) {
			case 1:
				width = 6;
				height = 6;

				// === Code for 6*6 ===
				ascii.add(" ____  ____  ____  ____  _____ _____ _____ _     _     _  _  __ _     _      _      ____  ____  ____  ____  ____  _____  _     _     _     ___  ____  _ ____ " + " ____ ");
				ascii.add("/  _ \\/  __\\/   _\\/  _ \\/  __//    //  __// \\ /|/ \\   / |/ |/ // \\   / \\__/|/ \\  /|/  _ \\/  __\\/  _ \\/  __\\/ ___\\/__ __\\/ \\ /\\/ \\ |\\/ \\  /|\\  \\//\\  \\///_   \\" + "/ _  \\");
				ascii.add("| / \\|| | //|  /  | | \\||  \\  |  __\\| |  _| |_||| |   | ||   / | |   | |\\/||| |\\ ||| / \\||  \\/|| / \\||  \\/||    \\  / \\  | | ||| | //| |  || \\  /  \\  /  /   /" + "\\/ \\ |");
				ascii.add("| |-||| |_\\\\|  \\__| |_/||  /_ | |   | |_//| | ||| |/\\_| ||   \\ | |_/\\| |  ||| | \\||| \\_/||  __/| \\_\\||    /\\___ |  | |  | \\_/|| \\// | |/\\|| /  \\  / /  /   /_" + "   / /");
				ascii.add("\\_/ \\|\\____/\\____/\\____/\\____\\\\_/   \\____\\\\_/ \\|\\_/\\____/\\_|\\_\\\\____/\\_/  \\|\\_/  \\|\\____/\\_/   \\____\\\\_/\\_\\\\____/  \\_/  \\____/\\__/  \\_/  \\|/__/\\\\/_/   \\____/"+ "   \\/ ");
				ascii.add("                                                                                                                                                             " + "   \\/ ");

				break;
			case 2:
				width = 27;
				height = 9;

				// === Code for 6*6 ===
				ascii.add("_____/\\\\\\\\\\\\\\\\\\____        __/\\\\\\\\\\\\\\\\\\\\\\\\\\___        ________/\\\\\\\\\\\\\\\\\\_        __/\\\\\\\\\\\\\\\\\\\\\\\\____        __/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_        __/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_        _____/\\\\\\\\\\\\\\\\\\\\\\\\_        __/\\\\\\________/\\\\\\_        __/\\\\\\\\\\\\\\\\\\\\\\_        ______/\\\\\\\\\\\\\\\\\\\\\\_        __/\\\\\\________/\\\\\\_        __/\\\\\\_____________        __/\\\\\\\\____________/\\\\\\\\_        __/\\\\\\\\\\_____/\\\\\\_        _______/\\\\\\\\\\______        __/\\\\\\\\\\\\\\\\\\\\\\\\\\___        ________/\\\\\\_______        ____/\\\\\\\\\\\\\\\\\\_____        _____/\\\\\\\\\\\\\\\\\\\\\\___        __/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_        __/\\\\\\________/\\\\\\_        __/\\\\\\________/\\\\\\_        __/\\\\\\______________/\\\\\\_        __/\\\\\\_______/\\\\\\_        __/\\\\\\________/\\\\\\_        __/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_        " + "____/\\\\\\\\\\\\\\____        ");
				ascii.add(" ___/\\\\\\\\\\\\\\\\\\\\\\\\\\__        _\\/\\\\\\/////////\\\\\\_        _____/\\\\\\////////__        _\\/\\\\\\////////\\\\\\__        _\\/\\\\\\///////////__        _\\/\\\\\\///////////__        ___/\\\\\\//////////__        _\\/\\\\\\_______\\/\\\\\\_        _\\/////\\\\\\///__        _____\\/////\\\\\\///__        _\\/\\\\\\_____/\\\\\\//__        _\\/\\\\\\_____________        _\\/\\\\\\\\\\\\________/\\\\\\\\\\\\_        _\\/\\\\\\\\\\\\___\\/\\\\\\_        _____/\\\\\\///\\\\\\____        _\\/\\\\\\/////////\\\\\\_        _____/\\\\\\\\/\\\\\\\\____        __/\\\\\\///////\\\\\\___        ___/\\\\\\/////////\\\\\\_        _\\///////\\\\\\/////__        _\\/\\\\\\_______\\/\\\\\\_        _\\/\\\\\\_______\\/\\\\\\_        _\\/\\\\\\_____________\\/\\\\\\_        _\\///\\\\\\___/\\\\\\/__        _\\///\\\\\\____/\\\\\\/__        _\\////////////\\\\\\__       "+ " _/\\\\\\//////\\\\\\__       ");
				ascii.add("  __/\\\\\\/////////\\\\\\_        _\\/\\\\\\_______\\/\\\\\\_        ___/\\\\\\/___________        _\\/\\\\\\______\\//\\\\\\_        _\\/\\\\\\_____________        _\\/\\\\\\_____________        __/\\\\\\_____________        _\\/\\\\\\_______\\/\\\\\\_        _____\\/\\\\\\_____        _________\\/\\\\\\_____        _\\/\\\\\\__/\\\\\\//_____        _\\/\\\\\\_____________        _\\/\\\\\\//\\\\\\____/\\\\\\//\\\\\\_        _\\/\\\\\\/\\\\\\__\\/\\\\\\_        ___/\\\\\\/__\\///\\\\\\__        _\\/\\\\\\_______\\/\\\\\\_        ___/\\\\\\//\\////\\\\\\__        _\\/\\\\\\_____\\/\\\\\\___        __\\//\\\\\\______\\///__        _______\\/\\\\\\_______        _\\/\\\\\\_______\\/\\\\\\_        _\\//\\\\\\______/\\\\\\__        _\\/\\\\\\_____________\\/\\\\\\_        ___\\///\\\\\\\\\\\\/____        ___\\///\\\\\\/\\\\\\/____        ___________/\\\\\\/___      "+ "  \\///_____\\//\\\\\\_      ");
				ascii.add("   _\\/\\\\\\_______\\/\\\\\\_        _\\/\\\\\\\\\\\\\\\\\\\\\\\\\\\\__        __/\\\\\\_____________        _\\/\\\\\\_______\\/\\\\\\_        _\\/\\\\\\\\\\\\\\\\\\\\\\_____        _\\/\\\\\\\\\\\\\\\\\\\\\\_____        _\\/\\\\\\____/\\\\\\\\\\\\\\_        _\\/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_        _____\\/\\\\\\_____        _________\\/\\\\\\_____        _\\/\\\\\\\\\\\\//\\\\\\_____        _\\/\\\\\\_____________        _\\/\\\\\\\\///\\\\\\/\\\\\\/_\\/\\\\\\_        _\\/\\\\\\//\\\\\\_\\/\\\\\\_        __/\\\\\\______\\//\\\\\\_        _\\/\\\\\\\\\\\\\\\\\\\\\\\\\\/__        __/\\\\\\______\\//\\\\\\_        _\\/\\\\\\\\\\\\\\\\\\\\\\/____        ___\\////\\\\\\_________        _______\\/\\\\\\_______        _\\/\\\\\\_______\\/\\\\\\_        __\\//\\\\\\____/\\\\\\___        _\\//\\\\\\____/\\\\\\____/\\\\\\__        _____\\//\\\\\\\\______        _____\\///\\\\\\/______        _________/\\\\\\/_____     "+ "   __________/\\\\\\__     ");
				ascii.add("    _\\/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_        _\\/\\\\\\/////////\\\\\\_        _\\/\\\\\\_____________        _\\/\\\\\\_______\\/\\\\\\_        _\\/\\\\\\///////______        _\\/\\\\\\///////______        _\\/\\\\\\___\\/////\\\\\\_        _\\/\\\\\\/////////\\\\\\_        _____\\/\\\\\\_____        _________\\/\\\\\\_____        _\\/\\\\\\//_\\//\\\\\\____        _\\/\\\\\\_____________        _\\/\\\\\\__\\///\\\\\\/___\\/\\\\\\_        _\\/\\\\\\\\//\\\\\\\\/\\\\\\_        _\\/\\\\\\_______\\/\\\\\\_        _\\/\\\\\\/////////____        _\\//\\\\\\______/\\\\\\__        _\\/\\\\\\//////\\\\\\____        ______\\////\\\\\\______        _______\\/\\\\\\_______        _\\/\\\\\\_______\\/\\\\\\_        ___\\//\\\\\\__/\\\\\\____        __\\//\\\\\\__/\\\\\\\\\\__/\\\\\\___        ______\\/\\\\\\\\______        _______\\/\\\\\\_______        _______/\\\\\\/_______    "+ "    _______/\\\\\\\\/___    ");
				ascii.add("     _\\/\\\\\\/////////\\\\\\_        _\\/\\\\\\_______\\/\\\\\\_        _\\//\\\\\\____________        _\\/\\\\\\_______\\/\\\\\\_        _\\/\\\\\\_____________        _\\/\\\\\\_____________        _\\/\\\\\\_______\\/\\\\\\_        _\\/\\\\\\_______\\/\\\\\\_        _____\\/\\\\\\_____        _________\\/\\\\\\_____        _\\/\\\\\\____\\//\\\\\\___        _\\/\\\\\\_____________        _\\/\\\\\\____\\///_____\\/\\\\\\_        _\\/\\\\\\_\\//\\\\\\/\\\\\\_        _\\//\\\\\\______/\\\\\\__        _\\/\\\\\\_____________        __\\///\\\\\\\\/\\\\\\\\/___        _\\/\\\\\\____\\//\\\\\\___        _________\\////\\\\\\___        _______\\/\\\\\\_______        _\\/\\\\\\_______\\/\\\\\\_        ____\\//\\\\\\/\\\\\\_____        ___\\//\\\\\\/\\\\\\/\\\\\\/\\\\\\____        ______/\\\\\\\\\\\\_____        _______\\/\\\\\\_______        _____/\\\\\\/_________   "+ "     ______/\\\\\\/_____   ");
				ascii.add("      _\\/\\\\\\_______\\/\\\\\\_        _\\/\\\\\\_______\\/\\\\\\_        __\\///\\\\\\__________        _\\/\\\\\\_______/\\\\\\__        _\\/\\\\\\_____________        _\\/\\\\\\_____________        _\\/\\\\\\_______\\/\\\\\\_        _\\/\\\\\\_______\\/\\\\\\_        _____\\/\\\\\\_____        __/\\\\\\___\\/\\\\\\_____        _\\/\\\\\\_____\\//\\\\\\__        _\\/\\\\\\_____________        _\\/\\\\\\_____________\\/\\\\\\_        _\\/\\\\\\__\\//\\\\\\\\\\\\_        __\\///\\\\\\__/\\\\\\____        _\\/\\\\\\_____________        ____\\////\\\\\\//_____        _\\/\\\\\\_____\\//\\\\\\__        __/\\\\\\______\\//\\\\\\__        _______\\/\\\\\\_______        _\\//\\\\\\______/\\\\\\__        _____\\//\\\\\\\\\\______        ____\\//\\\\\\\\\\\\//\\\\\\\\\\_____        ____/\\\\\\////\\\\\\___        _______\\/\\\\\\_______        ___/\\\\\\/___________  "+ "      _____\\///_______  ");
				ascii.add("       _\\/\\\\\\_______\\/\\\\\\_        _\\/\\\\\\\\\\\\\\\\\\\\\\\\\\/__        ____\\////\\\\\\\\\\\\\\\\\\_        _\\/\\\\\\\\\\\\\\\\\\\\\\\\/___        _\\/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_        _\\/\\\\\\_____________        _\\//\\\\\\\\\\\\\\\\\\\\\\\\/__        _\\/\\\\\\_______\\/\\\\\\_        __/\\\\\\\\\\\\\\\\\\\\\\_        _\\//\\\\\\\\\\\\\\\\\\______        _\\/\\\\\\______\\//\\\\\\_        _\\/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_        _\\/\\\\\\_____________\\/\\\\\\_        _\\/\\\\\\___\\//\\\\\\\\\\_        ____\\///\\\\\\\\\\/_____        _\\/\\\\\\_____________        _______\\///\\\\\\\\\\\\__        _\\/\\\\\\______\\//\\\\\\_        _\\///\\\\\\\\\\\\\\\\\\\\\\/___        _______\\/\\\\\\_______        __\\///\\\\\\\\\\\\\\\\\\/___        ______\\//\\\\\\_______        _____\\//\\\\\\__\\//\\\\\\______        __/\\\\\\/___\\///\\\\\\_        _______\\/\\\\\\_______        __/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_ "+ "       ______/\\\\\\______ ");
				ascii.add("        _\\///________\\///__        _\\/////////////____        _______\\/////////__        _\\////////////_____        _\\///////////////__        _\\///______________        __\\////////////____        _\\///________\\///__        _\\///////////__        __\\/////////_______        _\\///________\\///__        _\\///////////////__        _\\///______________\\///__        _\\///_____\\/////__        ______\\/////_______        _\\///______________        _________\\//////___        _\\///________\\///__        ___\\///////////_____        _______\\///________        ____\\/////////_____        _______\\///________        ______\\///____\\///_______        _\\///_______\\///__        _______\\///________        _\\///////////////__"+ "        _____\\///_______");

				break;
			case 3:
				System.out.println("Enter width");
				width = in.nextInt();
				in.nextLine();
				System.out.println("Enter height");
				height = in.nextInt();
				in.nextLine();

				for (int i = 0; i < height; i++) {
					String sub = "";
					for (int j = 0; j < width; j++) {
						int result = 0;
						Random rand = new Random();
						int max = 128;
						int min = 32;
						result = rand.nextInt(max - min + 1) + min;
						sub += (char) result;
					}
					ascii.add(sub);
				}

				break;
			default:
				break;
			}

			//do {
				String text = CallStringMessage(in, null, "Enter your text").toUpperCase();

				// find the necessary indexes of letters
				ArrayList<Integer> indexes = new ArrayList<Integer>();
				for (char c : text.toCharArray()) {
					if (c < 'A' || c > 'Z')
						indexes.add(26);
					else {
						for (char letter : alphabet.toCharArray()) {
							if (c == letter) {
								indexes.add(alphabet.indexOf(letter));
							}
						}
					}
				}

				// print result
				for (int j = 0; j < height; j++) {
					for (int k = 0; k < indexes.size(); k++) {
						System.out.print(ascii.get(j).substring(
								indexes.get(k) * width,
								indexes.get(k) * width + width));
					}
					System.out.println();
				}
//			} while (CallStringMessage(in, new String[] { "N" },
//					"Continue? Y/N") != "N");
//		} while (CallStringMessage(in, new String[] { "N" }, "Try other? Y/N") != "N");
		in.close();
	}

	public static int CallIntMessage(Scanner scan, int valMin, int valMax,
			String message) {

		int result;

		do {
			System.out.println(message);
			while (!scan.hasNextInt())
				scan.next();

			result = scan.nextInt();
		} while (result > valMax || result < valMin);

		return result;
	}

	public static String CallStringMessage(Scanner scan, String[] acceptable,
			String message) {
		String result;
		boolean isNOK = true;

		do {
			System.out.println(message);
			result = scan.next();
			if (acceptable != null) {
				for (String string : acceptable) {
					if (result.equals(string)) {
						isNOK = false;
					}
				}
			}else{
				isNOK = false;
			}
		} while (isNOK);

		return result;
	}

}
