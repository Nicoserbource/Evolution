package evolution;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Jeu {
	
	public static List<Secteur> secteurs = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Joueur joueur = new Joueur("", (byte)10, (byte)100, (byte)0);
		Scanner input = new Scanner(System.in);
		System.out.println("Entrez votre nom : ");
		joueur.nom = input.nextLine();
		System.out.println("Bienvenue, "+joueur.nom+" ! Vous pouvez partir à la conquête du monde !");
		Joueur.afficherStats(joueur);
		secteurs = creerSecteurs();
		Combat.attaquerBatiment();
	}
	
	public static List<Secteur> creerSecteurs() {
		List<Secteur> listeSecteurs = new ArrayList<Secteur> ();
		
		listeSecteurs.add(new Secteur((byte)0, "Isère"));
		listeSecteurs.add(new Secteur((byte)1, "Isla Nublar"));
		listeSecteurs.add(new Secteur((byte)2, "Terres Désolées"));
		listeSecteurs.add(new Secteur((byte)3, "Bordeciel"));
		
		listeSecteurs.get(0).addVille(new Ville((byte)0, "Grenoble"));
		listeSecteurs.get(0).addVille(new Ville((byte)1, "Saint-Martin d'Hères"));
		listeSecteurs.get(0).addVille(new Ville((byte)2, "Echirolles"));
		listeSecteurs.get(0).addVille(new Ville((byte)3, "Fontaine"));
		
		listeSecteurs.get(1).addVille(new Ville((byte)0, "Dinosauria"));
		listeSecteurs.get(1).addVille(new Ville((byte)1, "Ornitischia"));
		listeSecteurs.get(1).addVille(new Ville((byte)2, "Saurischia"));
		listeSecteurs.get(1).addVille(new Ville((byte)3, "Pterosauria"));
		
		listeSecteurs.get(2).addVille(new Ville((byte)0, "Abri 101"));
		listeSecteurs.get(2).addVille(new Ville((byte)1, "Ruines de Washington, D.C."));
		listeSecteurs.get(2).addVille(new Ville((byte)2, "Springvale"));
		listeSecteurs.get(2).addVille(new Ville((byte)3, "Megaton"));
		
		listeSecteurs.get(3).addVille(new Ville((byte)0, "Helgen"));
		listeSecteurs.get(3).addVille(new Ville((byte)1, "Rivebois"));
		listeSecteurs.get(3).addVille(new Ville((byte)2, "Blancherive"));
		listeSecteurs.get(3).addVille(new Ville((byte)3, "Haut Hrothgar"));
		
		listeSecteurs.get(0).getListeVilles().get(0).addBatiment(new Batiment((byte)0, "épicerie", new Ressource((byte)0, "nourriture"), (byte)10));
		listeSecteurs.get(0).getListeVilles().get(0).addBatiment(new Batiment((byte)1, "scierie", new Ressource((byte)1, "bois"), (byte)50));
		listeSecteurs.get(0).getListeVilles().get(0).addBatiment(new Batiment((byte)2, "carrière", new Ressource((byte)2, "pierre"), (byte)100));
		listeSecteurs.get(0).getListeVilles().get(0).addBatiment(new Batiment((byte)3, "mine", new Ressource((byte)3, "or"), (byte)10));
		
		listeSecteurs.get(0).getListeVilles().get(1).addBatiment(new Batiment((byte)0, "épicerie", new Ressource((byte)0, "nourriture"), (byte)50));
		listeSecteurs.get(0).getListeVilles().get(1).addBatiment(new Batiment((byte)1, "scierie", new Ressource((byte)1, "bois"), (byte)100));
		listeSecteurs.get(0).getListeVilles().get(1).addBatiment(new Batiment((byte)2, "carrière", new Ressource((byte)2, "pierre"), (byte)150));
		listeSecteurs.get(0).getListeVilles().get(1).addBatiment(new Batiment((byte)3, "mine", new Ressource((byte)3, "or"), (byte)50));
		
		listeSecteurs.get(0).getListeVilles().get(2).addBatiment(new Batiment((byte)0, "épicerie", new Ressource((byte)0, "nourriture"), (byte)100));
		listeSecteurs.get(0).getListeVilles().get(2).addBatiment(new Batiment((byte)1, "scierie", new Ressource((byte)1, "bois"), (byte)150));
		listeSecteurs.get(0).getListeVilles().get(2).addBatiment(new Batiment((byte)2, "carrière", new Ressource((byte)2, "pierre"), (byte)200));
		listeSecteurs.get(0).getListeVilles().get(2).addBatiment(new Batiment((byte)3, "mine", new Ressource((byte)3, "or"), (byte)100));
		
		listeSecteurs.get(0).getListeVilles().get(3).addBatiment(new Batiment((byte)0, "épicerie", new Ressource((byte)0, "nourriture"), (byte)150));
		listeSecteurs.get(0).getListeVilles().get(3).addBatiment(new Batiment((byte)1, "scierie", new Ressource((byte)1, "bois"), (byte)200));
		listeSecteurs.get(0).getListeVilles().get(3).addBatiment(new Batiment((byte)2, "carrière", new Ressource((byte)2, "pierre"), (byte)250));
		listeSecteurs.get(0).getListeVilles().get(3).addBatiment(new Batiment((byte)3, "mine", new Ressource((byte)3, "or"), (byte)150));
		
		listeSecteurs.get(1).getListeVilles().get(0).addBatiment(new Batiment((byte)0, "restaurant", new Ressource((byte)0, "nourriture"), (byte)10));
		listeSecteurs.get(1).getListeVilles().get(0).addBatiment(new Batiment((byte)1, "bar", new Ressource((byte)1, "alcool"), (byte)50));
		listeSecteurs.get(1).getListeVilles().get(0).addBatiment(new Batiment((byte)2, "centrale", new Ressource((byte)2, "énergie"), (byte)100));
		listeSecteurs.get(1).getListeVilles().get(0).addBatiment(new Batiment((byte)3, "laboratoire", new Ressource((byte)3, "Velociraptor"), (byte)20));
		
		listeSecteurs.get(1).getListeVilles().get(1).addBatiment(new Batiment((byte)0, "restaurant", new Ressource((byte)0, "nourriture"), (byte)50));
		listeSecteurs.get(1).getListeVilles().get(1).addBatiment(new Batiment((byte)1, "bar", new Ressource((byte)1, "alcool"), (byte)100));
		listeSecteurs.get(1).getListeVilles().get(1).addBatiment(new Batiment((byte)2, "centrale", new Ressource((byte)2, "énergie"), (byte)150));
		listeSecteurs.get(1).getListeVilles().get(1).addBatiment(new Batiment((byte)3, "laboratoire", new Ressource((byte)3, "Triceratops"), (byte)15));
		
		listeSecteurs.get(1).getListeVilles().get(2).addBatiment(new Batiment((byte)0, "restaurant", new Ressource((byte)0, "nourriture"), (byte)100));
		listeSecteurs.get(1).getListeVilles().get(2).addBatiment(new Batiment((byte)1, "bar", new Ressource((byte)1, "alcool"), (byte)150));
		listeSecteurs.get(1).getListeVilles().get(2).addBatiment(new Batiment((byte)2, "centrale", new Ressource((byte)2, "énergie"), (byte)200));
		listeSecteurs.get(1).getListeVilles().get(2).addBatiment(new Batiment((byte)3, "laboratoire", new Ressource((byte)3, "Tyrannosaure"), (byte)10));
		
		listeSecteurs.get(1).getListeVilles().get(3).addBatiment(new Batiment((byte)0, "restaurant", new Ressource((byte)0, "nourriture"), (byte)150));
		listeSecteurs.get(1).getListeVilles().get(3).addBatiment(new Batiment((byte)1, "bar", new Ressource((byte)1, "alcool"), (byte)200));
		listeSecteurs.get(1).getListeVilles().get(3).addBatiment(new Batiment((byte)2, "centrale", new Ressource((byte)2, "énergie"), (byte)250));
		listeSecteurs.get(1).getListeVilles().get(3).addBatiment(new Batiment((byte)3, "laboratoire", new Ressource((byte)3, "Pteranodon"), (byte)5));
		
		listeSecteurs.get(2).getListeVilles().get(0).addBatiment(new Batiment((byte)0, "supermarché", new Ressource((byte)0, "nourriture"), (byte)10));
		listeSecteurs.get(2).getListeVilles().get(0).addBatiment(new Batiment((byte)1, "bar", new Ressource((byte)1, "alcool"), (byte)50));
		listeSecteurs.get(2).getListeVilles().get(0).addBatiment(new Batiment((byte)2, "usine", new Ressource((byte)2, "acier"), (byte)100));
		listeSecteurs.get(2).getListeVilles().get(0).addBatiment(new Batiment((byte)3, "centrale", new Ressource((byte)3, "énergie"), (byte)150));
		
		listeSecteurs.get(2).getListeVilles().get(1).addBatiment(new Batiment((byte)0, "supermarché", new Ressource((byte)0, "nourriture"), (byte)50));
		listeSecteurs.get(2).getListeVilles().get(1).addBatiment(new Batiment((byte)1, "bar", new Ressource((byte)1, "alcool"), (byte)100));
		listeSecteurs.get(2).getListeVilles().get(1).addBatiment(new Batiment((byte)2, "usine", new Ressource((byte)2, "acier"), (byte)150));
		listeSecteurs.get(2).getListeVilles().get(1).addBatiment(new Batiment((byte)3, "centrale", new Ressource((byte)3, "énergie"), (byte)200));
		
		listeSecteurs.get(2).getListeVilles().get(2).addBatiment(new Batiment((byte)0, "usine", new Ressource((byte)0, "acier"), (byte)100));
		listeSecteurs.get(2).getListeVilles().get(2).addBatiment(new Batiment((byte)1, "centrale", new Ressource((byte)1, "énergie"), (byte)150));
		listeSecteurs.get(2).getListeVilles().get(2).addBatiment(new Batiment((byte)2, "entrepôt", new Ressource((byte)2, "munitions"), (byte)200));
		listeSecteurs.get(2).getListeVilles().get(2).addBatiment(new Batiment((byte)3, "arsenal", new Ressource((byte)3, "arme à feu"), (byte)250));
		
		listeSecteurs.get(2).getListeVilles().get(3).addBatiment(new Batiment((byte)0, "usine", new Ressource((byte)0, "acier"), (byte)150));
		listeSecteurs.get(2).getListeVilles().get(3).addBatiment(new Batiment((byte)1, "centrale", new Ressource((byte)1, "énergie"), (byte)200));
		listeSecteurs.get(2).getListeVilles().get(3).addBatiment(new Batiment((byte)2, "entrepôt", new Ressource((byte)2, "munitions"), (byte)250));
		listeSecteurs.get(2).getListeVilles().get(3).addBatiment(new Batiment((byte)3, "arsenal", new Ressource((byte)3, "arme à feu"), (byte)300));
		
		listeSecteurs.get(3).getListeVilles().get(0).addBatiment(new Batiment((byte)0, "ferme", new Ressource((byte)0, "nourriture"), (byte)50));
		listeSecteurs.get(3).getListeVilles().get(0).addBatiment(new Batiment((byte)1, "taverne", new Ressource((byte)1, "alcool"), (byte)100));
		listeSecteurs.get(3).getListeVilles().get(0).addBatiment(new Batiment((byte)2, "forge", new Ressource((byte)2, "arme blanche"), (byte)150));
		listeSecteurs.get(3).getListeVilles().get(0).addBatiment(new Batiment((byte)3, "boutique", new Ressource((byte)3, "potions magiques"), (byte)100));
		
		listeSecteurs.get(3).getListeVilles().get(1).addBatiment(new Batiment((byte)0, "ferme", new Ressource((byte)0, "nourriture"), (byte)100));
		listeSecteurs.get(3).getListeVilles().get(1).addBatiment(new Batiment((byte)1, "taverne", new Ressource((byte)1, "alcool"), (byte)150));
		listeSecteurs.get(3).getListeVilles().get(1).addBatiment(new Batiment((byte)2, "forge", new Ressource((byte)2, "arme blanche"), (byte)200));
		listeSecteurs.get(3).getListeVilles().get(1).addBatiment(new Batiment((byte)3, "boutique", new Ressource((byte)3, "parchemin magique"), (byte)50));
		
		listeSecteurs.get(3).getListeVilles().get(2).addBatiment(new Batiment((byte)0, "ferme", new Ressource((byte)0, "nourriture"), (byte)150));
		listeSecteurs.get(3).getListeVilles().get(2).addBatiment(new Batiment((byte)1, "taverne", new Ressource((byte)1, "alcool"), (byte)200));
		listeSecteurs.get(3).getListeVilles().get(2).addBatiment(new Batiment((byte)2, "forge", new Ressource((byte)2, "arme blanche"), (byte)250));
		listeSecteurs.get(3).getListeVilles().get(2).addBatiment(new Batiment((byte)3, "boutique", new Ressource((byte)3, "livre de sorts"), (byte)10));
		
		listeSecteurs.get(3).getListeVilles().get(3).addBatiment(new Batiment((byte)0, "ferme", new Ressource((byte)0, "nourriture"), (byte)200));
		listeSecteurs.get(3).getListeVilles().get(3).addBatiment(new Batiment((byte)1, "taverne", new Ressource((byte)1, "alcool"), (byte)250));
		listeSecteurs.get(3).getListeVilles().get(3).addBatiment(new Batiment((byte)2, "forge", new Ressource((byte)2, "arme blanche"), (byte)300));
		listeSecteurs.get(3).getListeVilles().get(3).addBatiment(new Batiment((byte)3, "boutique", new Ressource((byte)3, "dragon"), (byte)1));
		
		return listeSecteurs;
	}

}
