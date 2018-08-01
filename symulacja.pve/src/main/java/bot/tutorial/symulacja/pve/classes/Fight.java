package bot.tutorial.symulacja.pve.classes;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Fight {
	
	public void walka(int ile, JTextArea jTextArea, Enemy e1, Enemy e2,
			JTextField srUb, JTextField srUnik, JTextField srEnergia,
			JTextField srWygrane, JTextField srRemisy, JTextField srPrzegrane) {
		
		int hpGracza = e1.getHp();
		int hpMoba = e2.getHp();
		
		Results wyniki = new Results();
		
		for (int j = 0; j < ile; j++) {
			jTextArea.setText("");
			
			for(int i=0; i<24; i++) 
			{
				
				Round.Runda(e1, e2, jTextArea, wyniki);
				
			}
			if(e1.getHp()>0 && e2.getHp()>0) wyniki.setRemisy(wyniki.getRemisy()+1);
			e1.setHp(hpGracza);
			e2.setHp(hpMoba);
		}

		wyniki.setUb(wyniki.getUb()/ile);
		wyniki.setUniki(wyniki.getUniki()/ile);
		wyniki.setWygrane(wyniki.getWygrane()/ile);
		wyniki.setRemisy(wyniki.getRemisy()/ile);
		wyniki.setPrzegrane(wyniki.getPrzegrane()/ile);
		
		wyniki.show(srUb, srUnik, srEnergia, srWygrane, srRemisy, srPrzegrane);
	}
}
