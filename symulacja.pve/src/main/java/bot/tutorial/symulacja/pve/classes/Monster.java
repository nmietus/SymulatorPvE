package bot.tutorial.symulacja.pve.classes;

import java.io.File;
import java.util.Scanner;

public class Monster extends Enemy implements Loadable {

	public Monster() {
		super();
	}

	public void load(Enemy e, int lvl) 
	{
		Scanner skan = null;
		try 
		{
			skan = new Scanner(new File("staty_moba_elakka.txt"));
			//Scanner skan = new Scanner(new File("staty_moba_elakka.txt"));
			System.out.println("Wczytano staty!");
		} catch(Exception error) 
		{
			System.out.println("Nie można wczytać pliku");
		}
		
		int i=1;
		while(i<=lvl) 
		{
				this.setLevel(skan.nextInt());
				this.setHp(skan.nextInt());
				this.setZrecznosc(skan.nextDouble());
				this.setDmg(skan.nextDouble());
				this.setSzybkosc(skan.nextDouble());
				this.setObrona(skan.nextDouble());
				skan.next();
				skan.next();
				
				if(lvl==this.getLevel()) break;
				
				i++;
		} 
		
		System.out.println(this.getLevel()+" "+this.getHp()+" "+this.getZrecznosc()+" "+
				this.getDmg()+" "+this.getSzybkosc()+" "+this.getObrona());
		
		skan.close();
	}
}
