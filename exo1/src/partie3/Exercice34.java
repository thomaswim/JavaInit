package partie3;

public class Exercice34 {
	public static void main(String[] argv) {
		Voiture34 Voiture1 = new Voiture34() ;
		Voiture34 Voiture2 = new Voiture34() ;
		
		Voiture1.setNom('A');
		Voiture2.setNom('B');
		System.out.println("N = "+Voiture34.getnbVoitures());
		
		for (int i=0 ; i<Voiture34.getnbVoitures();i++) {
			System.out.println(Voiture34.getListeVoitures()[i].getNom());
		}
		
	}
}
