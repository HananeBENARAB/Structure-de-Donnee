package cours3;

import java.util.ArrayList;

public class Rayon<A extends ObjetAvecEtiquette>{
	private ArrayList<A> contenu=new ArrayList<A>();

	public Rayon() {}
	
	public String listingContenu() {
		String listing="";
		for (A c:contenu)
			listing += c.Etiquette();
		return listing;
}
	public void Ajout(A p) {
		if (!this.contenu.contains(p))
			this.contenu.add(p);
	}
}


