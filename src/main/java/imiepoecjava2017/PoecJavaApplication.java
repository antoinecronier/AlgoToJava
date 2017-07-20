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

	// Java : déclaration d'une constante
	public final static int TAILLE_J1 = 10;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Java : création d'un tableau à une dimension
		int[] joueur1 = new int[TAILLE_J1];
		int joueur2[][] = new int[20][10];

		//int[] joueur3 = {0,5,10,6};

		// Java : création d'un tableau multidimensionnel
		//int[][][][][][][][][][][][][] joueurX = new int[2][2][2][2][2][2][2][2][2][2][2][2][2];
		//int[][] joueur2D = {{1,10,6,4},{3},{2,6,9}}; // = int[3][4]

		// Algo : POUR => for
		for (int i = 0; i < joueur1.length; i++) {
			joueur1[i] = i;
		}

		// Java : i++ => i = i + 1
		for (int i = 0; i < joueur1.length; i++) {
			// Java : affichage sur une ligne
			System.out.print(joueur1[i]);
		}

		// Java : retour à la ligne
		System.out.println();

		// Java : i-- => i = i - 1
		for (int i = joueur1.length-1; i >= 0 ; i--) {
			// Java : affichage sur une ligne
			System.out.print(joueur1[i]);
		}

		System.out.println();
		System.out.println(joueur1);
		System.out.println();

		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				joueur2[i][j] = i*j;
				System.out.print(joueur2[i][j] + " ");
			}
			System.out.println();
		}

		boolean flag = true;
		int k = 0;

		// Algo : TANTQUE => while
		while(flag){
			System.out.println("Coucou " + k);
			if (k == 10) {
				flag = false;
			}

			k = k + 1; // => k++
		}

		k = 0;
		flag = true;

		// Algo  : FAIRE TANQUE => do while
		do {
			System.out.println("Coucou2 " + k);
			if (k == 10) {
				flag = false;
			}

			k = k + 1; // => k++
		} while (flag);

		// Algo : SELON => switch
		switch (k) {
			case 10:
				System.out.println("k10 = " + k);
				break;
			case 9:
				System.out.println("k9 = " + k);
				break;
			case 8:
				System.out.println("k8 = " + k);
				break;

			default:
				System.out.println("k = " + k);
				break;
		}
	}
}
