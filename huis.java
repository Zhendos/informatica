import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.applet.*;


public class tekenen extends Applet implements MouseListener
{
	
	int[] xPoint = {50, 100, 150}; //eerst de 3 x punten van het dak.
	int[] yPoint = {100, 50, 100}; //eerst de 3 y punten van het dak.
	
	int xCoordinate;
	int yCoordinate;
	
	String s;
	
	public void init()
	{
		setBackground(Color.black);
	}
	
	public void paint(Graphics g)
	{
		
			g.setColor(Color.WHITE);
			g.drawString("x is " + xCoordinate , 10, 10);
			g.drawString("Y is " + yCoordinate, 10, 25);
			
			g.drawString("Text: " + s, 10, 50);
				
			g.setColor(new Color(245, 223, 116));
			g.drawRect(50, 100, 100, 100);
			g.drawPolygon(xPoint, yPoint, 3); //3 geeft het aantal punten weer.
			
			g.drawRect(50, 150, 30, 50); //deur
			
			addMouseListener(this);
	
	}

	@Override
	public void mouseClicked(MouseEvent me) {
		xCoordinate = me.getX();
		yCoordinate = me.getY();
		repaint();
		
	}

	@Override
	public void mouseEntered(MouseEvent me) {
		
	}

	@Override
	public void mouseExited(MouseEvent me) {

	}

	@Override
	public void mousePressed(MouseEvent me) {

		
	}

	@Override
	public void mouseReleased(MouseEvent me) {

		
	}
}
