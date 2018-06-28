package evolution;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Combat {

	public static void attaquerBatiment() {
		Scanner input = new Scanner(System.in);
		byte compteurSecteur = 0;
		byte compteurVille = 0;
		byte compteurBatiment = 0;
		for (compteurSecteur = 0; compteurSecteur <= 3; compteurSecteur++) {
			compteurVille = 0;
			for (compteurVille = 0; compteurVille <=3; compteurVille++) {
				compteurBatiment = 0;
				System.out.println("Vous arrivez à "+Jeu.secteurs.get(compteurSecteur).getListeVilles().get(compteurVille).getNom()+".");
				afficherChateau();
				for (compteurBatiment = 0; compteurBatiment <= 3; compteurBatiment++) {
					Jeu.secteurs.get(compteurSecteur).getListeVilles().get(compteurVille).getListeBatiments().get(compteurBatiment);
					String answer;
					do {
						System.out.println("Voulez-vous attaquer le "+Jeu.secteurs.get(compteurSecteur).getListeVilles().get(compteurVille).getListeBatiments().get(compteurBatiment).getNom()+" de "+Jeu.secteurs.get(compteurSecteur).getListeVilles().get(compteurVille).getNom()+" ?");
						answer = input.nextLine();
						if(answer.equals("o")||answer.equals("oui")||answer.equals("O")||answer.equals("Oui")||answer.equals("OUI")) {
							System.out.println("Vous attaquez le "+Jeu.secteurs.get(compteurSecteur).getListeVilles().get(compteurVille).getListeBatiments().get(compteurBatiment).getNom()+" de "+Jeu.secteurs.get(compteurSecteur).getListeVilles().get(compteurVille).getNom()+" !");
							afficherMaison();
							System.out.println("Le "+Jeu.secteurs.get(compteurSecteur).getListeVilles().get(compteurVille).getListeBatiments().get(compteurBatiment).getNom()+" de "+Jeu.secteurs.get(compteurSecteur).getListeVilles().get(compteurVille).getNom()+" est à vous !");
							System.out.println("Vous récupérez "+Jeu.secteurs.get(compteurSecteur).getListeVilles().get(compteurVille).getListeBatiments().get(compteurBatiment).getStock()+" "+Jeu.secteurs.get(compteurSecteur).getListeVilles().get(compteurVille).getListeBatiments().get(compteurBatiment).getRessource().getNom()+".");
							break;
						}
						else if(answer.equals("n")||answer.equals("non")||answer.equals("N")||answer.equals("Non")||answer.equals("NON")) {
							break;
						}
						else {
							System.out.print("Je n'ai pas compris votre réponse. ");
							continue;
						}
					} while(!answer.equals("o")&&!answer.equals("oui")&&!answer.equals("O")&&!answer.equals("Oui")&&!answer.equals("OUI")&&!answer.equals("n")&&!answer.equals("non")&&!answer.equals("N")&&!answer.equals("Non")&&!answer.equals("NON"));
				}
			}
		}
	}
	
	public static void afficherMaison() {
		System.out.println("    ____");
		System.out.println("   /    \\__");
		System.out.println("  /      ||");
		System.out.println(" /_________\\");
		System.out.println("/| ___     |\\");
		System.out.println(" | |_| ___ |");
		System.out.println(" |     | | |");
		System.out.println(" |     | | |");
		System.out.println(" -----------");
	}
	
	public static void afficherChateau() {
		System.out.println("n_n_n             n_n_n");
		System.out.println("uuuuu  n_n_n_n-n  uuuuu");
		System.out.println("| i |  uuuuuuuuu  | i |");
		System.out.println("|   |  |i     i|  |   |");
		System.out.println("| i n_n_n_n_n_n_n_n i |");
		System.out.println("|   |    _____    |   |");
		System.out.println("| i | i  |III|  i | i |");
		System.out.println("|   |    |   |    |   |");
		System.out.println("-----------------------");
	}
	
}
