package models;
/*
 * Werasiri Supachaisiriruang 5810405363
 */
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

public class Animation {
	protected int xLeft;
	protected int yTop;
	protected Color bodyColor;
	protected int count,time;
	
	public Animation(int x,int y,Color color){
		xLeft = x;
		yTop = y;
		bodyColor = color;
		count = 0;
	}
	public void countTime(){
		count+=1;
	}
	public void draw(Graphics2D g2) {
		
	}
	public int randomLocation(int min,int max){
		Random random = new Random();
		int randomNum = random.nextInt((max - min) + 1) + min;
		return randomNum;
	}
}
