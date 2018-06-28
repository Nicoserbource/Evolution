package evolution;

import java.util.List;
import java.util.ArrayList;

public class Batiment {
	
	private byte id;
	private String nom;
	private Ressource ressource;
	private String description;
	private List<Mechant> listeMechants;
	byte stock;
	byte vie;
	
	public Batiment(byte tmpId, String tmpNom, Ressource tmpRessource, byte tmpStock, byte tmpVie) {
		id = tmpId;
		nom = tmpNom;
		ressource = tmpRessource;
		description = null;
		List<Mechant> listeMechants = new ArrayList<Mechant> ();
		stock = tmpStock;
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

	public Ressource getRessource() {
		return ressource;
	}

	public void setRessource(Ressource tmpRessource) {
		ressource = tmpRessource;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String tmpDescription) {
		description = tmpDescription;
	}

	public List<Mechant> getListeMechants() {
		return listeMechants;
	}

	public void setListeMechants(List<Mechant> tmpListeMechants) {
		listeMechants = tmpListeMechants;
	}

	public byte getStock() {
		return stock;
	}

	public void setStock(byte tmpStock) {
		stock = tmpStock;
	}

	public byte getVie() {
		return vie;
	}

	public void setVie(byte tmpVie) {
		vie = tmpVie;
	}
	
}
