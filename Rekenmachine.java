/*
 * 
 * Hieronder staan alle imports die nodig zijn voor onze applet.
 * Deze imports laten de compiler weten welke bibliotheken we gebruiken.
 * 
 */

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Rekenmachine extends Applet implements ActionListener{
	/**
	 * 
	 * Hieronder maken we onze fields aan.
	 * Hier declareren we dus onze objecten.
	 * 
	 */
	TextField veldEen;
	TextField veldTwee;
	Button knop;
	TextField antwoord;
	
	public void init(){
		/**
		 * 
		 * Hieronder zie je een refentie. Refereren betekent "verwijzen" en dat doen we.
		 * We verwijzen naar de objecten die we hierboven hebben gedeclareerd.
		 * 
		 */
		veldEen = new TextField();
		veldTwee = new TextField();
		knop = new Button("klik hier");
		antwoord = new TextField();
		
		/**
		 * 
		 * Hieronder gaan we de knop interactief maken door een ActionListener toe te voegen.
		 * (this) geeft aan dat in deze class de ActionListener is en dat het in deze class gebeurd.
		 * 
		 */
		
		knop.addActionListener(this);
		
		/**
		 * 
		 * Hieronder gaan we al onze componenten toevoegen aan de applet.
		 * De volgorde waarin je add(component) doet maakt uit.
		 * Wat je als eerst doet komt links, en als laatst rechts.
		 * 
		 */
		
		add(veldEen);
		add(veldTwee);
		add(knop);
		add(antwoord);
		
		
	}
	
	
	public void paint(){
		
		
	}

	/**
	 * 
	 * De actionPerformed method ( wordt alleen aangeroepen als er op de knop gedrukt wordt )
	 * 
	 */
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		/**
		 * 
		 * Als de bron van de actie veroorzaakt wordt door de knop.
		 * 
		 */
		if(ae.getSource() == knop){
			/**
			 * 
			 * Hieronder maken we integers aan.
			 * We gaan de waardes uit de textvlakken halen ( veldEen & veldTwee ).
			 * 
			 */
			
			int getalEen = Integer.parseInt(veldEen.getText());
			int getalTwee = Integer.parseInt(veldTwee.getText());
			
			/**
			 * 
			 * Nu hebben we de twee getallen uit de textveld opgestagen in 2 integers.
			 * Nu kunnen we een berekening doen.
			 * 
			 */
			
			int hetAntwoord = getalEen * getalTwee;
			
			/**
			 * 
			 * Je kan ook in plaats van * ook +, / of - doen.
			 * Nu laten we het antwoord zien in het tekst vlak dat we antwoord noemde.
			 */
			
			antwoord.setText("" + hetAntwoord);
			
			/**
			 * 
			 * Hier is een foto van het eindresultaat
			 * http://i62.tinypic.com/28upnk1.jpg
			 * 
			 */
		}
		
	}

}
