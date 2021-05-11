package models;

/*
 * Werasiri Supachaisiriruang 5810405363
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Lion extends Animal {
	private Color burlyWood, salmon, navajoWhite, sienna, oldLace;

	public Lion(int x, int y, Color color) {
		super(x, y, color);
		moveBehavior = new Swing(this);
		animalSound = "roar";
		time = randomLocation(1, 15);
		length = 0;
		burlyWood = new Color(222, 184, 135);
		salmon = new Color(250, 128, 114);
		navajoWhite = new Color(255, 222, 173);
		sienna = new Color(160, 82, 45);
		oldLace = new Color(253, 245, 230);
	}

	public void draw(Graphics2D g2) {
		drawBody(g2);
		drawLegs(g2);
		drawMane(g2);
		drawHead(g2);
		drawTail(g2);
		
		makeSound(g2);
		
		countTime();

	}

	public void drawHead(Graphics2D g2) {
		// face
		Rectangle face = new Rectangle(xLeft + 25, yTop + 30, 90, 55);
		Rectangle earLeft = new Rectangle(xLeft + 10, yTop + 15, 30, 30);
		Rectangle earRight = new Rectangle(xLeft + 100, yTop + 15, 30, 30);
		Rectangle nose = new Rectangle(xLeft + 65, yTop + 63, 7, 5);
		Rectangle muzzle = new Rectangle(xLeft + 50, yTop + 65, 40, 35);
		Rectangle blackEyeLeft = new Rectangle(xLeft + 40, yTop + 45, 20, 15);
		Rectangle whiteEyeLeft = new Rectangle(xLeft + 42, yTop + 50, 7, 5);
		Rectangle blackEyeRight = new Rectangle(xLeft + 80, yTop + 45, 20, 15);
		Rectangle whiteEyeRight = new Rectangle(xLeft + 90, yTop + 50, 7, 5);
		Rectangle mouth = new Rectangle(xLeft + 55, yTop + 80, 30, 15);
		Rectangle teeth = new Rectangle(xLeft + 60, yTop + 80, 3, 5);
		Rectangle teeth2 = new Rectangle(xLeft + 77, yTop + 80, 3, 5);
		Point2D.Double p1 = new Point2D.Double(xLeft + 69.5, yTop + 68);
		Point2D.Double p2 = new Point2D.Double(xLeft + 69.5, yTop + 80);
		Line2D.Double line = new Line2D.Double(p1, p2);
		
		g2.setColor(bodyColor);
		g2.draw(earLeft);
		g2.draw(earRight);
		g2.setColor(bodyColor);
		g2.fill(earLeft);
		g2.fill(earRight);
		g2.draw(face);
		g2.fill(face);
		g2.setColor(Color.black);
		g2.draw(blackEyeLeft);
		g2.fill(blackEyeLeft);
		g2.draw(blackEyeRight);
		g2.fill(blackEyeRight);
		g2.setColor(Color.white);
		g2.draw(whiteEyeLeft);
		g2.fill(whiteEyeLeft);
		g2.draw(whiteEyeRight);
		g2.fill(whiteEyeRight);
		g2.setColor(oldLace);
		g2.draw(muzzle);
		g2.fill(muzzle);
		
		g2.setColor(Color.black);
		g2.draw(nose);
		g2.fill(nose);
		g2.setColor(salmon);
		g2.draw(mouth);
		g2.fill(mouth);
		g2.setColor(Color.white);
		g2.draw(teeth);
		g2.fill(teeth);
		g2.draw(teeth2);
		g2.fill(teeth2);

		g2.setColor(Color.black);
		g2.draw(line);
	}

	public void drawMane(Graphics2D g2) {
		Rectangle mane = new Rectangle(xLeft, yTop, 140, 110);
		g2.setColor(navajoWhite);
		g2.draw(mane);
		g2.fill(mane);
	}

	public void makeSound(Graphics2D g2) {

		// sound
		Point2D.Double p5 = new Point2D.Double(xLeft - 10, yTop + 70);
		Point2D.Double p6 = new Point2D.Double(xLeft - 30, yTop + 60);
		Line2D.Double line5 = new Line2D.Double(p5, p6);
		Point2D.Double p7 = new Point2D.Double(xLeft - 10, yTop + 80);
		Point2D.Double p8 = new Point2D.Double(xLeft - 30, yTop + 90);
		Line2D.Double line6 = new Line2D.Double(p8, p7);
		
		if (count % time == 0) {
			g2.setColor(Color.black);
			g2.setFont(new Font("serif", Font.BOLD, 20));
			g2.drawString(animalSound, xLeft - 60, yTop + 80);
			g2.draw(line5);
			g2.draw(line6);
		}
	}

	public void drawLegs(Graphics2D g2) {
		Rectangle legLeft = new Rectangle(xLeft + 30, yTop + 100, 30, 50);
		Rectangle legRight = new Rectangle(xLeft + 80, yTop + 100, 30, 50);
		
		g2.setColor(bodyColor);
		g2.draw(legLeft);
		g2.fill(legLeft);
		g2.draw(legRight);
		g2.fill(legRight);
	}

	public void drawBody(Graphics2D g2) {
		// body
		Rectangle body = new Rectangle(xLeft + 40, yTop + 100, 50, 35);
		
		g2.setColor(bodyColor);
		g2.draw(body);
		g2.fill(body);
	}

	public void drawTail(Graphics2D g2){
		Rectangle tail = new Rectangle(xLeft + 100, yTop + 120, 50, 2);
		Rectangle tailBrush = new Rectangle(xLeft + 150, yTop + 115, 20, 15);
		g2.setColor(bodyColor);
		g2.draw(tail);
		g2.fill(tail);
		g2.setColor(bodyColor);
		g2.draw(tailBrush);
		g2.fill(tailBrush);
	}

}
