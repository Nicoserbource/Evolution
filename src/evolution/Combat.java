package evolution;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Combat {

	public void combattre(List<Secteur> listeSecteurs) {
		String answer;
		Secteur secteur = new Secteur(secteur.setId(0), secteur.getNom());
		Ville ville = new Ville(ville.setId(0), ville.getNom());
		Batiment batiment = new Batiment(batiment.setId(0), batiment.getNom(), batiment.getRessource(), batiment.getStock(), batiment.getId());
		Scanner input = new Scanner(System.in);
		listeSecteurs.get(secteur.id).getListeVilles().get(ville.id).getListeBatiments().get(batiment.id);
		for (batiment.id = 0; batiment.id <= 3; batiment.id++) {
			do {
				System.out.println("Voulez-vous attaquer le "+batiment.nom+" de "+ville.nom+" ?");
				answer = input.nextLine();
				if(answer.equals("o")||answer.equals("oui")||answer.equals("O")||answer.equals("Oui")||answer.equals("OUI")) {
					System.out.println("Vous attaquez le "+batiment.nom+" de "+ville.nom+" !");
					System.out.println("Le "+batiment.nom+" de "+ville.nom+" est à vous !");
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
