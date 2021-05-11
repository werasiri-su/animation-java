package models;
/*
 * Werasiri Supachaisiriruang 5810405363
 */
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class Bush extends Animation{

	public Bush(int x, int y,Color color) {
		super(x,y,color);
	}
	public void draw(Graphics2D g2){
		Color coniacian = new Color(204,233,104);
		Color berriasian = new Color(140,205,96);
		Rectangle basebush = new Rectangle(xLeft,yTop+350,1000,50);
		Ellipse2D.Double partOfBush1 = new Ellipse2D.Double(xLeft-25,yTop+800,150,150);
		Ellipse2D.Double partOfBush2 = new Ellipse2D.Double(xLeft+20,yTop+820,70,70);
		Ellipse2D.Double partOfBush3 = new Ellipse2D.Double(xLeft+60,yTop+770,150,150);
		Ellipse2D.Double partOfBush4 = new Ellipse2D.Double(xLeft+150,yTop+810,130,130);
		Ellipse2D.Double partOfBush5 = new Ellipse2D.Double(xLeft+250,yTop+800,100,100);
		Ellipse2D.Double partOfBush6 = new Ellipse2D.Double(xLeft+310,yTop+790,120,120);
		Ellipse2D.Double partOfBush7 = new Ellipse2D.Double(xLeft+400,yTop+750,200,200);
		GradientPaint greenGradient = new GradientPaint(xLeft,yTop+800, bodyColor, xLeft+1000,yTop+1000,coniacian);
		
		g2.setPaint(greenGradient);
		g2.draw(partOfBush1);
		g2.fill(partOfBush1);
		g2.draw(partOfBush2);
		g2.fill(partOfBush2);
		g2.draw(partOfBush3);
		g2.fill(partOfBush3);
		g2.draw(partOfBush4);
		g2.fill(partOfBush4);
		g2.draw(partOfBush5);
		g2.fill(partOfBush5);
		g2.draw(partOfBush6);
		g2.fill(partOfBush6);
		g2.draw(partOfBush7);
		g2.fill(partOfBush7);
		
		}
}
