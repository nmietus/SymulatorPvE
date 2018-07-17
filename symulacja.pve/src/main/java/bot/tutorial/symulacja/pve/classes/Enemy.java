package bot.tutorial.symulacja.pve.classes;

public class Enemy implements Fighting {
	
	private int level;
	private int hp;
	private double dmg;
	private double szybkosc;
	private double zrecznosc;
	private double obrona;
	
	public Enemy() {
		super();
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public double getDmg() {
		return dmg;
	}

	public void setDmg(double dmg) {
		this.dmg = dmg;
	}

	public double getSzybkosc() {
		return szybkosc;
	}

	public void setSzybkosc(double szybkosc) {
		this.szybkosc = szybkosc;
	}

	public double getZrecznosc() {
		return zrecznosc;
	}

	public void setZrecznosc(double zrecznosc) {
		this.zrecznosc = zrecznosc;
	}

	public double getObrona() {
		return obrona;
	}

	public void setObrona(double obrona) {
		this.obrona = obrona;
	}

	public String attack() {
		// TODO Auto-generated method stub
		return null;
	} 
	
}
