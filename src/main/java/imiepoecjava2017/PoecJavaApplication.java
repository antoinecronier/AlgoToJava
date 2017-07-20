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

	public final static int PLAYER_ATTRIBUTS = 5;
	public final static int PLAYER_PV = 0;
	public final static int PLAYER_ARMOR = 1;
	public final static int PLAYER_PA = 2;
	public final static int PLAYER_WEAPON_COST = 3;
	public final static int PLAYER_WEAPON_DAMAGE = 4;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// int[][] weapons = new int[5][2];
		// int[] armors = new int[3];
		int[][] weapons = { { 3, 4 }, { 2, 1 }, { 10, 6 }, { 1, 1 }, { 6, 3 } };
		int[] armors = { 1, 2, 4 };
		int nbPlayer = 0;
		int userSelection;
		int[][] players;

		// Initialisation du scanner
		Scanner scan = new Scanner(System.in);

		players = InitGame(weapons, armors, scan);

		// Show game board
		for (int i = 0; i < players.length; i++) {
			for (int j = 0; j < PLAYER_ATTRIBUTS; j++) {
				System.out.print(players[i][j] + " ");
			}
			System.out.println();
		}

		PlayGame(players);

		// Fermeture du scanner
		scan.close();
	}

	/**
	 *
	 * @param players
	 */
	private static void PlayGame(int[][] players) {
		boolean flag = true;
		int round = 0;

		// Je continu tant qu'un joueur n'a pas gagné
		while (flag) {
			round++;
			System.out.println("New round :" + round);

			// Les joueurs joue chacun leur tour dans l'ordre
			for (int i = 0; i < players.length; i++) {
				System.out.println("Player " + (i + 1) + " turn");
				int tempPA = players[i][PLAYER_PA] - 1;

				// Je joue si je suis vivant et que je peux tapper
				while (((tempPA - players[i][PLAYER_WEAPON_COST]) >= 0) && players[i][PLAYER_PV]>0) {
					tempPA -= players[i][PLAYER_WEAPON_COST];

					// Recherche d'un ennemis
					int ennemi = i;
					do {
						ennemi++;
						if (ennemi >= players.length) {
							ennemi = 0;
						}
					} while (players[ennemi][PLAYER_PV] <= 0 && ennemi != i);

					if (ennemi == i) {
						System.out.println("End of game, player " + (i + 1)
								+ " wins.");
						// Prépare le jeu à être arrêté
						flag = false;
						// Force la sortie de la boucle courante
						break;
					} else {
						if (players[i][PLAYER_WEAPON_DAMAGE]
								- players[ennemi][PLAYER_ARMOR] >= 0) {

							players[ennemi][PLAYER_PV] = players[ennemi][PLAYER_PV]
									- (-players[ennemi][PLAYER_ARMOR] + players[i][PLAYER_WEAPON_DAMAGE]);

							System.out.println("Player " + (i + 1)
									+ " hurt player " + (ennemi + 1) + " for "
									+ players[i][PLAYER_WEAPON_DAMAGE]
									+ " damages");
							System.out.println("Player " + (ennemi + 1)
									+ " have now " + players[ennemi][PLAYER_PV]
									+ " PV");
						} else {
							System.out.println("Player " + (i + 1)
									+ " is to weak to deal with player "
									+ (ennemi + 1));
						}
					}
				}
			}
		}
	}

	/**
	 * @param weapons
	 * @param armors
	 * @param scan
	 */
	private static int[][] InitGame(int[][] weapons, int[] armors, Scanner scan) {
		int nbPlayer;
		int userSelection;
		int[][] players;

		// Affichage selection nbJoueur
		nbPlayer = CallIntMessage(scan, 2, 20,
				"How many players (min 2/ max 20)?");
		players = new int[nbPlayer][PLAYER_ATTRIBUTS];

		// Affichage des infos pour l'ensemble des joueurs
		for (int i = 0; i < nbPlayer; i++) {
			// Affichage selection arme
			userSelection = CallIntMessage(scan, 1, 5,
					"Please select a weapon for player " + (i + 1)
							+ " between theirs:\n" + "1) Concasseur \n"
							+ "2) Pelle \n" + "3) Gatling \n"
							+ "4) Batte de cricket \n" + "5) Blaster \n ");

			players[i][PLAYER_WEAPON_COST] = weapons[userSelection - 1][1];
			players[i][PLAYER_WEAPON_DAMAGE] = weapons[userSelection - 1][0];

			// Affichage selection armure
			userSelection = CallIntMessage(scan, 1, 3,
					"Please select a armor for player " + (i + 1)
							+ " between theirs:\n" + "1) Gilet bleu \n"
							+ "2) Armure de cuir \n" + "3) Armure de plaque \n");

			players[i][PLAYER_ARMOR] = armors[userSelection - 1];

			// Affichage selection attribut
			// PV
			userSelection = CallIntMessage(scan, 1, 100, "Life for player "
					+ (i + 1));
			players[i][PLAYER_PV] = userSelection;

			// PA
			userSelection = CallIntMessage(scan, 1, 100,
					"Action point for player " + (i + 1));
			players[i][PLAYER_PA] = userSelection;
		}

		return players;
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
			while (!scan.hasNextInt())
				scan.next();
			result = scan.nextInt();
		} while (result > valMax || result < valMin);

		return result;
	}
}
