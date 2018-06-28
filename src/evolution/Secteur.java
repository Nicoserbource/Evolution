package evolution;

import java.util.List;
import java.util.ArrayList;

public class Secteur {
	
	private byte id;
	private String nom;
	private List<Ville> listeVilles;
	
	public Secteur(byte tmpId, String tmpNom) {
		id = tmpId;
		nom = tmpNom;
		List<Ville> listeVilles = new ArrayList<Ville> ();
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

	public List<Ville> getListeVilles() {
		return listeVilles;
	}

	public void setListeVilles(List<Ville> tmpListeVilles) {
		listeVilles = tmpListeVilles;
	}
	
	public void addVille(Ville ville) {
		listeVilles.add(ville);
	}

}
