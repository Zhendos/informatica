import java.awt.*;
import java.applet.*;


public class tekenen extends Applet 
	{
	public void init(){
		setBackground(Color.black);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.GREEN);
		g.drawRect(10, 10, 15, 200);
		g.setColor(Color.RED);
		g.drawRect(26, 10, 100, 35);
		g.setColor(Color.white);
		g.drawRect(26, 46, 100, 35);
		g.setColor(Color.blue);
		g.drawRect(26, 82, 100, 35);
	}

}

}
