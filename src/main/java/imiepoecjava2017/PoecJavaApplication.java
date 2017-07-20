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

		int nb1;
		int nb2;

		// Algo : création de Lire
		Scanner lire = new Scanner(System.in);

		System.out.println("Saisir valeur pour nb1");
		// Java : récupération de l'entier (int) saisi
		nb1 = lire.nextInt();

		System.out.println("Saisir valeur pour nb2");
		// Java : récupération de l'entier (int) saisi
		nb2 = lire.nextInt();

		// Java : ferme le scanner
		lire.close();

		// Test conditionnel :
		// OU : ||
		// ET : &&
		// NON() : !()
		// égale : ==

		// Algo : SI ALORS FINSI => if(){}
		if (nb1 == nb2) {
			System.out.println("Egalite nb1 et nb2 : " + (nb1 + nb2));
		}else if(nb1 < 0 && nb2 > 0){
			System.out.println(nb1 * nb2);
		}else if(
				(nb1 > 0 && nb2 > 0) || (nb1 < 0 && nb2 < 0) &&
				(nb1 > 10 || nb2 > 10 || nb1 < -10 || nb2 < -10)
				){
			System.out.println(nb1 / nb2);
		}else{
			System.out.println("non testé");
		}
	}
}
