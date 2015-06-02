import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class Tutorial extends Applet implements ActionListener 
{
	TextField nummerEen;
	TextField nummerTwee;
	Button button;
	TextField antwoord;
	
	
	public void init()
	{
		setBackground(Color.black);
		nummerEen = new TextField();
		nummerTwee = new TextField();
		button = new Button("Calculate");
		antwoord = new TextField();
		
		add(nummerEen);
		add(nummerTwee);
		
		button.addActionListener(this);
		add(button);
		
		add(antwoord);
		
		
	}
	
	public void paint(Graphics g)
	{
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		int numOne = Integer.parseInt(nummerEen.getText());
		System.out.println("Het eerste getal is " + numOne);
		
		int numTwo = Integer.parseInt(nummerTwee.getText());
		System.out.println("Het tweede getal is " + numTwo);
		
		int answer = numOne * numTwo;
		System.out.println("Het antwoord is " + answer);
		
		antwoord.setText("" + answer);
		
	
		
	}
	
	
	
	
}
