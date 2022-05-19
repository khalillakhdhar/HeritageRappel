package vehicules;

public class Vehicule {
	private String marque;
	private String couleur;
	private String carburant;
	public Vehicule(String marque, String couleur, String carburant) {
		super();
		this.marque = marque;
		this.couleur = couleur;
		this.carburant = carburant;
	}
	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Vehicule [marque=" + marque + ", couleur=" + couleur + ", carburant=" + carburant + "]";
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public String getCarburant() {
		return carburant;
	}
	public void setCarburant(String carburant) {
		this.carburant = carburant;
	}
	
	
	
	
	
	
	
	
	

}
