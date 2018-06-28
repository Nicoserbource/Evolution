package evolution;

public class Joueur extends Personnage {
	
	public String nom;
	private byte attaque;
	private byte vie;
	private byte puissance;
	
	public Joueur(String tmpNom, byte tmpAttaque, byte tmpVie, byte tmpPuissance) {
		super(tmpNom, tmpAttaque, tmpVie);
		nom = tmpNom;
		attaque = tmpAttaque;
		vie = tmpVie;
		puissance = tmpPuissance;
	}
	
	public static void afficherStats(Joueur pj) {
		System.out.println();
		System.out.println("Nom : "+pj.nom);
		System.out.println("Points d'attaque : "+pj.attaque);
		System.out.println("Points de vie : "+pj.vie);
		System.out.println("Puissance : "+pj.puissance);
		System.out.println();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String tmpNom) {
		nom = tmpNom;
	}

	public byte getAttaque() {
		return attaque;
	}

	public void setAttaque(byte tmpAttaque) {
		attaque = tmpAttaque;
	}

	public byte getVie() {
		return vie;
	}

	public void setVie(byte tmpVie) {
		vie = tmpVie;
	}
	
	public byte getPuissance() {
		return puissance;
	}

	public void setPuissance(byte tmpPuissance) {
		puissance = tmpPuissance;
	}

}
