package evolution;

public class Ressource {
	
	private byte id;
	private String nom;
	private String description;
	
	public Ressource(byte tmpId, String tmpNom) {
		id = tmpId;
		nom = tmpNom;
		description = null;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String tmpDescription) {
		description = tmpDescription;
	}

}
