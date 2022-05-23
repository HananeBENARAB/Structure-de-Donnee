package ExamSession2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import ExamSession2.Paquet.Priorite;

public class Chargement implements Ichargement {
	private final double PoidsMax=200;
	HashMap<String,Paquet> Hash = new HashMap<>();
	
	@Override
	public void ajout(Paquet p) throws PoidsMaxAtteintException {
		if (Hash.containsValue(p))
			System.out.println("déja présent");
		if (p.getPoids()> this.PoidsMax) throw new PoidsMaxAtteintException("poid atteint ");
		this.Hash.put(p.getIdentifiant(), p)	;
	
	}

	@Override
	public double PoidsChargement() { 
		double s = 0;
		for (Paquet p : this.Hash.values()) 
			s+=p.getPoids();
			
		return s;
	}

	@Override
	public double SommePrix(Priorite priorite) { 
		double s = 0;
		for (Paquet p : this.Hash.values())
			if(p.getPriorite().equals(priorite))
				s+=p.prix();
		return s;}
		
		public double SommePrixx(Priorite priorite) { 
			return this.Hash.values()
					.stream()
					.filter(Hash -> Hash.getPriorite().equals(priorite))
					.mapToDouble(Hash -> Hash.prix())
					.sum() ;}
					
					
		
				
		
				
	

}
