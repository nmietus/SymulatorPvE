package bot.tutorial.symulacja.pve.classes;

public class Results {
	
	private int wygrane;
	private int przegrane;
	private int remisy;
	
	private int exp;
	
	private double ub;
	private double uniki;
	
	public Results() {
		super();
		wygrane = 0;
		przegrane = 0;
		remisy = 0;
		exp = 0;
		ub = 0;
		uniki = 0;
	}

	public int getWygrane() {
		return wygrane;
	}

	public void setWygrane(int wygrane) {
		this.wygrane = wygrane;
	}

	public int getPrzegrane() {
		return przegrane;
	}

	public void setPrzegrane(int przegrane) {
		this.przegrane = przegrane;
	}

	public int getRemisy() {
		return remisy;
	}

	public void setRemisy(int remisy) {
		this.remisy = remisy;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public double getUb() {
		return ub;
	}

	public void setUb(double ub) {
		this.ub = ub;
	}

	public double getUniki() {
		return uniki;
	}

	private void setUnik(double uniki) {
		this.uniki = uniki;
	}
	
	public void addUnik(int unikniecia, Enemy e1) {
		double wynik = 0;
//		double stala_uniku=0;
//		

		
		wynik = 0.1*unikniecia/e1.getStalaUniku();
		
		setUnik(this.getUniki()+wynik);
	}
	
	public void show() {
		System.out.println("Wygranych walk: "+this.getWygrane()+", przegranych walk: "
				+this.getPrzegrane()+", remisów: "+this.getRemisy()+", "
				+this.getUb()+" UB, "+this.getUniki()+" uników");
	}
	
}
