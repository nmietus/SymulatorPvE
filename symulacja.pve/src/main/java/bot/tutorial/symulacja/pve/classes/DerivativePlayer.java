package bot.tutorial.symulacja.pve.classes;

import java.text.DecimalFormat;

import javax.swing.JSpinner;
import javax.swing.JTextField;

public class DerivativePlayer {
	
	public static void przeliczDmg(Enemy e, JSpinner silaBroni, JSpinner sila, JTextField minAtakGracza, JTextField maxAtakGracza) {
		e.setDmg((Integer)silaBroni.getValue()+(Double)sila.getValue());
		double minDmg = e.getDmg()+1;
		double maxDmg = e.getDmg()+5*e.getLevel();
		minAtakGracza.setText(minDmg+"");
		maxAtakGracza.setText(maxDmg+"");
	}
	
	public static void przeliczObrone(Enemy e, JSpinner wytrzymalosc, JSpinner zrecznosc, JSpinner obronaEq, JTextField obronaGracza) {
		double obrona = 0;
		
		obrona = (Double)wytrzymalosc.getValue()+(Double)zrecznosc.getValue()*0.1+(Integer)obronaEq.getValue();
		
		DecimalFormat df = new DecimalFormat("###.###");
		
		e.setObrona(obrona);
		obronaGracza.setText(df.format(e.getObrona())+"");
	}

	public static void przeliczTrafienie(Enemy e, JSpinner ub, JSpinner sila, JSpinner zrecznosc, JSpinner inteligencja, 
										JSpinner wampiryzm,	JTextField textTrafienie) {
		double trafienie = 0;
		
		trafienie = (Double)ub.getValue()+(Double)wampiryzm.getValue()/2+e.getLevel()
				+(Double)sila.getValue()*(0.25+(double)e.getLevel()/5800)+(Double)zrecznosc.getValue()
				*(0.333+(double)e.getLevel()/4000)+(Double)inteligencja.getValue()*(0.333+(double)e.getLevel()/2200);
		
		e.setTrafienie(trafienie);
		DecimalFormat df = new DecimalFormat("###.###");
		textTrafienie.setText(df.format(e.getTrafienie())+"");
	}
	
	public static void przeliczZdolnoscUniku(Enemy e, JSpinner unik, JSpinner szybkosc, JSpinner szybkoscBroni,
											JSpinner unikEq, JSpinner karaUniku, JSpinner zlodziejstwo, JTextField zdolnoscUniku) {
		
		double wynikUnikow = 0;
		wynikUnikow = e.getLevel()+(Double)unik.getValue()*(1-(Double)karaUniku.getValue()/100)+
				((Double)szybkosc.getValue()+(Integer)szybkoscBroni.getValue())*0.4+(Integer)unikEq.getValue()+(Double)zlodziejstwo.getValue()*2;
		
		e.setZdolnoscUniku(wynikUnikow);
		DecimalFormat df = new DecimalFormat("###.###");
		zdolnoscUniku.setText(df.format(e.getZdolnoscUniku())+"");
		
	}
	
	public static void przeliczSumeSzybkosci(Enemy e, JSpinner szybkosc, JSpinner szybkoscBroni) {
		double temp = e.getLevel()+(Double)szybkosc.getValue()+(Integer)szybkoscBroni.getValue();
		e.setSumaSzybkosci(temp);
	}
	
	public static void przeliczSzanseTk(Enemy e, JSpinner ub, JTextField szansaTk) {
		int szansa_Tk = 0;
		szansa_Tk = (int)Math.floor((Math.sqrt((Double)ub.getValue()*0.08+1)-1)/2);
		
		if(szansa_Tk<1) szansa_Tk=1;
		if(szansa_Tk>25) szansa_Tk=25;
		
		e.setSzansaTk(szansa_Tk);
		szansaTk.setText(e.getSzansaTk()+"");
		
	}
	
	public static void przeliczStalaUniku(Enemy e, JSpinner unik, JTextField stalaUniku) {

		int stala_uniku = 0;
		
		if((Double)unik.getValue()<10) stala_uniku = 25;
		if((Double)unik.getValue()>=10 && (Double)unik.getValue()<20) stala_uniku = 26;
		if((Double)unik.getValue()>=20 && (Double)unik.getValue()<50) stala_uniku = 27;
		if((Double)unik.getValue()>=50 && (Double)unik.getValue()<100) stala_uniku = 28;
		if((Double)unik.getValue()>=100 && (Double)unik.getValue()<200) stala_uniku = 29;
		if((Double)unik.getValue()>=200 && (Double)unik.getValue()<500) stala_uniku = 30;
		if((Double)unik.getValue()>=500 && (Double)unik.getValue()<1000) stala_uniku = 32;
		if((Double)unik.getValue()>=1000 && (Double)unik.getValue()<2000) stala_uniku = 34;
		if((Double)unik.getValue()>=2000 && (Double)unik.getValue()<5000) stala_uniku = 36;
		if((Double)unik.getValue()>=5000 && (Double)unik.getValue()<10000) stala_uniku = 38;
		if((Double)unik.getValue()>=10000 && (Double)unik.getValue()<20000) stala_uniku = 40;
		if((Double)unik.getValue()>=20000 && (Double)unik.getValue()<40000) stala_uniku = 45;
		if((Double)unik.getValue()>=40000 && (Double)unik.getValue()<50000) stala_uniku = 50;
		if((Double)unik.getValue()>=50000 && (Double)unik.getValue()<60000) stala_uniku = 55;
		if((Double)unik.getValue()>=60000) stala_uniku = 60;
		
		e.setStalaUniku(stala_uniku);
		stalaUniku.setText(e.getStalaUniku()+"");
		
	}
	
	public static void przeliczKryty(Enemy e, JTextField min10, JTextField max10, JTextField min15, JTextField max15,
									JTextField min20, JTextField max20, JTextField min30, JTextField max30, 
									JTextField min40, JTextField max40, JTextField min50, JTextField max50) {
		double temp = 0;
		DecimalFormat df = new DecimalFormat("###.###");
		
		temp = (e.getDmg()+1)*1.1;
		min10.setText(df.format(temp)+"");
		temp = (e.getDmg()+e.getLevel()*5)*1.1;
		max10.setText(df.format(temp)+"");
		
		temp = (e.getDmg()+1)*1.15;
		min15.setText(df.format(temp)+"");
		temp = (e.getDmg()+e.getLevel()*5)*1.15;
		max15.setText(df.format(temp)+"");
		
		temp = (e.getDmg()+1)*1.2;
		min20.setText(df.format(temp)+"");
		temp = (e.getDmg()+e.getLevel()*5)*1.2;
		max20.setText(df.format(temp)+"");
		
		temp = (e.getDmg()+1)*1.3;
		min30.setText(df.format(temp)+"");
		temp = (e.getDmg()+e.getLevel()*5)*1.3;
		max30.setText(df.format(temp)+"");
		
		temp = (e.getDmg()+1)*1.4;
		min40.setText(df.format(temp)+"");
		temp = (e.getDmg()+e.getLevel()*5)*1.4;
		max40.setText(df.format(temp)+"");
		
		temp = (e.getDmg()+1)*1.5;
		min50.setText(df.format(temp)+"");
		temp = (e.getDmg()+e.getLevel()*5)*1.5;
		max50.setText(df.format(temp)+"");
		
		
	}
}
