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

		int nb1;
		int nb2;

		// Algo : cr�ation de Lire
		Scanner lire = new Scanner(System.in);

		System.out.println("Saisir valeur pour nb1");
		// Java : r�cup�ration de l'entier (int) saisi
		nb1 = lire.nextInt();

		System.out.println("Saisir valeur pour nb2");
		// Java : r�cup�ration de l'entier (int) saisi
		nb2 = lire.nextInt();

		// Java : ferme le scanner
		lire.close();

		// Test conditionnel :
		// OU : ||
		// ET : &&
		// NON() : !()
		// �gale : ==

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
			System.out.println("non test�");
		}
	}
}
