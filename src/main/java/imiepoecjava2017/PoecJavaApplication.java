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

		// Algo : Ecrire
		System.out.println(panierCommun);
	}

}
