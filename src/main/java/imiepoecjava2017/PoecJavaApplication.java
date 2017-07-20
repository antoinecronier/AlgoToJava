/**
 *
 */
package imiepoecjava2017;

// Java : Permet d'avoir accès à l'objet Scanner
import java.util.Scanner;

/**
 * @author tactfactory
 *
 */
public class PoecJavaApplication {

	// ";" instruction de fin de ligne

	// Algo : déclaration variable entière
	// ENTIER : nomVAr => int nomVar

	// Algo : correspond à la déclaration des variables d'un algorithme
	// en JAVA doit être noté comme static car utilisé dans une fonction static
	//	static int jasmine = 7;
	//	static int aladin = 5;
	//	static int panierCommun = jasmine + aladin;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Algo : alternative à la déclaration static, correspond à une déclaration de variable
		// dans la fonction
		int jasmine = 7;
		int aladin = 5;
		int panierCommun = jasmine + aladin;

		// Algo : création de Lire
		Scanner lire = new Scanner(System.in);

		System.out.println("Saisir valeur pour jasmine");
		// Java : récupération de l'entier (int) saisi
		jasmine = lire.nextInt();

		System.out.println("Saisir valeur pour aladin");
		// Java : récupération de l'entier (int) saisi
		aladin = lire.nextInt();

		// Java : ferme le scanner
		lire.close();

		panierCommun = jasmine + aladin;

		// Algo : Ecrire
		System.out.println(panierCommun);
	}

}
