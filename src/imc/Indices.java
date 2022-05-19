package imc;

public class Indices {
private String nom;
private double poids,taille;
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public double getPoids() {
	return poids;
}
public void setPoids(double poids) {
	this.poids = poids;
}
public double getTaille() {
	return taille;
}
public void setTaille(double taille) {
	this.taille = taille;
}
public Indices(String nom, double poids, double taille) {
	super();
	this.nom = nom;
	this.poids = poids;
	this.taille = taille;
}

public int calculer()
{
	
long imcv=Math.round(this.getPoids()/(this.getTaille()*this.getTaille()));
return (int) imcv;


}


public String interpretation()
{
	
int imcc=this.calculer();
if(imcc<20)
	return "maigre";
else if(imcc<=25)
{
return "idéale";	
}
else
	return "surpoids";


}
@Override
public String toString() {
	return "Indices [nom=" + nom + ", poids=" + poids + ", taille=" + taille + ", calcule imc=" + calculer()
			+ ", interpretation=" + interpretation() + "]";
}



}
