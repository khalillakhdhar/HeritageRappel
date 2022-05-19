package vehicules;

public class Voiture extends Vehicule {
private int nbpassager, nbchevaux;

public int getNbpassager() {
	return nbpassager;
}

public void setNbpassager(int nbpassager) {
	this.nbpassager = nbpassager;
}

public int getNbchevaux() {
	return nbchevaux;
}

public void setNbchevaux(int nbchevaux) {
	this.nbchevaux = nbchevaux;
}

public Voiture(String marque, String couleur, String carburant, int nbpassager, int nbchevaux) {
	super(marque, couleur, carburant);
	this.nbpassager = nbpassager;
	this.nbchevaux = nbchevaux;
}

public Voiture() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Voiture [nbpassager=" + nbpassager + ", nbchevaux=" + nbchevaux + ", Vehicule=" + super.toString() + "]";
}






}
