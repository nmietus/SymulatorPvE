package bot.tutorial.symulacja.pve.classes;

import javax.swing.JTextArea;

public class Fight {
	
	public void walka(int ile, JTextArea jTextArea) {
		
		Enemy e1 = new Player();
		Enemy e2 = new Monster();
		
		e2.load(e2, 1);
		
		//pętla za walkę
		for(int i=0; i<24; i++) 
		{
			//runda
			if(Bilans.bilans_atakow(e1, e2)==1) {
				jTextArea.setText(jTextArea.getText()+"\nP: "+e2.attack());
				jTextArea.setText(jTextArea.getText()+"\nP: "+e2.attack());
				jTextArea.setText(jTextArea.getText()+"\nP: "+e2.attack());
				jTextArea.setText(jTextArea.getText()+"\nP: "+e2.attack());
				jTextArea.setText(jTextArea.getText()+"\nP: "+e2.attack());
				jTextArea.setText(jTextArea.getText()+"\nG: "+e1.attack());
			}
			else if(Bilans.bilans_atakow(e1, e2)==2) {
				jTextArea.setText(jTextArea.getText()+"\nP: "+e2.attack());
				jTextArea.setText(jTextArea.getText()+"\nP: "+e2.attack());
				jTextArea.setText(jTextArea.getText()+"\nP: "+e2.attack());
				jTextArea.setText(jTextArea.getText()+"\nP: "+e2.attack());
				jTextArea.setText(jTextArea.getText()+"\nG: "+e1.attack());
			}
			else if(Bilans.bilans_atakow(e1, e2)==3) {
				jTextArea.setText(jTextArea.getText()+"\nP: "+e2.attack());
				jTextArea.setText(jTextArea.getText()+"\nP: "+e2.attack());
				jTextArea.setText(jTextArea.getText()+"\nP: "+e2.attack());
				jTextArea.setText(jTextArea.getText()+"\nG: "+e1.attack());
			}
			else if(Bilans.bilans_atakow(e1, e2)==4) {
				jTextArea.setText(jTextArea.getText()+"\nP: "+e2.attack());
				jTextArea.setText(jTextArea.getText()+"\nP: "+e2.attack());
				jTextArea.setText(jTextArea.getText()+"\nG: "+e1.attack());
			}
			else if(Bilans.bilans_atakow(e1, e2)==5) {
				jTextArea.setText(jTextArea.getText()+"\nG: "+e1.attack());
				jTextArea.setText(jTextArea.getText()+"\nG: "+e1.attack());
				jTextArea.setText(jTextArea.getText()+"\nP: "+e2.attack());
			}
			else if(Bilans.bilans_atakow(e1, e2)==6) {
				jTextArea.setText(jTextArea.getText()+"\nG: "+e1.attack());
				jTextArea.setText(jTextArea.getText()+"\nG: "+e1.attack());
				jTextArea.setText(jTextArea.getText()+"\nG: "+e1.attack());
				jTextArea.setText(jTextArea.getText()+"\nP: "+e2.attack());
			}
			else if(Bilans.bilans_atakow(e1, e2)==7) {
				jTextArea.setText(jTextArea.getText()+"\nG: "+e1.attack());
				jTextArea.setText(jTextArea.getText()+"\nG: "+e1.attack());
				jTextArea.setText(jTextArea.getText()+"\nG: "+e1.attack());
				jTextArea.setText(jTextArea.getText()+"\nG: "+e1.attack());
				jTextArea.setText(jTextArea.getText()+"\nP: "+e2.attack());
			}
			else if(Bilans.bilans_atakow(e1, e2)==8) {
				jTextArea.setText(jTextArea.getText()+"\nG: "+e1.attack());
				jTextArea.setText(jTextArea.getText()+"\nG: "+e1.attack());
				jTextArea.setText(jTextArea.getText()+"\nG: "+e1.attack());
				jTextArea.setText(jTextArea.getText()+"\nG: "+e1.attack());
				jTextArea.setText(jTextArea.getText()+"\nG: "+e1.attack());
				jTextArea.setText(jTextArea.getText()+"\nP: "+e2.attack());
			}
			
			
		}
		
	}
}
