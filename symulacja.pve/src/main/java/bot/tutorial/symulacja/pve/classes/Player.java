package bot.tutorial.symulacja.pve.classes;

import java.util.Random;

public class Player extends Enemy {

	private int SzansaTk;
	
	public Player() {
		super();
		this.setLevel(1);
		this.setSzybkosc(100);
		this.setDmg(99);
		this.setHp(10000);
		this.setObrona(10000);
		this.setZrecznosc(10000);
		this.SzansaTk = 30;
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
