package vehicules;

public class Camion extends Voiture {
	
	private int capacite;

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public Camion(String marque, String couleur, String carburant, int nbpassager, int nbchevaux, int capacite) {
		super(marque, couleur, carburant, nbpassager, nbchevaux);
		this.capacite = capacite;
	}

	public Camion() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Camion [capacite=" + capacite + ", toString()=" + super.toString() + "]";
	}
	

}
