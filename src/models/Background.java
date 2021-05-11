package models;
/*
 * Werasiri Supachaisiriruang 5810405363
 */
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class Background extends Animation{

	public Background(int x, int y,Color color) {
			super(x,y,color);
	}
	
	public void draw(Graphics2D g2){
		Color hettangian = new Color(78,179,211);
		Color paleGreen = new Color(144,238,144);
		Color green = new Color(191,230,207);
		GradientPaint skyGradient = new GradientPaint(xLeft+500,yTop, hettangian, xLeft+500,yTop+350,bodyColor);
		GradientPaint groundGradient = new GradientPaint(xLeft+500,yTop+350, paleGreen, xLeft+500,yTop+1000,green);
		Rectangle sky = new Rectangle(xLeft,yTop,1000,400);
		Rectangle ground = new Rectangle(xLeft,yTop+400,1000,700);
		Rectangle bush = new Rectangle(xLeft,yTop+350,1000,50);
		
		g2.setPaint(skyGradient);
		g2.draw(sky);
		g2.fill(sky);
		
		g2.setPaint(groundGradient);
		g2.draw(ground);
		g2.fill(ground);
		
		
		
	}
}
