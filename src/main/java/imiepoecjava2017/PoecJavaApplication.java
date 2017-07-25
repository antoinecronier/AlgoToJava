/**
 *
 */
package imiepoecjava2017;

import imiepoecjava2017.utils.asciiart.AsciiArtCommandPrompt;
import imiepoecjava2017.utils.asciiart.AsciiArtMode;

public class PoecJavaApplication {

	public static void main(String[] args) {

		AsciiArtCommandPrompt.getInstance().print("~");
		AsciiArtCommandPrompt.getInstance().print("J'aime les frites une fois");

		AsciiArtCommandPrompt.getInstance().changeMode(AsciiArtMode.huge);
		AsciiArtCommandPrompt.getInstance().printAlhpaMaj("J'aime les frites une fois");
		AsciiArtCommandPrompt.getInstance().print(" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}");
	}
}
