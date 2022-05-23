package cours3;

import java.util.ArrayList;

public class FileAttente<A extends Objet>
{
private String nomFile;
private static int nbEntreesTotal = 0;
private ArrayList<A> contenu;

public FileAttente(){
	contenu=new ArrayList<A>();}


public A sort()
{
A p=null;
if (!contenu.isEmpty())
{p=contenu.get(0);
contenu.remove(0);}
return p;
}
public int nbElements(){return contenu.size();}
public boolean estVide(){return contenu.isEmpty();}
public String toString(){return ""+descriptionContenu();}
private String descriptionContenu()
{
String resultat = "";
for (A p:this.contenu)
resultat += p + " ";
return resultat;
}

public static int nbrtotale() {
	return FileAttente.nbEntreesTotal ;
}

public boolean comp(FileAttente<A> p) {
	if (p == this)
		return true;
	else
		return false;
		
}

public void entre(A e)
{
if (e.Isinvite()) 
	contenu.add(e);
else System.out.println("non invite");
}

public <B> void dep(FileAttente<A> p) {
	
}

}
