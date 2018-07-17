package bot.tutorial.symulacja.pve.classes;

public class Player extends Enemy implements Fighting {

	private double SzansaTk;
	
	public Player() {
		super();
		this.setLevel(1);
		this.setSzybkosc(100);
		this.setHp(10000);
		this.setObrona(10000);
		this.setZrecznosc(10000);
		this.SzansaTk = 30;
	}
	
	
	public double getSzansaTk() {
		return SzansaTk;
	}


	public void setSzansaTk(double szansaTk) {
		SzansaTk = szansaTk;
	}


	public String attack() {
		return "Atakuje gracz";	
	}
}
