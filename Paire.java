package Cours2;

public class Paire<A,B> {
	
	private A fst;
	private B snd ;
	
	
	public Paire(A fst, B snd) {
		this.fst = fst;
		this.snd = snd;
	}


	public A getFst() {
		return fst;
	}


	public void setFst(A fst) {
		this.fst = fst;
	}


	public B getSnd() {
		return snd;
	}


	public void setSnd(B snd) {
		this.snd = snd;
	}
	
	
	
}
