package ExamSession2;

import ExamSession2.Paquet.Priorite;

public class main {
	public static void main(String args[]){
		try {
	Paquet p1 = new Paquet("ID1","83000",	5,Priorite.express, 12);
	Paquet p2 = new Paquet("ID2","34090",	12,Priorite.express, 32);
	Paquet p3 = new Paquet("ID3","59300",	16,Priorite.express, 200);
	
	Chargement ch1 = new Chargement();
	ch1.ajout(p2);
	ch1.ajout(p1);
	ch1.ajout(p3);
	
	System.out.println("Le poids du chargement : "+ch1.PoidsChargement());
	System.out.println("La somme du prix : "+ch1.SommePrixx(Priorite.express));
	}
	
	catch (PoidsMaxAtteintException e){
		System.out.println(" le poids max d'un des paquets est dépassé ");
	}
		
	
	

	
}
}