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

public class Elephant extends Animal {
	Color lightGray, paleGreen, green;

	public Elephant(int x, int y, Color color) {
		super(x, y, color);
		animalSound = "baraag";
		length = 540;
		moveBehavior = new MoveAround(this);
		time = randomLocation(1, 15);
		direction = "left";
		lightGray = new Color(211, 211, 211);
		paleGreen = new Color(144, 238, 144);
		green = new Color(191, 230, 207);
	}

	@Override
	public void draw(Graphics2D g2) {

		drawBody(g2);
		drawTail(g2);
		drawHead(g2);
		drawTrunk(g2);
		drawTusk(g2);
		drawLegs(g2);
		makeSound(g2);

		countTime();
	}

	public void drawHead(Graphics2D g2) {
		// face
		Rectangle face = new Rectangle(xLeft, yTop, 230, 200);
		Rectangle ear = new Rectangle(xLeft + 140, yTop + 50, 120, 90);
		Rectangle eye = new Rectangle(xLeft + 70, yTop + 140, 20, 20);
		Point2D.Double p1 = new Point2D.Double(xLeft + 140, yTop + 50);
		Point2D.Double p2 = new Point2D.Double(xLeft + 260, yTop + 50);
		Point2D.Double p3 = new Point2D.Double(xLeft + 140, yTop + 140);
		Point2D.Double p4 = new Point2D.Double(xLeft + 260, yTop + 140);
		Line2D.Double line1 = new Line2D.Double(p1, p2);
		Line2D.Double line2 = new Line2D.Double(p1, p3);
		Line2D.Double line3 = new Line2D.Double(p3, p4);
		Line2D.Double line4 = new Line2D.Double(p2, p4);

		g2.setColor(Color.black);
		g2.draw(face);
		g2.setColor(bodyColor);
		g2.fill(face);

		g2.setColor(Color.black);
		g2.draw(eye);
		g2.fill(eye);

		g2.setColor(bodyColor);
		g2.draw(ear);
		g2.setColor(bodyColor);
		g2.fill(ear);

		g2.setColor(Color.black);
		g2.draw(line1);
		g2.draw(line2);
		g2.draw(line3);
		g2.draw(line4);

	}

	public void drawTrunk(Graphics2D g2) {

		Rectangle trunk1 = new Rectangle(xLeft, yTop + 200, 65, 150);
		Rectangle trunk2 = new Rectangle(xLeft + 20, yTop + 300, 130, 50);
		Rectangle trunk3 = new Rectangle(xLeft + 120, yTop + 260, 30, 40);
		Rectangle trunk4 = new Rectangle(xLeft + 90, yTop + 260, 30, 20);

		g2.setColor(Color.black);
		g2.draw(trunk1);
		g2.draw(trunk2);
		g2.draw(trunk3);
		g2.draw(trunk4);
		g2.setColor(bodyColor);
		g2.fill(trunk1);

		g2.fill(trunk2);
		g2.fill(trunk3);

		g2.fill(trunk4);

	}

	public void makeSound(Graphics2D g2) {
		// sound
		Point2D.Double p5 = new Point2D.Double(xLeft - 10, yTop + 150);
		Point2D.Double p6 = new Point2D.Double(xLeft - 40, yTop + 130);
		Line2D.Double line5 = new Line2D.Double(p5, p6);
		Point2D.Double p7 = new Point2D.Double(xLeft - 10, yTop + 170);
		Point2D.Double p8 = new Point2D.Double(xLeft - 40, yTop + 190);
		Line2D.Double line6 = new Line2D.Double(p8, p7);
		if (count % time == 0) {
			g2.setColor(Color.black);
			g2.setFont(new Font("serif", Font.BOLD, 30));
			g2.drawString(animalSound, xLeft - 100, yTop + 165);
			g2.draw(line5);
			g2.draw(line6);
		}
	}

	public void drawTusk(Graphics2D g2) {
		Rectangle tusk = new Rectangle(xLeft + 85, yTop + 200, 15, 35);
		g2.setColor(Color.white);
		g2.draw(tusk);
		g2.fill(tusk);
	}

	public void drawBody(Graphics2D g2) {
		// body
		Rectangle body = new Rectangle(xLeft + 170, yTop, 350, 350);

		g2.draw(body);
		g2.setColor(bodyColor);
		g2.fill(body);
	}

	public void drawTail(Graphics2D g2) {
		Rectangle tail = new Rectangle(xLeft + 521, yTop + 20, 20, 140);
		Rectangle brush = new Rectangle(xLeft + 521, yTop + 160, 30, 40);

		g2.setColor(Color.black);
		g2.draw(tail);
		g2.setColor(bodyColor);
		g2.fill(tail);

		g2.setColor(Color.darkGray);
		g2.draw(brush);
		g2.fill(brush);
	}

