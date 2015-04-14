/**
 * @(#)Tutorial.java
 *
 * Sample Applet application
 *
 * @author 
 * @version 1.00 15/04/08
 */
 
import java.awt.*;
import java.applet.*;

public class Tutorial extends Applet {
	
	public void init() {
	}

	public void paint(Graphics g) {
	//	g.drawLine(x1, y1, x2, y2);
		
		g.drawLine(200, 100, 50, 100);
		g.drawLine(200, 50, 50, 100);
		g.drawLine(200, 50, 200, 100);
	}
}
