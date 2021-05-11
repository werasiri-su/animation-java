package models;
/*
 * Werasiri Supachaisiriruang 5810405363
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class People extends Animation {
	ArrayList<Integer> lstPeople;

	public People(int x, int y, Color color) {
		super(x, y, color);
		lstPeople = new ArrayList<Integer>();
		lstPeople.add(randomLocation(0, 1000));
	}

	public void draw(Graphics2D g2) {
		for (int k : lstPeople) {
			Ellipse2D head = new Ellipse2D.Double(xLeft + 10+k, yTop + 0, 20, 20);
			Rectangle2D body = new Rectangle2D.Double(xLeft + 11+k, yTop + 23, 20, 28);
			Line2D neck = new Line2D.Double(xLeft + 21+k, yTop + 10, xLeft + 21+k, yTop + 35);
			Line2D arm1 = new Line2D.Double(xLeft + 5+k, yTop + 38, xLeft + 15+k, yTop + 28);
			Line2D arm2 = new Line2D.Double(xLeft + 28+k, yTop + 28, xLeft + 38+k, yTop + 38);
			Rectangle2D leg1 = new Rectangle2D.Double(xLeft + 15+k, yTop + 40, 1, 30);
			Rectangle2D leg2 = new Rectangle2D.Double(xLeft + 26+k, yTop + 40, 1, 30);

			g2.setColor(Color.black);
			g2.fill(head);
			g2.draw(head);
			g2.fill(body);
			g2.draw(body);
			g2.setStroke(new BasicStroke(5));
			g2.draw(neck);
			g2.draw(arm1);
			g2.draw(arm2);
			g2.draw(leg1);
			g2.draw(leg2);
		}

	}

	public void addPeople() {
		lstPeople.add(randomLocation(0, 1000));
	}
}
