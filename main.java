package cours3;

import Cours2.FileAttente;
import Cours2.Personne;

public class main {
	public static void main(String args[]) {

			Rayon<Livre> r1 = new Rayon<>();
			Rayon<Produit> r2 = new Rayon<>();
			
			Livre p = new Livre("Lol");
			Produit pp = new Produit("ha") ;
			
			r1.Ajout(p);
			r2.Ajout(pp);
			
			System.out.println(r1.listingContenu());
			
			FileAttente<Adulte> c1 = new FileAttente<>();
			FileAttente<Enfant> c2 = new FileAttente<>();
			
			
	

}
}
