package partie3;

public class Voiture34 {
	private int puissance;
	private int vitesse;
	private boolean estDemarre;
	private char nom;
	private static int nbVoitures = 0;
	private static Voiture34[] listeVoitures = new Voiture34[10] ;
	
	public int getPuissance() {
		return puissance;
	}
	
	
	
	
	
	
	public char getNom() {
		return nom;
	}






	public void setNom(char nom) {
		this.nom = nom;
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







	
	//Methode de classes  : 
	public static int getnbVoitures() {
		return nbVoitures ;
	}
	
	public static Voiture34[] getListeVoitures() {
		return listeVoitures;
	}

	
	//constructeur 
	public Voiture34() {
		puissance = 8;
		vitesse = 4;
		estDemarre = true;
		//maj listevoiture
		listeVoitures[nbVoitures] = this;
		//increment
		nbVoitures++;
	}
	





	public void demarre() {
		estDemarre = true ;
	}
	public void demarre(int vi) {
		if(vi==0) {
			estDemarre = true;
		}else {
			estDemarre = false;
		}
	}
}