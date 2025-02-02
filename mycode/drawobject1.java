package mycode;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class drawobject1 extends Applet{
	public  void paint(Graphics g) {
		g.drawString("Hello World",20,20);
		g.drawRect(40,40,30,50);
		g.drawRect(90, 90, 60, 60);
		
		g.drawOval(200, 150, 280, 280);
		g.setColor(Color.YELLOW);
		g.fillOval(200,150,280,280);
		g.drawOval(200, 150, 280, 280);
		g.setColor(Color.BLACK);
		g.fillOval(270, 230, 30, 30);
		g.fillOval(400, 230, 30, 30);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("Draw Object using swing applet");
		drawobject1 applet = new drawobject1();
		f.add(applet);
		
				
		f.setSize(600,600);
		f.setVisible(true);

	}

}
