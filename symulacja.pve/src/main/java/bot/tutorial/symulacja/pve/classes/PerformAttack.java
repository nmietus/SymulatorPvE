package bot.tutorial.symulacja.pve.classes;

import javax.swing.JTextArea;

public class PerformAttack {
	public static void wykonajAtakMoba(Enemy e1, Enemy e2, JTextArea jTextArea, Results wyniki)
	{
		if(Hit.Trafienie(e2.getTrafienie(), e1.getZdolnoscUniku()))
		{
			double temp_dmg = e2.attack()-e1.getObrona();
			if(temp_dmg<0) temp_dmg=0;
			e1.setHp(e1.getHp()-(int)temp_dmg);
			
			jTextArea.setText(jTextArea.getText()+"\nPotwór atakuje i zadaje "
					+temp_dmg+" obrażeń (zostało "+e1.getHp()+") ");
		} else {
			
			jTextArea.setText(jTextArea.getText()+"\nP: Gracz uniknął ciosu!");
			wyniki.addUnik(1, e1);
		}
	}
	
	public static void wykonajAtakGracza(Enemy e1, Enemy e2, JTextArea jTextArea, Results wyniki)
	{
		if(Hit.Trafienie(e1.getTrafienie(), e2.getZdolnoscUniku()))
		{
			double temp_dmg = e1.attack()-e2.getObrona();
			if(temp_dmg<0) temp_dmg=0;
			e2.setHp(e2.getHp()-(int)temp_dmg);
			
			jTextArea.setText(jTextArea.getText()+"\nGracz atakuje i zadaje "
					+temp_dmg+" obrażeń (zostało "+e2.getHp()+") ");
			if(temp_dmg>0) wyniki.setUb(wyniki.getUb()+0.01);
			
		} else jTextArea.setText(jTextArea.getText()+"\nP: Potwór uniknął ciosu!");
	}
}
