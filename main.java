package Cours2;

public class main {
	public static void main(String args[]) {
	
	Tache t1 = new Tache();
	Tache t2 = new Tache();

	Personne p1 = new Personne() ;
	
	FileAttente<Tache> f2 = new FileAttente<>();

	FileAttente<Tache> f1 = new FileAttente<>();
	FileAttente<Personne> c1 = new FileAttente<>();
	
	f1.entre(t1);
	
	System.out.println(f1.nbrtotale());
	System.out.println(f2.comp(f1));
	
	

}
}