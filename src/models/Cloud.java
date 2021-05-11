package models;
/*
 * Werasiri Supachaisiriruang 5810405363
 */
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class Cloud extends Animation{
	private int ranFirst,ranSecond,ranThird;

	public Cloud(int x, int y,Color color) {
		super(x,y,color);
	}
	public void setBodyColor(Color color){
		bodyColor = color;
	}

	public void draw(Graphics2D g2){
		if (count %10==0){
			ranFirst = randomLocation(-10,900);
			ranSecond = randomLocation(-10,900);
			ranThird = randomLocation(-10,900);
		}
		
		//First cloud
		Ellipse2D.Double bodyCloudFirst1 = new Ellipse2D.Double(xLeft+ranFirst,yTop+100,110,110);
		Ellipse2D.Double bodyCloudFirst2 = new Ellipse2D.Double(xLeft+ranFirst+10,yTop+130,280,100);
		Ellipse2D.Double bodyCloudFirst3 = new Ellipse2D.Double(xLeft+ranFirst+100,yTop+40,150,150);

		//Second cloud
		Ellipse2D.Double bodyCloudSecond1 = new Ellipse2D.Double(xLeft+ranSecond,yTop+20,110,110);
		Ellipse2D.Double bodyCloudSecond2 = new Ellipse2D.Double(xLeft+ranSecond+10,yTop+50,280,100);
		Ellipse2D.Double bodyCloudSecond3 = new Ellipse2D.Double(xLeft+ranSecond+100,yTop-40,150,150);

		//Third cloud
		Ellipse2D.Double bodyCloudThird1 = new Ellipse2D.Double(xLeft+ranThird,yTop+100,110,110);
		Ellipse2D.Double bodyCloudThird2 = new Ellipse2D.Double(xLeft+ranThird+10,yTop+130,280,100);
		Ellipse2D.Double bodyCloudThird3 = new Ellipse2D.Double(xLeft+ranThird+100,yTop+40,150,150);
	
		g2.setColor(bodyColor);
		g2.draw(bodyCloudFirst1);
		g2.fill(bodyCloudFirst1);	
		g2.draw(bodyCloudFirst2);
		g2.fill(bodyCloudFirst2);
		g2.draw(bodyCloudFirst3);
		g2.fill(bodyCloudFirst3);
		
		g2.draw(bodyCloudSecond1);
		g2.fill(bodyCloudSecond1);	
		g2.draw(bodyCloudSecond2);
		g2.fill(bodyCloudSecond2);
		g2.draw(bodyCloudSecond3);
		g2.fill(bodyCloudSecond3);
		
		g2.draw(bodyCloudThird1);
		g2.fill(bodyCloudThird1);	
		g2.draw(bodyCloudThird2);
		g2.fill(bodyCloudThird2);
		g2.draw(bodyCloudThird3);
		g2.fill(bodyCloudThird3);
		countTime();
	}

}
