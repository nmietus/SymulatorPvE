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
//		if(e1.getUnik()<10) stala_uniku = 25;
//		if(e1.getUnik()>=10 && e1.getUnik()<20) stala_uniku = 26;
//		if(e1.getUnik()>=20 && e1.getUnik()<50) stala_uniku = 27;
//		if(e1.getUnik()>=50 && e1.getUnik()<100) stala_uniku = 28;
//		if(e1.getUnik()>=100 && e1.getUnik()<200) stala_uniku = 29;
//		if(e1.getUnik()>=200 && e1.getUnik()<500) stala_uniku = 30;
//		if(e1.getUnik()>=500 && e1.getUnik()<1000) stala_uniku = 32;
//		if(e1.getUnik()>=1000 && e1.getUnik()<2000) stala_uniku = 34;
//		if(e1.getUnik()>=2000 && e1.getUnik()<5000) stala_uniku = 36;
//		if(e1.getUnik()>=5000 && e1.getUnik()<10000) stala_uniku = 38;
//		if(e1.getUnik()>=10000 && e1.getUnik()<20000) stala_uniku = 40;
//		if(e1.getUnik()>=20000 && e1.getUnik()<40000) stala_uniku = 45;
//		if(e1.getUnik()>=40000 && e1.getUnik()<50000) stala_uniku = 50;
//		if(e1.getUnik()>=50000 && e1.getUnik()<60000) stala_uniku = 55;
//		if(e1.getUnik()>=60000) stala_uniku = 60;
		
		wynik = 0.1*unikniecia/e1.getStalaUniku();
		
		setUnik(this.getUniki()+wynik);
	}
	
	public void show() {
		System.out.println("Wygranych walk: "+this.getWygrane()+", przegranych walk: "
				+this.getPrzegrane()+", remisów: "+this.getRemisy()+", "
				+this.getUb()+" UB, "+this.getUniki()+" uników");
	}
	
}
