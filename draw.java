import java.applet.*;
import java.awt.*;
public class draw extends Applet{
		public void paint (Graphics g)
		{			
			setSize(500,500);
			
			
			for(int i = 0; i < 5; i++){
				
				g.setColor(Color.green);
				g.fillRect(200, 200, 120, 120);
				g.fillArc(200, 150, 120, 80, 0, 180); 
				g.drawLine(240, 165, 220,120);
				g.drawLine(270, 165, 290, 120);
				g.fillRoundRect(210, 310, 30, 60, 20, 20);
				g.fillRoundRect(280, 310, 30, 60, 20, 20);
				g.fillRoundRect(160, 200, 30, 80, 20, 20);
				g.fillRoundRect(330, 200, 30, 80, 20, 20);
				g.setColor(Color.white);
				g.fillOval(225, 165, 10, 10);
				g.fillOval(275, 165, 10, 10);
				g.setColor(Color.black);
				g.setFont(new Font("Calibri", Font.BOLD, 30));
				g.drawString("ANDROID", 180, 400);
				Thread.sleep(1000);
				
				
			}
			
			g.fillOval(0, 0, 500, 500);
	
		}
	}

