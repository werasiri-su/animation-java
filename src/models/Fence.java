package models;
/*
 * Werasiri Supachaisiriruang 5810405363
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Path2D;
import java.util.ArrayList;

public class Fence extends Animation {
	private ArrayList<Integer> lstFence;

	public Fence(int x, int y, Color color) {
		super(x, y, color);
		lstFence = new ArrayList<Integer>();
		for (int i = 0; i <= 1000; i += 20) {
			lstFence.add(i);
		}

	}

	public void draw(Graphics2D g2) {
		g2.setStroke(new BasicStroke(0));
		for (int j : lstFence) {
			Path2D headFence = new Path2D.Double();
			headFence.moveTo(xLeft - 5+j, yTop + 7);
			headFence.lineTo(xLeft + 5+j, yTop + 7);
			headFence.lineTo(xLeft+j, yTop);
			headFence.closePath();
			Rectangle baseFence = new Rectangle(xLeft - 5+j, yTop + 7, 10, 30);

			g2.setPaint(bodyColor);
			g2.draw(headFence);
			g2.fill(headFence);
			g2.draw(baseFence);
			g2.fill(baseFence);

		}
		Rectangle fence1 = new Rectangle(xLeft, yTop+15, 1000, 5);
		Rectangle fence2 = new Rectangle(xLeft, yTop+25, 1000, 5);
		g2.draw(fence1);
		g2.fill(fence1);
		g2.draw(fence2);
		g2.fill(fence2);

	}
}
