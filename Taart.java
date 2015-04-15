import java.awt.*;
import java.applet.*;

import javax.swing.JFrame;


public class tekenen extends Applet 
{
	
	public void init()
	{
		setBackground(Color.black);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillArc(100, 100, 100, 100, 0, 120);
		g.setColor(Color.WHITE);
		g.fillArc(100, 100, 100, 100, 120, 120);
		g.setColor(Color.BLUE);
		g.fillArc(100, 100, 100, 100, 240, 120);
	}

}
