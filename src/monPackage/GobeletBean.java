package monPackage;

public class GobeletBean {

	// ordre de declaration des methodes attribut / constructeur / methodes / getter

	// -------------------------
	// attribut
	// -------------------------

	private DeBean d1;
	private DeBean d2;
	private DeBean d3;

	// ----------------------
	// Constructor
	// ----------------------

	public GobeletBean() {

	}

	// -----------------------
	// Methodes
	// -------------------------

	public void lancer() {
		d1.lancer();
		d2.lancer();
		d3.lancer();
	}

	public void lancerV2() {
		d2.lancer();
		d3.lancer();
	}

	public void lancerV3() {
		d1.lancer();
		d3.lancer();
	}

	public void lancerV4() {
		d1.lancer();
		d2.lancer();
	}

	public void lancerV5() {
		d1.lancer();
	}

	public void lancerV6() {
		d2.lancer();
	}

	public void lancerV7() {
		d3.lancer();
	}

	// -------------------------
	// getter / setter
	// --------------------------

	public DeBean getD1() {
		return d1;
	}

	public void setD1(DeBean d1) {
		this.d1 = d1;
	}

	public DeBean getD2() {
		return d2;
	}

	public void setD2(DeBean d2) {
		this.d2 = d2;
	}

	public DeBean getD3() {
		return d3;
	}

	public void setD3(DeBean d3) {
		this.d3 = d3;
	}

}