package bot.tutorial.symulacja.pve.classes;

import javax.swing.JTextField;

public class DerivativeCommon {
	public static void szansaTrafienia(Enemy e1, Enemy e2, JTextField szansa) {
		
		int wynik = (int)((Math.log10(e1.getTrafienie()+200)-Math.log10(e2.getZdolnoscUniku()+200))*500+50);
		if(wynik<3) wynik = 3;
		if(wynik>97) wynik = 97;
		
		szansa.setText(wynik+"");
	}
}
