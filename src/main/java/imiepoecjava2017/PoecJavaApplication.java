/**
 *
 */
package imiepoecjava2017;

/**
 * @author tactfactory
 *
 */
public class PoecJavaApplication {

	// ";" instruction de fin de ligne

	// Algo : d�claration variable enti�re
	// ENTIER : nomVAr => int nomVar

	// Algo : correspond � la d�claration des variables d'un algorithme
	// en JAVA doit �tre not� comme static car utilis� dans une fonction static
	//	static int jasmine = 7;
	//	static int aladin = 5;
	//	static int panierCommun = jasmine + aladin;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Algo : alternative � la d�claration static, correspond � une d�claration de variable
		// dans la fonction
		int jasmine = 7;
		int aladin = 5;
		int panierCommun = jasmine + aladin;

		// Algo : Ecrire
		System.out.println(panierCommun);
	}

}
