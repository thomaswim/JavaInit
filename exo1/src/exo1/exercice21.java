package exo1;

public class exercice21 {
	
	public static void afficheTableau (short[] tab) {
		for (int current : tab) {
			 System.out.println(current);
		} 
	}

	public static void main (String[] argv) {
		final short[] monTableau = new short[5];
		final char [] charTab = new char[5];
		for (short i = 0; i< monTableau.length ;i++) {
			monTableau[i] = i;
		}
		for (short i = 0; i< charTab.length ;i++) {
			charTab[i] = (char)i;
		}
		
		for (int current : monTableau) {
			 System.out.println(current);
		} 
		for (int current : charTab) {
			 System.out.println(current);
		} 
		
		afficheTableau(monTableau);
	}
	


}
