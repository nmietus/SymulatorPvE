package bot.tutorial.symulacja.pve.classes;

import java.io.File;
import java.util.Scanner;

public class Monster extends Enemy implements Loadable {
	
	private boolean miasto;	//wartość true oznacza Elakkę, a false Sith

	public Monster() {
		super();
		miasto = true;
	}

	public boolean isMiasto() {
		return miasto;
	}

	public void setMiasto(boolean miasto) {
		this.miasto = miasto;
	}
	
	public void load(Enemy e, int lvl) 
	{
		Scanner skan = null;
		try 
		{
			if(miasto) skan = new Scanner(new File("staty_moba_elakka.txt"));
			else skan = new Scanner(new File("staty_moba_sith.txt")); 
			
			System.out.println("Wczytano staty!");
		} catch(Exception error) 
		{
			System.out.println("Nie można wczytać pliku");
		}
		
		
		while(skan.hasNext()) 
		{
				this.setLevel(skan.nextInt());
				this.setHp(skan.nextInt());
				this.setZrecznosc(skan.nextDouble());
				this.setDmg(skan.nextDouble());
				this.setSzybkosc(skan.nextDouble());
				this.setObrona(skan.nextDouble());
				skan.next();
				skan.next();
				
				
				if(lvl==this.getLevel()) {
					
					break;
				}
				else {
					this.setLevel(0);
					this.setHp(0);
					this.setZrecznosc(0);
					this.setDmg(0);
					this.setSzybkosc(0);
					this.setObrona(0);
					
				}
					
		}
		
		System.out.println(this.getLevel()+" "+this.getHp()+" "+this.getZrecznosc()+" "+
				this.getDmg()+" "+this.getSzybkosc()+" "+this.getObrona());
		
		skan.close();
	}
}
