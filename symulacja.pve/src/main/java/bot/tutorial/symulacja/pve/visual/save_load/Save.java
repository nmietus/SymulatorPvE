package bot.tutorial.symulacja.pve.visual.save_load;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JSpinner;

public class Save {
	public static void zapisz(JSpinner level, JSpinner hp, JSpinner bron, JSpinner sila, 
			JSpinner zrecznosc, JSpinner inteligencja, JSpinner obronaEq, JSpinner wytrzymalosc, 
			JSpinner silaWoli, JSpinner szybkosc, JSpinner szybkoscEq, JSpinner ub, JSpinner unik, 
			JSpinner karaUnik, JSpinner unikEq, JSpinner wampiryzm, JSpinner zlodziejstwo, JSpinner levelMoba, 
			boolean miasto, JSpinner liczbaSymulacji, JSpinner walkiPodRzad) {
		
		PrintWriter plik = null;
		try {
			plik = new PrintWriter("staty_gracza.txt");
			System.out.println("Nawiązano kontakt z plikiem!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Nie można znalezc pliku do zapisu.");
		}
		
		
		plik.print((Integer)level.getValue()+"\t");
		plik.print((Integer)hp.getValue()+"\t");
		plik.print((Integer)bron.getValue()+"\t");
		plik.print((Double)sila.getValue()+"\t");
		plik.print((Double)zrecznosc.getValue()+"\t");
		plik.print((Double)inteligencja.getValue()+"\t");
		plik.print((Integer)obronaEq.getValue()+"\t");
		plik.print((Double)wytrzymalosc.getValue()+"\t");
		plik.print((Double)silaWoli.getValue()+"\t");
		plik.print((Double)szybkosc.getValue()+"\t");
		plik.print((Integer)szybkoscEq.getValue()+"\t");
		plik.print((Double)ub.getValue()+"\t");
		plik.print((Double)unik.getValue()+"\t");
		plik.print((Double)karaUnik.getValue()+"\t");
		plik.print((Integer)unikEq.getValue()+"\t");
		plik.print((Double)wampiryzm.getValue()+"\t");
		plik.print((Double)zlodziejstwo.getValue()+"\t");
		plik.print((Integer)levelMoba.getValue()+"\t");
		plik.print((Boolean)miasto+"\t");
		plik.print((Integer)liczbaSymulacji.getValue()+"\t");
		plik.print((Integer)walkiPodRzad.getValue()+"\t");
		
		plik.close();
	}
	
	public static void zapisz(double dana, int miejsce) {
		
	}
	
	public static void zapisz(boolean dana, int miejsce) {
		
	}
}
