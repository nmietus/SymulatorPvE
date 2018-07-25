package bot.tutorial.symulacja.pve.visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bot.tutorial.symulacja.pve.classes.Fight;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTable;

public class Okno extends JFrame 
{

	private JPanel contentPane;
	private JButton btnStart;
	private JTextArea textArea;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Okno frame = new Okno();
					frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Okno() 
	{
		createControls();
		createEvents();
	}
	
	//tworzy obiekty klasy wizualnej
	private void createControls() 
	{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnStart = new JButton("S Y M U L U J");
		btnStart.setBounds(152, 403, 333, 45);
		contentPane.add(btnStart);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(579, 11, 197, 408);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		
		JSpinner []spinner = new JSpinner[30];
		
		for(int i=0; i<30; i++) {
			spinner[i] = new JSpinner();
			spinner[i].setModel(new SpinnerNumberModel(new Double(0), new Double(0), null, new Double(1)));
			spinner[i].setBounds((int) (10+100*Math.floor(i/7)), 25+40*(i%7), 84, 20);
			contentPane.add(spinner[i]);
		}
		

		
	}
	
	//tworzy zdarzenia
	private void createEvents() 
	{
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Fight fight = new Fight();
				fight.walka(24, textArea);
			}
		});
		
	}
}
