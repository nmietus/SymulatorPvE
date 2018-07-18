package bot.tutorial.symulacja.pve.classes;

import javax.swing.JTextArea;

public class Fight {
	
	public void walka(int ile, JTextArea jTextArea) {
		
		Enemy e1 = new Player();
		Enemy e2 = new Monster();
		
		e2.load(e2, 100);
		
		Results wyniki = new Results();
		
		for(int i=0; i<24; i++) 
		{
			
			Round.Runda(e1, e2, jTextArea, wyniki);
			
		}
		if(e1.getHp()>0 && e2.getHp()>0) wyniki.setRemisy(wyniki.getRemisy()+1);
		
		wyniki.show();
		
	}
}
