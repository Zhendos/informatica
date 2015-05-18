import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.applet.*;


public class Tutorial extends Applet implements MouseListener, ActionListener
{
	int xCoordinate;
	int yCoordinate;
	
	Button knopGroter;
	Button knopKleiner;
	int diameter;


	public void init()
	{
		
		setBackground(Color.black);
		diameter = 10;
		
		/**
		 *
		 *Knop groter maken.
		 */
		knopGroter = new Button("Groter");
		knopGroter.addActionListener(this);
		add(knopGroter);
		
		/**
		 *
		 *Knop kleiner maken.
		 */
		 knopKleiner = new Button("Kleiner");
		 knopKleiner.addActionListener(this);
		
		addMouseListener(this);

	}
	
	public void paint(Graphics g)
	{
		
		g.setColor(Color.white);
		g.drawString("X coordinate is: " + xCoordinate, 10, 10);
		g.drawString("Y coordinate is: " + yCoordinate, 10, 25);
		
		g.fillOval(100, 100, diameter, diameter);
	}

	@Override
	public void mouseClicked(MouseEvent me) 
	{
		xCoordinate = me.getX();
		yCoordinate = me.getY();
		
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent me) 
	{
		
	}

	@Override
	public void mouseExited(MouseEvent me) 
	{

	}

	@Override
	public void mousePressed(MouseEvent me) 
	{

		
	}

	@Override
	public void mouseReleased(MouseEvent me) 
	{
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == knop)
		{
			if(diameter <= 30)
			{
				diameter++;
				repaint();
			}
		}
	}
}
