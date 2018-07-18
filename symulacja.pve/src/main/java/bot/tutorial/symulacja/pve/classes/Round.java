package bot.tutorial.symulacja.pve.classes;

import javax.swing.JTextArea;

public class Round {

	public static void Runda(Enemy e1, Enemy e2, JTextArea jTextArea, Results wyniki) 
	{
		
		switch(Bilans.bilans_atakow(e1, e2))
		{
		
		case 1:
			for(int i=0; i<5 && e1.getHp()>0 && e2.getHp()>0; i++)
			{
				PerformAttack.wykonajAtakMoba(e1, e2, jTextArea, wyniki);
				if(e1.getHp()<=0) wyniki.setPrzegrane(wyniki.getPrzegrane()+1);
			}
			
			if(e1.getHp()<0 || e2.getHp()<0) break;
				
				PerformAttack.wykonajAtakGracza(e1, e2, jTextArea, wyniki);
				if(e2.getHp()<=0) wyniki.setWygrane(wyniki.getWygrane()+1);
		break;
		
		case 2:
			for(int i=0; i<4 && e1.getHp()>0 && e2.getHp()>0; i++)
			{
				PerformAttack.wykonajAtakMoba(e1, e2, jTextArea, wyniki);
				if(e1.getHp()<=0) wyniki.setPrzegrane(wyniki.getPrzegrane()+1);
			}
			
			if(e1.getHp()<0 || e2.getHp()<0) break;
				PerformAttack.wykonajAtakGracza(e1, e2, jTextArea, wyniki);
				if(e2.getHp()<=0) wyniki.setWygrane(wyniki.getWygrane()+1);
			break;
			
		case 3:
			for(int i=0; i<3 && e1.getHp()>0 && e2.getHp()>0; i++)
			{
				PerformAttack.wykonajAtakMoba(e1, e2, jTextArea, wyniki);
				if(e1.getHp()<=0) wyniki.setPrzegrane(wyniki.getPrzegrane()+1);
			}
			
			if(e1.getHp()<0 || e2.getHp()<0) break;
				PerformAttack.wykonajAtakGracza(e1, e2, jTextArea, wyniki);
				if(e2.getHp()<=0) wyniki.setWygrane(wyniki.getWygrane()+1);
			break;
			
			case 4:
				for(int i=0; i<2 && e1.getHp()>0 && e2.getHp()>0; i++)
				{
					PerformAttack.wykonajAtakMoba(e1, e2, jTextArea, wyniki);
					if(e1.getHp()<=0) wyniki.setPrzegrane(wyniki.getPrzegrane()+1);
				}
				
				if(e1.getHp()<0 || e2.getHp()<0) break;
					PerformAttack.wykonajAtakGracza(e1, e2, jTextArea, wyniki);
					if(e2.getHp()<=0) wyniki.setWygrane(wyniki.getWygrane()+1);
			break;
			
			case 5:
				for(int i=0; i<2 && e1.getHp()>0 && e2.getHp()>0; i++)
				{
					PerformAttack.wykonajAtakGracza(e1, e2, jTextArea, wyniki);
					if(e2.getHp()<=0) wyniki.setWygrane(wyniki.getWygrane()+1);
				}
				
				if(e1.getHp()<0 || e2.getHp()<0) break;
					PerformAttack.wykonajAtakMoba(e1, e2, jTextArea, wyniki);
					if(e1.getHp()<=0) wyniki.setPrzegrane(wyniki.getPrzegrane()+1);
			break;
			
			case 6:
				for(int i=0; i<3 && e1.getHp()>0 && e2.getHp()>0; i++)
				{
					PerformAttack.wykonajAtakGracza(e1, e2, jTextArea, wyniki);
					if(e2.getHp()<=0) wyniki.setWygrane(wyniki.getWygrane()+1);
				}
				
				if(e1.getHp()<0 || e2.getHp()<0) break;
					PerformAttack.wykonajAtakMoba(e1, e2, jTextArea, wyniki);
					if(e1.getHp()<=0) wyniki.setPrzegrane(wyniki.getPrzegrane()+1);
			break;
			
			case 7:
				for(int i=0; i<4 && e1.getHp()>0 && e2.getHp()>0; i++)
				{
					PerformAttack.wykonajAtakGracza(e1, e2, jTextArea, wyniki);
					if(e2.getHp()<=0) wyniki.setWygrane(wyniki.getWygrane()+1);
				}
				
				if(e1.getHp()<0 || e2.getHp()<0) break;
					PerformAttack.wykonajAtakMoba(e1, e2, jTextArea, wyniki);
					if(e1.getHp()<=0) wyniki.setPrzegrane(wyniki.getPrzegrane()+1);
			break;
			
			case 8:
				for(int i=0; i<5 && e1.getHp()>0 && e2.getHp()>0; i++)
				{
					PerformAttack.wykonajAtakGracza(e1, e2, jTextArea, wyniki);
					if(e2.getHp()<=0) wyniki.setWygrane(wyniki.getWygrane()+1);
				}
				
				if(e1.getHp()<0 || e2.getHp()<0) break;
					PerformAttack.wykonajAtakMoba(e1, e2, jTextArea, wyniki);
					if(e1.getHp()<=0) wyniki.setPrzegrane(wyniki.getPrzegrane()+1);
			break;
			
			default:
				jTextArea.setText(jTextArea.getText()+"\n ERROR");
		
		}
	
	}
}
