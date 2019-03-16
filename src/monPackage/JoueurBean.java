package monPackage;

public class JoueurBean {

	// ordre de declaration des methodes attribut / constructeur / methodes / getter

	// -------------------------
	// attribut
	// -------------------------

	private String nom;
	private int scorePartie;
	private GobeletBean gobelet;

	// ----------------------
	// Constructor
	// ----------------------

	public JoueurBean(String nom) {
		super();
		this.nom = nom;
		scorePartie = 0;
		gobelet = new GobeletBean();
	}

	// -----------------------
	// Methodes
	// -------------------------
	public void lancer() {
		gobelet.lancer();
	}

	public void ajouter1P() {
		scorePartie++;
	}

	// -------------------------
	// getter / setter
	// -------------------------
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getScorePartie() {
		return scorePartie;
	}

	public void setScorePartie(int scorePartie) {
		this.scorePartie = scorePartie;
	}

	public GobeletBean getGobelet() {
		return gobelet;
	}

	public void setGobelet(GobeletBean gobelet) {
		this.gobelet = gobelet;
	}

}
