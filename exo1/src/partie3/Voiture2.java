package partie3;

public class Voiture2 {
	private int puissance;
	private int vitesse;
	private boolean estDemarre;
	
	public int getPuissance() {
		return puissance;
	}
	
	
	
	
	
	
	public int getVitesse() {
		return vitesse;
	}






	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}






	public boolean isEstDemarre() {
		return estDemarre;
	}






	public void setEstDemarre(boolean estDemarre) {
		this.estDemarre = estDemarre;
	}






	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}






	public Voiture2 () {
		puissance = 8;
		vitesse = 4;
		estDemarre = true;
	}
	
	
	public void demarre() {
		estDemarre = true ;
	}
}
