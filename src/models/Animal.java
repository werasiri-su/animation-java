package models;

/*
 * Werasiri Supachaisiriruang 5810405363
 */
import java.awt.Color;
import java.awt.Graphics2D;

public class Animal extends Animation {
	protected String animalSound;
	protected int length;
	protected String direction;
	protected MoveBehavior moveBehavior;

	public Animal(int x, int y, Color color) {
		super(x, y, color);
	}

	public int getxLeft() {
		return xLeft;
	}

	public int getyTop() {
		return yTop;
	}

	public void switchDirection() {
		switch (direction) {
		case "right":
			direction = "left";
		case "left":
			direction = "right";
		}
	}

	public void drawHead(Graphics2D g2) {
	}

	public void makeSound(Graphics2D g2) {
	}

	public void drawLegs(Graphics2D g2) {
	}

	public void drawBody(Graphics2D g2) {
	}
}
