package bot.tutorial.symulacja.pve.classes;

public class Bilans {
	
	public static int bilans_atakow(Enemy e1, Enemy e2) {
		int numer = 0;
		
		double iloraz = e1.getSzybkosc()/e2.getSzybkosc();
		
		if(iloraz < 0.25) numer = 1;
		else if(iloraz <= 0.33) numer = 2;
		else if(iloraz <= 0.5) numer = 3;
		else if(iloraz <= 1) numer = 4;
		
		else if(iloraz <= 2) numer = 1;
		else if(iloraz <= 3) numer = 2;
		else if(iloraz <= 4) numer = 3;
		else if(iloraz > 4) numer = 4;
		
		return numer;
	}
}
