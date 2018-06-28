package evolution;

public class Mechant extends Personnage {
	
	byte id;
	String nom;
	byte attaque;
	byte vie;
	
	public Mechant(byte tmpId, String tmpNom, byte tmpAttaque, byte tmpVie) {
		super(tmpNom, tmpAttaque, tmpVie);
		id = tmpId;
		nom = tmpNom;
		attaque = tmpAttaque;
		vie = tmpVie;
	}

	public byte getId() {
		return id;
	}

	public void setId(byte tmpId) {
		id = tmpId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String tmpNom) {
		nom = tmpNom;
	}

	public byte getattaque() {
		return attaque;
	}

	public void setattaque(byte tmpAttaque) {
		attaque = tmpAttaque;
	}

	public byte getVie() {
		return vie;
	}

	public void setVie(byte tmpVie) {
		vie = tmpVie;
	}

}
