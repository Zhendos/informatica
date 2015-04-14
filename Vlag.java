import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class tekenen extends Applet {
	public void init(){
		
	}
	
	public void paint(Graphics g){
		g.setColor(Color.BLUE);
		g.drawRect(10, 10, 15, 200);
		g.drawRect(25, 10, 70, 60);
	}

}
