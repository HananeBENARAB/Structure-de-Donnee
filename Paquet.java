package ExamSession2;



public class Paquet implements Iproduit{
         private String identifiant;
         private String codePostalDest;
         private double montantAff;         // montant de l’affranchissement du paquet
         private Priorite priorite; 
         private double poids;              
         public enum Priorite {   express, normal    }
         public Paquet() {}
 
         public Paquet(String identifiant, String codePostalDest, double montantAff, 
Priorite priorite, double poids) {
		this.identifiant = identifiant;
		this.codePostalDest = codePostalDest;
		this.montantAff = montantAff;
		this.priorite = priorite;
		this.poids = poids;
	}
         public String getIdentifiant() {return identifiant;}
         public void setIdentifiant(String identifiant) {this.identifiant = identifiant;}
         public String getCodePostalDest() {return codePostalDest;}
         public void setCodePostalDest(String codePostalDest) {this.codePostalDest = codePostalDest;}
         public double getMontantAff() {return montantAff;}
         public void setMontantAff(double montantAff) {this.montantAff = montantAff;}
         public Priorite getPriorite() {return priorite;}
         public void setPriorite(Priorite priorite) {this.priorite = priorite;}	
         public double getPoids() {return poids;}
         public void setPoids(double poids) {this.poids = poids;}

		@Override
		public double prix() {
			return this.getMontantAff();
		}

		@Override
		public String reference() {
			return this.getIdentifiant()+this.getCodePostalDest();
		}
}

