package models;
/*
 * Werasiri Supachaisiriruang 5810405363
 */
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class Sun extends Animation{
	private Ellipse2D.Double sun;
	private int xLocation;
	public Sun(int x, int y, Color color) {
		super(x, y, color);
		xLocation = xLeft+randomLocation(100,800);
	}
	
	public void draw(Graphics2D g2) {
		Color tonian = new Color(254, 191, 78);
		sun = new Ellipse2D.Double(xLocation,yTop+50,200,200);
		GradientPaint redGradient = new GradientPaint(xLocation,yTop+180, bodyColor, xLocation+100,yTop,tonian);
		g2.setPaint(redGradient);
		g2.draw(sun);
		g2.fill(sun);

	}
	

}
