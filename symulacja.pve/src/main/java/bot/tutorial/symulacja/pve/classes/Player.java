package bot.tutorial.symulacja.pve.classes;

import java.util.Random;

public class Player extends Enemy {

	private int SzansaTk;
	private double trafienie;
	private double zdolnoscUniku;
	
	public Player() {
		super();
		this.setLevel(1);
		this.setSzybkosc(10000);
		this.setDmg(99);
		this.setHp(10000);
		this.setObrona(10000);
		this.setUb(10000);
		this.setUnik(10000);
		this.setZrecznosc(10000);
		
		this.setTrafienie(10000);
		this.setZdolnoscUniku(10000);
		this.SzansaTk = 30;
	}
	


	public double getTrafienie() {
		return trafienie;
	}



	public void setTrafienie(double trafienie) {
		this.trafienie = trafienie;
	}



	public double getZdolnoscUniku() {
		return zdolnoscUniku;
	}



	public void setZdolnoscUniku(double zdolnoscUniku) {
		this.zdolnoscUniku = zdolnoscUniku;
	}



	public int getSzansaTk() {
		return SzansaTk;
	}


	public void setSzansaTk(int szansaTk) {
		SzansaTk = szansaTk;
	}
	
	public double attack() {

		Random losuj = new Random();
		
		return (this.getDmg()+1+losuj.nextInt(this.getLevel()*5))
				*Tk.mnoznik(this.getSzansaTk());
	}

	
}
