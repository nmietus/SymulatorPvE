package bot.tutorial.symulacja.pve.classes;

import java.util.Random;

public class Player extends Enemy {

	
	public Player() {
		super();
		this.setLevel(1);
		this.setSumaSzybkosci(10000);
		this.setDmg(99);
		this.setHp(10000);
		this.setObrona(10000);
		this.setTrafienie(10000);
		this.setZdolnoscUniku(10000);
		
		this.setSzansaTk(30);
		this.setStalaUniku(20);
	}
	


	
	public double attack() {

		Random losuj = new Random();
		
		return (this.getDmg()+1+losuj.nextInt(this.getLevel()*5))
				*Tk.mnoznik(this.getSzansaTk());
	}

	
}
