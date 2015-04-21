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
		if(xCoordinate <= 300 && yCoordinate <= 300){
			g.drawString("de x is: " + xCoordinate, 10, 330);
			g.drawString("de y is: " + yCoordinate, 10, 350);
		}


		
		g.drawRect(10, 10, 300, 300); //hele speelveld.
		g.drawLine(100, 310, 100, 10); //linker verticale lijn.
		g.drawLine(200, 310, 200, 10); //middleste verticale lijn.
		
		g.drawLine(10, 100, 310, 100); //bovenste horizontale lijn.
		g.drawLine(10, 200, 310, 200); //middelste horizontale lijn.
	
		
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
