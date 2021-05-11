package models;

/*
 * Werasiri Supachaisiriruang 5810405363
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Tiger extends Animal {
	private Color gainsboro, teal;

	public Tiger(int x, int y, Color color) {
		super(x, y, color);
		animalSound = "growl";
		length = 180;
		moveBehavior = new MoveAround(this);
		time = randomLocation(1, 15);
		direction = "left";
		gainsboro = new Color(220, 220, 220);
		teal = new Color(0, 128, 128);
	}

	public void draw(Graphics2D g2) {
		drawLegs(g2);
		drawBody(g2);
		drawHead(g2);
		drawTail(g2);
		makeSound(g2);
		countTime();

	}

	public void drawTail(Graphics2D g2) {
		Rectangle tail = new Rectangle(xLeft + 160, yTop + 100, 30, 15);

		g2.setStroke(new BasicStroke(0));
		g2.setColor(Color.BLACK);
		g2.draw(tail);
		g2.setColor(bodyColor);
		g2.fill(tail);
	}

	public void drawHead(Graphics2D g2) {
		// face
		Rectangle face = new Rectangle(xLeft, yTop, 100, 100);
		Rectangle ear1 = new Rectangle(xLeft + 60, yTop - 10, 40, 40);
		Rectangle ear2 = new Rectangle(xLeft + 40, yTop - 20, 60, 10);
		Rectangle nose = new Rectangle(xLeft - 10, yTop + 50, 8, 8);

		Rectangle forehead1 = new Rectangle(xLeft, yTop, 7, 30);
		Rectangle forehead2 = new Rectangle(xLeft, yTop + 5, 20, 5);
		Rectangle forehead3 = new Rectangle(xLeft, yTop + 15, 15, 5);
		Rectangle eye1 = new Rectangle(xLeft + 15, yTop + 25, 20, 15);
		Rectangle eye2 = new Rectangle(xLeft + 17, yTop + 35, 4, 2);
		Rectangle eye3 = new Rectangle(xLeft + 27, yTop + 28, 5, 5);
		Rectangle whisker1 = new Rectangle(xLeft + 5, yTop + 65, 40, 3);
		Rectangle whisker2 = new Rectangle(xLeft + 5, yTop + 75, 40, 3);
		Rectangle whisker3 = new Rectangle(xLeft + 5, yTop + 85, 40, 3);
		Rectangle mouth = new Rectangle(xLeft - 10, yTop + 50, 40, 50);

		g2.setColor(Color.black);
		g2.draw(face);
		g2.setColor(bodyColor);
		g2.fill(face);
		g2.setColor(gainsboro);
		g2.draw(ear1);
		g2.fill(ear1);
		g2.setColor(bodyColor);
		g2.draw(ear2);
		g2.fill(ear2);
		g2.setColor(teal);
		g2.draw(eye1);
		g2.fill(eye1);
		g2.setColor(Color.black);
		g2.draw(mouth);
		g2.draw(eye2);
		g2.draw(eye3);
		g2.setColor(Color.white);
		g2.fill(mouth);
		g2.fill(eye2);
		g2.fill(eye3);
		g2.setColor(Color.black);
		g2.draw(nose);
		g2.fill(nose);

		g2.setColor(Color.darkGray);
		g2.draw(forehead1);
		g2.fill(forehead1);
		g2.draw(forehead2);
		g2.fill(forehead2);
		g2.draw(forehead3);
		g2.fill(forehead3);
		g2.setColor(Color.darkGray);
		g2.draw(whisker1);
		g2.fill(whisker1);
		g2.draw(whisker2);
		g2.fill(whisker2);
		g2.draw(whisker3);
		g2.fill(whisker3);
	}

	public void makeSound(Graphics2D g2) {
		// sound
		Point2D.Double p5 = new Point2D.Double(xLeft - 40, yTop + 50);
		Point2D.Double p6 = new Point2D.Double(xLeft - 20, yTop + 60);
		Line2D.Double line3 = new Line2D.Double(p5, p6);
		Point2D.Double p7 = new Point2D.Double(xLeft - 40, yTop + 90);
		Point2D.Double p8 = new Point2D.Double(xLeft - 20, yTop + 80);
		Line2D.Double line4 = new Line2D.Double(p8, p7);

		g2.setStroke(new BasicStroke(0));
		if (count % time == 0) {
			g2.setColor(Color.black);
			g2.setFont(new Font("serif", Font.BOLD, 20));
			g2.drawString(animalSound, xLeft - 70, yTop + 75);
			g2.draw(line3);
			g2.draw(line4);
		}
	}

	public void drawLegs(Graphics2D g2) {
		Rectangle legLeft = new Rectangle(xLeft + 60, yTop + 100, 35, 40);
		Rectangle legRight = new Rectangle(xLeft + 125, yTop + 100, 35, 40);
		g2.setColor(bodyColor);
		g2.draw(legLeft);
		g2.draw(legRight);
		g2.setColor(bodyColor);
		g2.fill(legLeft);
		g2.fill(legRight);
	}

	public void drawBody(Graphics2D g2) {
		// body
		Rectangle body = new Rectangle(xLeft + 60, yTop + 70, 100, 50);
		Point2D.Double p1 = new Point2D.Double(xLeft + 160, yTop + 120);
		Point2D.Double p2 = new Point2D.Double(xLeft + 60, yTop + 120);
		Line2D.Double line1 = new Line2D.Double(p1, p2);
		Point2D.Double p3 = new Point2D.Double(xLeft + 160, yTop + 70);
		Point2D.Double p4 = new Point2D.Double(xLeft + 160, yTop + 120);
		Line2D.Double line2 = new Line2D.Double(p3, p4);
		g2.setColor(Color.black);
		g2.draw(body);
		g2.setColor(bodyColor);
		g2.fill(body);

		g2.setColor(Color.black);
		g2.draw(line1);
		g2.draw(line2);

	}
	// public void goToRight(Graphics2D g2) {
	// Color gainsboro = new Color(220, 220, 220);
	// Color teal = new Color(0, 128, 128);
	// // body
	// Rectangle body = new Rectangle(xLeft - 100-60, yTop + 70, 100, 50);
	// Rectangle legLeft = new Rectangle(xLeft - 60-35, yTop + 100, 35, 40);
	// Rectangle legRight = new Rectangle(xLeft - 125-35, yTop + 100, 35, 40);
	// Rectangle tail = new Rectangle(xLeft - 160-30, yTop + 100, 30, 15);
	// Point2D.Double p1 = new Point2D.Double(xLeft - 60, yTop + 120);
	// Point2D.Double p2 = new Point2D.Double(xLeft - 160, yTop + 120);
	// Line2D.Double line1 = new Line2D.Double(p1, p2);
	// Point2D.Double p3 = new Point2D.Double(xLeft - 160, yTop + 70);
	// Point2D.Double p4 = new Point2D.Double(xLeft - 160, yTop + 120);
	// Line2D.Double line2 = new Line2D.Double(p3, p4);
	//
	// // face
	// Rectangle face = new Rectangle(xLeft-100, yTop, 100, 100);
	// Rectangle ear1 = new Rectangle(xLeft-100, yTop -10, 40, 40);
	// Rectangle ear2 = new Rectangle(xLeft -100, yTop - 20, 60, 10);
	// Rectangle nose = new Rectangle(xLeft , yTop + 50, 8, 8);
	// Rectangle forehead1 = new Rectangle(xLeft-7, yTop, 7, 30);
	// Rectangle forehead2 = new Rectangle(xLeft-20, yTop + 5, 20, 5);
	// Rectangle forehead3 = new Rectangle(xLeft-15, yTop + 15, 15, 5);
	// Rectangle eye1 = new Rectangle(xLeft -15-20, yTop + 25, 20, 15);
	// Rectangle eye2 = new Rectangle(xLeft - 17-4, yTop + 35, 4, 2);
	// Rectangle eye3 = new Rectangle(xLeft - 27-5, yTop + 28, 5, 5);
	// Rectangle whisker1 = new Rectangle(xLeft -10-40, yTop + 65, 40, 3);
	// Rectangle whisker2 = new Rectangle(xLeft -10-40, yTop + 75, 40, 3);
	// Rectangle whisker3 = new Rectangle(xLeft -10-40, yTop + 85, 40, 3);
	// Rectangle mouth = new Rectangle(xLeft-40, yTop + 50, 40, 50);
	//
	// // sound
	// Point2D.Double p5 = new Point2D.Double(xLeft + 40, yTop + 50);
	// Point2D.Double p6 = new Point2D.Double(xLeft + 20, yTop + 60);
	// Line2D.Double line3 = new Line2D.Double(p5, p6);
	// Point2D.Double p7 = new Point2D.Double(xLeft + 40, yTop + 90);
	// Point2D.Double p8 = new Point2D.Double(xLeft + 20, yTop + 80);
	// Line2D.Double line4 = new Line2D.Double(p8, p7);
	//
	// g2.setStroke(new BasicStroke(0));
	// if (count % time == 0) {
	// g2.setColor(Color.black);
	// g2.setFont(new Font("serif", Font.BOLD, 20));
	// g2.drawString(animalSound, xLeft+30, yTop + 75);
	// g2.draw(line3);
	// g2.draw(line4);
	// }
	//
	// g2.setStroke(new BasicStroke(0));
	// g2.draw(legLeft);
	// g2.draw(legRight);
	// g2.draw(body);
	// g2.draw(tail);
	//
	// g2.setColor(bodyColor);
	// g2.fill(legLeft);
	// g2.fill(legRight);
	// g2.fill(body);
	// g2.fill(tail);
	//
	// g2.setColor(Color.black);
	// g2.draw(face);
	// g2.setColor(bodyColor);
	// g2.fill(face);
	// g2.setColor(gainsboro);
	// g2.draw(ear1);
	// g2.fill(ear1);
	// g2.setColor(bodyColor);
	// g2.draw(ear2);
	// g2.fill(ear2);
	// g2.setColor(Color.darkGray);
	// g2.draw(forehead1);
	// g2.fill(forehead1);
	// g2.draw(forehead2);
	// g2.fill(forehead2);
	// g2.draw(forehead3);
	// g2.fill(forehead3);
	// g2.setColor(teal);
	// g2.draw(eye1);
	// g2.fill(eye1);
	// g2.setColor(Color.black);
	// g2.draw(mouth);
	// g2.draw(eye2);
	// g2.draw(eye3);
	// g2.setColor(Color.white);
	// g2.fill(mouth);
	// g2.fill(eye2);
	// g2.fill(eye3);
	// g2.setColor(Color.black);
	// g2.draw(nose);
	// g2.fill(nose);
	// g2.setColor(Color.darkGray);
	// g2.draw(whisker1);
	// g2.fill(whisker1);
	// g2.draw(whisker2);
	// g2.fill(whisker2);
	// g2.draw(whisker3);
	// g2.fill(whisker3);
	//
	// g2.setColor(Color.black);
	// g2.draw(line1);
	// g2.draw(line2);
	//
	// }
}
