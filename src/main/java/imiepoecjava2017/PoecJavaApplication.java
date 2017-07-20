/**
 *
 */
package imiepoecjava2017;

// Java : Permet d'avoir acc�s � l'objet Scanner
import java.util.Scanner;

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

		// Algo : cr�ation de Lire
		Scanner lire = new Scanner(System.in);

		System.out.println("Saisir valeur pour jasmine");
		// Java : r�cup�ration de l'entier (int) saisi
		jasmine = lire.nextInt();

		System.out.println("Saisir valeur pour aladin");
		// Java : r�cup�ration de l'entier (int) saisi
		aladin = lire.nextInt();

		// Java : ferme le scanner
		lire.close();

		panierCommun = jasmine + aladin;

		// Algo : Ecrire
		System.out.println(panierCommun);
	}

}
