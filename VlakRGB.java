import java.awt.*;
import java.applet.*;


public class tekenen extends Applet 
	{
	public void init(){
		setBackground(Color.black);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(new Color(153, 102, 51));
		g.fillRect(10, 10, 15, 200);
		g.setColor(new Color(239, 12, 12));
		g.fillRect(26, 10, 100, 35);
		g.setColor(new Color(240, 240, 240));
		g.fillRect(26, 46, 100, 35);
		g.setColor(new Color(51, 0, 204));
		g.fillRect(26, 82, 100, 35);
	}

}
