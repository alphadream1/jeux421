package monPackage;

public class PartieBean {

	// ordre de declaration des methodes attribut / constructeur / methodes / getter

	// -------------------------
	// attribut
	// -------------------------

	private JoueurBean joueur1, joueur2, jC;
	private int NbreTour;

	// on peux d�clarer les meme attribut en les separant par une virgule

	// ----------------------
	// Constructor
	// ----------------------

	public PartieBean(String nomj1, String nomj2) {
		joueur1 = new JoueurBean(nomj1);
		joueur2 = new JoueurBean(nomj2);
		NbreTour = 1;
		jC = joueur1;
	}

	// -----------------------
	// Methodes
	// -------------------------

	public void ajouterUnTour() {
		NbreTour++;
	}

	public void changerJC() {
		if (jC == joueur1) {
			jC = joueur2;
		} else {
			jC = joueur1;
		}

		// la meme chose en ternaire jC = jC == joueur1 ? joueur2 : joueur1;
	}

	// -------------------------
	// getter / setter
	// -------------------------

	public JoueurBean getJoueur1() {
		return joueur1;
	}

	public void setJoueur1(JoueurBean joueur1) {
		this.joueur1 = joueur1;
	}

	public JoueurBean getJoueur2() {
		return joueur2;
	}

	public void setJoueur2(JoueurBean joueur2) {
		this.joueur2 = joueur2;
	}

	public int getNbreTour() {
		return NbreTour;
	}

	public void setNbreTour(int nbreTour) {
		NbreTour = nbreTour;
	}

	public JoueurBean getJc() {
		return jC;
	}

	public void setJc(JoueurBean jc) {
		jC = jc;
	}
}
