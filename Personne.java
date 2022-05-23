package cours3;

public class Personne implements Objet{
	private String nom ;

	public Personne() {
	}
	
	public Personne(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public boolean Isinvite() {
		return false;
		// TODO Auto-generated method stub
		
	}
	
	
}