	public void drawLegs(Graphics2D g2) {
		Rectangle spaceBetweenLeg = new Rectangle(xLeft + 320, yTop + 300, 60, 50);
		g2.setColor(green);
		g2.draw(spaceBetweenLeg);
		g2.fill(spaceBetweenLeg);
	}

	// public void goToRight(Graphics2D g2) {
	// Color lightGray = new Color(211, 211, 211);
	// Color paleGreen = new Color(144, 238, 144);
	// Color green = new Color(191, 230, 207);
	//
	// // face
	// Rectangle face = new Rectangle(xLeft - 230, yTop, 230, 200);
	// Rectangle ear = new Rectangle(xLeft - 230 - 20, yTop + 50, 120, 90);
	// Rectangle eye = new Rectangle(xLeft - 70, yTop + 140, 20, 20);
	// Point2D.Double p1 = new Point2D.Double(xLeft + 70 - 230, yTop + 50);
	// Point2D.Double p2 = new Point2D.Double(xLeft - 20 - 230, yTop + 50);
	// Point2D.Double p3 = new Point2D.Double(xLeft + 70 - 230, yTop + 140);
	// Point2D.Double p4 = new Point2D.Double(xLeft - 20 - 230, yTop + 140);
	// Line2D.Double line1 = new Line2D.Double(p1, p2);
	// Line2D.Double line2 = new Line2D.Double(p1, p3);
	// Line2D.Double line3 = new Line2D.Double(p3, p4);
	// Line2D.Double line4 = new Line2D.Double(p2, p4);
	//
	// Rectangle tusk = new Rectangle(xLeft - 85 - 15, yTop + 200, 15, 35);
	// Rectangle trunk1 = new Rectangle(xLeft - 65, yTop + 200, 65, 150);
	// Rectangle trunk2 = new Rectangle(xLeft - 130, yTop + 300, 130, 50);
	// Rectangle trunk3 = new Rectangle(xLeft - 130, yTop + 260, 30, 40);
	// Rectangle trunk4 = new Rectangle(xLeft - 30 - 80, yTop + 260, 30, 20);
	//
	// // body
	// Rectangle body = new Rectangle(xLeft - 170 - 350, yTop, 350, 350);
	// Rectangle spaceBetweenLeg = new Rectangle(xLeft - 320 - 60, yTop + 300,
	// 60, 50);
	// Rectangle tail = new Rectangle(xLeft - 521 - 20, yTop + 20, 20, 140);
	// Rectangle brush = new Rectangle(xLeft - 521 - 30, yTop + 160, 30, 40);
	//
	// // sound
	// Point2D.Double p5 = new Point2D.Double(xLeft + 10, yTop + 150);
	// Point2D.Double p6 = new Point2D.Double(xLeft + 40, yTop + 130);
	// Line2D.Double line5 = new Line2D.Double(p5, p6);
	// Point2D.Double p7 = new Point2D.Double(xLeft + 10, yTop + 170);
	// Point2D.Double p8 = new Point2D.Double(xLeft + 40, yTop + 190);
	// Line2D.Double line6 = new Line2D.Double(p8, p7);
	//
	// g2.draw(body);
	// g2.setColor(bodyColor);
	// g2.fill(body);
	//
	// g2.setColor(green);
	// g2.draw(spaceBetweenLeg);
	// g2.fill(spaceBetweenLeg);
	//
	// g2.setColor(Color.black);
	// g2.draw(tail);
	// g2.setColor(bodyColor);
	// g2.fill(tail);
	//
	// g2.setColor(Color.darkGray);
	// g2.draw(brush);
	// g2.fill(brush);
	//
	// g2.setColor(Color.black);
	// g2.draw(face);
	// g2.setColor(bodyColor);
	// g2.fill(face);
	//
	// g2.setColor(Color.black);
	// g2.draw(eye);
	// g2.fill(eye);
	//
	// g2.setColor(bodyColor);
	// g2.draw(ear);
	// g2.setColor(bodyColor);
	// g2.fill(ear);
	//
	// g2.setColor(Color.black);
	// g2.draw(trunk1);
	// g2.draw(trunk2);
	// g2.draw(trunk3);
	// g2.draw(trunk4);
	// g2.setColor(bodyColor);
	// g2.fill(trunk1);
	//
	// g2.fill(trunk2);
	// g2.fill(trunk3);
	//
	// g2.fill(trunk4);
	//
	// g2.setColor(Color.white);
	// g2.draw(tusk);
	// g2.fill(tusk);
	//
	// g2.setColor(Color.black);
	// g2.draw(line1);
	// g2.draw(line2);
	// g2.draw(line3);
	// g2.draw(line4);
	//
	// if (count % time == 0) {
	// g2.setColor(Color.black);
	// g2.setFont(new Font("serif", Font.BOLD, 30));
	// g2.drawString(animalSound, xLeft + 100, yTop + 165);
	// g2.draw(line5);
	// g2.draw(line6);
	// }
	// }

}
