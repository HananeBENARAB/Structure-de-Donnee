package ExamSession2;

import ExamSession2.Paquet.Priorite;

public interface Ichargement {
	void ajout(Paquet p) throws PoidsMaxAtteintException;
	double PoidsChargement();
	double SommePrix(Priorite priorite);
	

}
