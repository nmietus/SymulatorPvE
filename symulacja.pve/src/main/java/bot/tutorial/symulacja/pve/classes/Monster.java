package bot.tutorial.symulacja.pve.classes;

public class Monster extends Enemy implements Fighting, Loadable {

	public String attack() {
		
		return "Atakuje powtór";
		
	}

	public Monster() {
		super();
		//this.setSzybkosc(500);
		this.setLevel(100);
	}

	public void load(Enemy e) {
		// TODO Auto-generated method stub
		
	}
	

}
