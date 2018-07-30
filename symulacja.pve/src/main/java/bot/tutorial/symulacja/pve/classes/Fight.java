package bot.tutorial.symulacja.pve.classes;

import javax.swing.JTextArea;

public class Fight {
	
	public void walka(int ile, JTextArea jTextArea, Enemy e2) {
		
		Enemy e1 = new Player();
		
		int hpGracza = e1.getHp();
		int hpMoba = e2.getHp();
		
		Results wyniki = new Results();
		
		for(int i=0; i<24; i++) 
		{
			
			Round.Runda(e1, e2, jTextArea, wyniki);
			
		}
		if(e1.getHp()>0 && e2.getHp()>0) wyniki.setRemisy(wyniki.getRemisy()+1);
		
		e1.setHp(hpMoba);
		e2.setHp(hpMoba);
		
		wyniki.show();
	}
}
