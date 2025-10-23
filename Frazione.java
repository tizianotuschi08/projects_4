
public class Frazione {

	private int denominatore = 0;
	private int numeratore = 0;

	public Frazione() {

	}

	public Frazione(int numeratore, int denominatore) {
		super();
		this.denominatore = denominatore;
		this.numeratore = numeratore;
	}

	public int getDen() {
		return denominatore;
	}

	public void setDen(int denominatore) {
		this.denominatore = denominatore;
	}

	public int getNum() {
		return numeratore;
	}

	public void setNum(int numeratore) {
		this.numeratore = numeratore;
	}

	public Frazione getMin() {
		int minn = numeratore;
		int mind = denominatore;

		int MCD = 0;

		for (int i = 1; i <= denominatore; i++) {
			if (minn % i == 0 && mind % i == 0) {
				MCD = i;
			}
		}

		mind /= MCD;
		minn /= MCD;

		return new Frazione(minn, mind);
	}

	@Override
	public String toString() {
		return "Frazione: " + numeratore + "/" + denominatore;
	}

}
