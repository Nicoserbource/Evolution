package evolution;

import java.util.List;
import java.util.ArrayList;

public class Ville {
	
	private byte id;
	private String nom;
	private List<Batiment> listeBatiments;
	private String etat;
	
	public Ville(byte tmpId, String tmpNom) {
		id = tmpId;
		nom = tmpNom;
		List<Batiment> listeBatiments = new ArrayList<Batiment> ();
		etat = "attaquée";
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

	public List<Batiment> getListeBatiments() {
		return listeBatiments;
	}

	public void setListeBatiments(List<Batiment> tmpListeBatiments) {
		listeBatiments = tmpListeBatiments;
	}
	
	public void addBatiment(Batiment batiment) {
		listeBatiments.add(batiment);
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String tmpEtat) {
		etat = tmpEtat;
	}

}
