package bot.tutorial.symulacja.pve.classes;

import javax.swing.JTextArea;

public class PerformAttack {
	
	public static void wykonajAtakMoba(Enemy e1, Enemy e2, Results wyniki)
	{
		double temp_dmg = 0;
		if(Hit.Trafienie(e2.getTrafienie(), e1.getZdolnoscUniku()))
		{
			temp_dmg = e2.attack()-e1.getObrona();
			if(temp_dmg<0) {
				temp_dmg = 0;
			}
		} else {
			e1.setHp(e1.getHp()-(int)temp_dmg);
			wyniki.addUnik(1, e1);
		}
	}
	
	public static void wykonajAtakGracza(Enemy e1, Enemy e2, Results wyniki)
	{
		double temp_dmg = 0;
		if(Hit.Trafienie(e1.getTrafienie(), e2.getZdolnoscUniku()))
		{
			temp_dmg = e1.attack()-e2.getObrona();
			if(temp_dmg<0) {
				temp_dmg=0;
			} else {
				e2.setHp(e2.getHp()-(int)temp_dmg);
				wyniki.setUb(wyniki.getUb()+0.01);
			}
				
	
		}
	}
	
}
