package test;
import vehicules.Camion;
import vehicules.Vehicule;
import vehicules.Voiture;
public class MainCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicule v =new Vehicule("Suzuki","noir","diesel");
		 Voiture vo=new Voiture("BMW","Gris", "Turbo", 5,12);
		 Camion c=new Camion("Toyota","bleu", "diesel",3, 16, 10000);
		 System.out.println(v.toString());
		 System.out.println(vo.toString());
		 System.out.println(c.toString());
		 

	}

}
