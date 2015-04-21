import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.applet.*;


public class tekenen extends Applet implements MouseListener
{
	int xCoordinate;
	int yCoordinate;

	public void init()
	{
		setBackground(Color.black);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.white);
		g.drawString("de x is: " + xCoordinate, 10, 10);
		g.drawString("de y is: " + yCoordinate, 10, 30);
		
		g.drawLine(10, 100, 10, 500); //y-as.
		g.drawLine(10, 500, 500, 500); //x-as.
		
		g.setColor(Color.PINK);
		
		g.drawRect(40, 373, 30, 127); //Charlotte haar staaf.
		g.drawString("Charlotte", 30, 520); //charlotte haar naam.
		
		g.setColor(Color.blue);
		
		g.drawRect(120, 355, 30, 145); // Welmer haar staaf.
		g.drawString("Welmer", 115, 520);//Welmer zijn naam.

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
