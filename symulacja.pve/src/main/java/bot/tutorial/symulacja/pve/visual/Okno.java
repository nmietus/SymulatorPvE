package bot.tutorial.symulacja.pve.visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bot.tutorial.symulacja.pve.classes.Enemy;
import bot.tutorial.symulacja.pve.classes.Fight;
import bot.tutorial.symulacja.pve.classes.Loadable;
import bot.tutorial.symulacja.pve.classes.Monster;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Okno extends JFrame 
{

	private JPanel contentPane;
	private JButton btnStart;
	private JTextArea textArea;
	private JScrollPane scrollPane;
	
	private ArrayList kontrolkiGracza;
	private ArrayList kontrolkiMoba;
	private ArrayList pochodneKontrolkiGracza;
	private ArrayList pochodneKontrolkiMoba;
	private ArrayList kontrolkiWspolne;
	private JTextField textAtakMoba;
	private JTextField textObronaMoba;
	private JTextField textTrafienieUnikMoba;
	private JTextField textHpMoba;
	private JTextField textSzybkoscMoba;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JSpinner spinnerLevelMoba;

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
		setBounds(100, 100, 903, 594);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnStart = new JButton("S Y M U L U J");
		btnStart.setBounds(149, 500, 572, 45);
		contentPane.add(btnStart);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(647, -28, 230, 368);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		
		JSpinner spinnerLevel = new JSpinner();
		spinnerLevel.setName("");
		spinnerLevel.setBounds(111, 26, 78, 20);
		contentPane.add(spinnerLevel);
		
		JLabel lblLevel = new JLabel("Level");
		lblLevel.setBounds(111, 11, 46, 14);
		contentPane.add(lblLevel);
		
		JSpinner spinnerHp = new JSpinner();
		spinnerHp.setName("");
		spinnerHp.setBounds(199, 26, 78, 20);
		contentPane.add(spinnerHp);
		
		JLabel labelHp = new JLabel("HP");
		labelHp.setBounds(199, 11, 46, 14);
		contentPane.add(labelHp);
		
		JSpinner spinner = new JSpinner();
		spinner.setName("");
		spinner.setBounds(111, 72, 78, 20);
		contentPane.add(spinner);
		
		JLabel lblSila = new JLabel("Siła");
		lblSila.setBounds(111, 57, 78, 14);
		contentPane.add(lblSila);
		
		JSpinner spinnerBron = new JSpinner();
		spinnerBron.setName("");
		spinnerBron.setBounds(23, 72, 78, 20);
		contentPane.add(spinnerBron);
		
		JLabel labelBron = new JLabel("Broń");
		labelBron.setBounds(23, 57, 78, 14);
		contentPane.add(labelBron);
		
		JSpinner spinnerZrecznosc = new JSpinner();
		spinnerZrecznosc.setName("");
		spinnerZrecznosc.setBounds(199, 72, 78, 20);
		contentPane.add(spinnerZrecznosc);
		
		JLabel lblZrecznosc = new JLabel("Zręczność");
		lblZrecznosc.setBounds(199, 57, 78, 14);
		contentPane.add(lblZrecznosc);
		
		JSpinner spinnerInteligencja = new JSpinner();
		spinnerInteligencja.setName("");
		spinnerInteligencja.setBounds(287, 72, 78, 20);
		contentPane.add(spinnerInteligencja);
		
		JLabel lblInteligencja = new JLabel("Inteligencja");
		lblInteligencja.setBounds(287, 57, 78, 14);
		contentPane.add(lblInteligencja);
		
		JSpinner spinnerObronaZEq = new JSpinner();
		spinnerObronaZEq.setName("");
		spinnerObronaZEq.setBounds(23, 109, 78, 20);
		contentPane.add(spinnerObronaZEq);
		
		JLabel lblObronaZEq = new JLabel("Obrona z eq");
		lblObronaZEq.setBounds(23, 94, 78, 14);
		contentPane.add(lblObronaZEq);
		
		JSpinner spinnerWytrzymalosc = new JSpinner();
		spinnerWytrzymalosc.setName("");
		spinnerWytrzymalosc.setBounds(111, 109, 78, 20);
		contentPane.add(spinnerWytrzymalosc);
		
		JLabel lblWytrzymalosc = new JLabel("Wytrzymałość");
		lblWytrzymalosc.setBounds(111, 94, 78, 14);
		contentPane.add(lblWytrzymalosc);
		
		JSpinner spinnerSilaWoli = new JSpinner();
		spinnerSilaWoli.setName("");
		spinnerSilaWoli.setBounds(199, 109, 78, 20);
		contentPane.add(spinnerSilaWoli);
		
		JLabel lblSilaWoli = new JLabel("Siła woli");
		lblSilaWoli.setBounds(199, 94, 78, 14);
		contentPane.add(lblSilaWoli);
		
		JSpinner spinnerSzybkosc = new JSpinner();
		spinnerSzybkosc.setName("");
		spinnerSzybkosc.setBounds(287, 109, 78, 20);
		contentPane.add(spinnerSzybkosc);
		
		JLabel lblSzybkosc = new JLabel("Szybkość");
		lblSzybkosc.setBounds(287, 94, 78, 14);
		contentPane.add(lblSzybkosc);
		
		JSpinner spinnerUb = new JSpinner();
		spinnerUb.setName("");
		spinnerUb.setBounds(111, 148, 78, 20);
		contentPane.add(spinnerUb);
		
		JLabel lblUb = new JLabel("Um. bojowa");
		lblUb.setBounds(111, 133, 78, 14);
		contentPane.add(lblUb);
		
		JSpinner spinnerSzybkoscZEq = new JSpinner();
		spinnerSzybkoscZEq.setName("");
		spinnerSzybkoscZEq.setBounds(23, 148, 78, 20);
		contentPane.add(spinnerSzybkoscZEq);
		
		JLabel lblSzybkoscZEq = new JLabel("Szybkość z eq");
		lblSzybkoscZEq.setBounds(23, 133, 78, 14);
		contentPane.add(lblSzybkoscZEq);
		
		JSpinner spinnerUnik = new JSpinner();
		spinnerUnik.setName("");
		spinnerUnik.setBounds(199, 148, 78, 20);
		contentPane.add(spinnerUnik);
		
		JLabel lblUnik = new JLabel("Unik");
		lblUnik.setBounds(199, 133, 78, 14);
		contentPane.add(lblUnik);
		
		JSpinner spinnerKaraDoUniku = new JSpinner();
		spinnerKaraDoUniku.setName("");
		spinnerKaraDoUniku.setBounds(287, 148, 78, 20);
		contentPane.add(spinnerKaraDoUniku);
		
		JLabel lblKaraDoUniku = new JLabel("Kara do uniku");
		lblKaraDoUniku.setBounds(287, 133, 78, 14);
		contentPane.add(lblKaraDoUniku);
		
		JSpinner spinnerUnikZEq = new JSpinner();
		spinnerUnikZEq.setName("");
		spinnerUnikZEq.setBounds(23, 185, 78, 20);
		contentPane.add(spinnerUnikZEq);
		
		JLabel lblUnikZEq = new JLabel("Unik z eq");
		lblUnikZEq.setBounds(23, 170, 78, 14);
		contentPane.add(lblUnikZEq);
		
		JSpinner spinnerWampiryzm = new JSpinner();
		spinnerWampiryzm.setAutoscrolls(true);
		spinnerWampiryzm.setName("");
		spinnerWampiryzm.setBounds(111, 185, 78, 20);
		contentPane.add(spinnerWampiryzm);
		
		JLabel lblWampiryzm = new JLabel("Wampiryzm");
		lblWampiryzm.setBounds(111, 170, 78, 14);
		contentPane.add(lblWampiryzm);
		
		JSpinner spinnerZlodziejstwo = new JSpinner();
		spinnerZlodziejstwo.setName("");
		spinnerZlodziejstwo.setBounds(199, 185, 78, 20);
		contentPane.add(spinnerZlodziejstwo);
		
		JLabel lblZlodziejstwo = new JLabel("Złodziejstwo");
		lblZlodziejstwo.setBounds(199, 170, 78, 14);
		contentPane.add(lblZlodziejstwo);
		
		spinnerLevelMoba = new JSpinner();
		spinnerLevelMoba.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				
				//TODO
				Enemy m = new Monster();
				m.load(m, (Integer)spinnerLevelMoba.getValue());
				
				textAtakMoba.setText(m.getDmg()+"");
				textObronaMoba.setText(m.getObrona()+"");
				textTrafienieUnikMoba.setText(m.getZrecznosc()+"");
				textHpMoba.setText(m.getHp()+"");
				textSzybkoscMoba.setText(m.getSzybkosc()+"");
				
			}
		});
		spinnerLevelMoba.setModel(new SpinnerNumberModel(0, 0, 1000, 1));
		spinnerLevelMoba.setName("");
		spinnerLevelMoba.setBounds(23, 301, 78, 20);
		contentPane.add(spinnerLevelMoba);
		
		JLabel lblLevelMoba = new JLabel("Level moba");
		lblLevelMoba.setBounds(23, 286, 78, 14);
		contentPane.add(lblLevelMoba);
		
		textAtakMoba = new JTextField();
		textAtakMoba.setEditable(false);
		textAtakMoba.setHorizontalAlignment(SwingConstants.RIGHT);
		textAtakMoba.setText("0");
		textAtakMoba.setBounds(111, 301, 78, 20);
		contentPane.add(textAtakMoba);
		textAtakMoba.setColumns(10);
		
		JLabel lblAtakMoba = new JLabel("Atak moba");
		lblAtakMoba.setBounds(111, 286, 78, 14);
		contentPane.add(lblAtakMoba);
		
		textObronaMoba = new JTextField();
		textObronaMoba.setEditable(false);
		textObronaMoba.setText("0");
		textObronaMoba.setHorizontalAlignment(SwingConstants.RIGHT);
		textObronaMoba.setColumns(10);
		textObronaMoba.setBounds(111, 341, 78, 20);
		contentPane.add(textObronaMoba);
		
		JLabel lblObronaMoba = new JLabel("Obrona moba");
		lblObronaMoba.setBounds(111, 326, 78, 14);
		contentPane.add(lblObronaMoba);
		
		textTrafienieUnikMoba = new JTextField();
		textTrafienieUnikMoba.setEditable(false);
		textTrafienieUnikMoba.setText("0");
		textTrafienieUnikMoba.setHorizontalAlignment(SwingConstants.RIGHT);
		textTrafienieUnikMoba.setColumns(10);
		textTrafienieUnikMoba.setBounds(111, 382, 78, 20);
		contentPane.add(textTrafienieUnikMoba);
		
		JLabel lblTrafienieUnikMoba = new JLabel("Trafienie/unik");
		lblTrafienieUnikMoba.setBounds(111, 367, 78, 14);
		contentPane.add(lblTrafienieUnikMoba);
		
		textHpMoba = new JTextField();
		textHpMoba.setEditable(false);
		textHpMoba.setText("0");
		textHpMoba.setHorizontalAlignment(SwingConstants.RIGHT);
		textHpMoba.setColumns(10);
		textHpMoba.setBounds(111, 463, 78, 20);
		contentPane.add(textHpMoba);
		
		JLabel lblHpMoba = new JLabel("HP moba");
		lblHpMoba.setBounds(111, 448, 78, 14);
		contentPane.add(lblHpMoba);
		
		textSzybkoscMoba = new JTextField();
		textSzybkoscMoba.setEditable(false);
		textSzybkoscMoba.setText("0");
		textSzybkoscMoba.setHorizontalAlignment(SwingConstants.RIGHT);
		textSzybkoscMoba.setColumns(10);
		textSzybkoscMoba.setBounds(111, 422, 78, 20);
		contentPane.add(textSzybkoscMoba);
		
		JLabel lblSzybkoscMoba = new JLabel("Szybkosc moba");
		lblSzybkoscMoba.setBounds(111, 407, 78, 14);
		contentPane.add(lblSzybkoscMoba);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(287, 301, 78, 20);
		contentPane.add(textField);
		
		JLabel lblMinDmgMoba = new JLabel("Min dmg moba");
		lblMinDmgMoba.setBounds(287, 286, 78, 14);
		contentPane.add(lblMinDmgMoba);
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(287, 341, 78, 20);
		contentPane.add(textField_1);
		
		JLabel lblMinAtakGracza = new JLabel("Min atak gracza");
		lblMinAtakGracza.setBounds(287, 326, 78, 14);
		contentPane.add(lblMinAtakGracza);
		
		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(287, 382, 78, 20);
		contentPane.add(textField_2);
		
		JLabel lblTrafienieGracza = new JLabel("Szansa trafienia gracza");
		lblTrafienieGracza.setBounds(253, 367, 112, 14);
		contentPane.add(lblTrafienieGracza);
		
		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(287, 463, 78, 20);
		contentPane.add(textField_3);
		
		JLabel lblMax = new JLabel("Max *1.1");
		lblMax.setBounds(287, 448, 78, 14);
		contentPane.add(lblMax);
		
		textField_4 = new JTextField();
		textField_4.setText("0");
		textField_4.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(287, 422, 78, 20);
		contentPane.add(textField_4);
		
		JLabel lblMin = new JLabel("Min *1.1");
		lblMin.setBounds(287, 407, 78, 14);
		contentPane.add(lblMin);
		
		textField_5 = new JTextField();
		textField_5.setText("0");
		textField_5.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(392, 301, 78, 20);
		contentPane.add(textField_5);
		
		JLabel lblMaxDmgMoba = new JLabel("Max dmg moba");
		lblMaxDmgMoba.setBounds(392, 286, 78, 14);
		contentPane.add(lblMaxDmgMoba);
		
		textField_6 = new JTextField();
		textField_6.setText("0");
		textField_6.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(392, 341, 78, 20);
		contentPane.add(textField_6);
		
		JLabel lblMaxAtakGracza = new JLabel("Max atak gracza");
		lblMaxAtakGracza.setBounds(391, 326, 79, 14);
		contentPane.add(lblMaxAtakGracza);
		
		textField_7 = new JTextField();
		textField_7.setText("0");
		textField_7.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(392, 382, 78, 20);
		contentPane.add(textField_7);
		
		JLabel lblSzansaUnikuGracza = new JLabel("Szansa uniku gracza");
		lblSzansaUnikuGracza.setBounds(373, 367, 97, 14);
		contentPane.add(lblSzansaUnikuGracza);
		
		textField_8 = new JTextField();
		textField_8.setText("0");
		textField_8.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(392, 463, 78, 20);
		contentPane.add(textField_8);
		
		JLabel lblMax_1 = new JLabel("Max *1.15");
		lblMax_1.setBounds(392, 448, 78, 14);
		contentPane.add(lblMax_1);
		
		textField_9 = new JTextField();
		textField_9.setText("0");
		textField_9.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(392, 422, 78, 20);
		contentPane.add(textField_9);
		
		JLabel lblMin_1 = new JLabel("Min *1.15");
		lblMin_1.setBounds(392, 407, 78, 14);
		contentPane.add(lblMin_1);
		
		textField_10 = new JTextField();
		textField_10.setText("0");
		textField_10.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(494, 463, 78, 20);
		contentPane.add(textField_10);
		
		JLabel lblMax_2 = new JLabel("Max *1.2");
		lblMax_2.setBounds(494, 448, 78, 14);
		contentPane.add(lblMax_2);
		
		textField_11 = new JTextField();
		textField_11.setText("0");
		textField_11.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(494, 422, 78, 20);
		contentPane.add(textField_11);
		
		JLabel lblMin_2 = new JLabel("Min *1.2");
		lblMin_2.setBounds(494, 407, 78, 14);
		contentPane.add(lblMin_2);
		
		textField_12 = new JTextField();
		textField_12.setText("0");
		textField_12.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(591, 463, 78, 20);
		contentPane.add(textField_12);
		
		JLabel lblMax_3 = new JLabel("Max *1.3");
		lblMax_3.setBounds(591, 448, 78, 14);
		contentPane.add(lblMax_3);
		
		textField_13 = new JTextField();
		textField_13.setText("0");
		textField_13.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(591, 422, 78, 20);
		contentPane.add(textField_13);
		
		JLabel lblMin_3 = new JLabel("Min *1.3");
		lblMin_3.setBounds(591, 407, 78, 14);
		contentPane.add(lblMin_3);
		
		textField_14 = new JTextField();
		textField_14.setText("0");
		textField_14.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(689, 463, 78, 20);
		contentPane.add(textField_14);
		
		JLabel lblMax_4 = new JLabel("Max *1.4");
		lblMax_4.setBounds(689, 448, 78, 14);
		contentPane.add(lblMax_4);
		
		textField_15 = new JTextField();
		textField_15.setText("0");
		textField_15.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(689, 422, 78, 20);
		contentPane.add(textField_15);
		
		JLabel lblMin_4 = new JLabel("Min *1.4");
		lblMin_4.setBounds(689, 407, 78, 14);
		contentPane.add(lblMin_4);
		
		textField_16 = new JTextField();
		textField_16.setText("0");
		textField_16.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBounds(786, 463, 78, 20);
		contentPane.add(textField_16);
		
		JLabel lblMax_5 = new JLabel("Max *1.5");
		lblMax_5.setBounds(786, 448, 78, 14);
		contentPane.add(lblMax_5);
		
		textField_17 = new JTextField();
		textField_17.setText("0");
		textField_17.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBounds(786, 422, 78, 20);
		contentPane.add(textField_17);
		
		JLabel lblMin_5 = new JLabel("Min *1.5");
		lblMin_5.setBounds(786, 407, 78, 14);
		contentPane.add(lblMin_5);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setName("");
		spinner_1.setBounds(559, 15, 78, 20);
		contentPane.add(spinner_1);
		
		JLabel lblLiczbaSymulacji = new JLabel("Liczba symulacji");
		lblLiczbaSymulacji.setBounds(559, 0, 78, 14);
		contentPane.add(lblLiczbaSymulacji);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setName("");
		spinner_2.setBounds(559, 52, 78, 20);
		contentPane.add(spinner_2);
		
		JLabel lblWalkiPodRzd = new JLabel("Walki pod rząd");
		lblWalkiPodRzd.setBounds(559, 37, 78, 14);
		contentPane.add(lblWalkiPodRzd);
		
		JLabel lblStaaUniku = new JLabel("Stała uniku");
		lblStaaUniku.setBounds(519, 367, 53, 14);
		contentPane.add(lblStaaUniku);
		
		textField_18 = new JTextField();
		textField_18.setText("0");
		textField_18.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBounds(494, 382, 78, 20);
		contentPane.add(textField_18);
		
		JLabel lblSzansaNaTk = new JLabel("Szansa na TK");
		lblSzansaNaTk.setBounds(605, 367, 64, 14);
		contentPane.add(lblSzansaNaTk);
		
		textField_19 = new JTextField();
		textField_19.setText("0");
		textField_19.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBounds(591, 382, 78, 20);
		contentPane.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setText("0");
		textField_20.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBounds(559, 109, 78, 20);
		contentPane.add(textField_20);
		
		JLabel lblredniaUb = new JLabel("Średnia UB");
		lblredniaUb.setBounds(559, 94, 78, 14);
		contentPane.add(lblredniaUb);
		
		textField_21 = new JTextField();
		textField_21.setText("0");
		textField_21.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBounds(559, 149, 78, 20);
		contentPane.add(textField_21);
		
		JLabel lblredniUnik = new JLabel("Średni unik");
		lblredniUnik.setBounds(558, 134, 79, 14);
		contentPane.add(lblredniUnik);
		
		textField_22 = new JTextField();
		textField_22.setText("0");
		textField_22.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBounds(559, 190, 78, 20);
		contentPane.add(textField_22);
		
		JLabel lblredniKosztPoziomu = new JLabel("Średni koszt poziomu");
		lblredniKosztPoziomu.setBounds(537, 175, 100, 14);
		contentPane.add(lblredniKosztPoziomu);
		
//		JSpinner []spinner = new JSpinner[30];
//		
//		for(int i=0; i<30; i++) {
//			spinner[i] = new JSpinner();
//			spinner[i].setModel(new SpinnerNumberModel(new Double(0), new Double(0), null, new Double(1)));
//			spinner[i].setBounds((int) (10+100*Math.floor(i/7)), 25+40*(i%7), 84, 20);
//			contentPane.add(spinner[i]);
//		}
		
		kontrolkiGracza = new ArrayList<JSpinner>();
		kontrolkiMoba = new ArrayList<JSpinner>();
		pochodneKontrolkiGracza = new ArrayList<JSpinner>();
		pochodneKontrolkiMoba = new ArrayList<JSpinner>();
		kontrolkiWspolne = new ArrayList<JSpinner>();
		
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
