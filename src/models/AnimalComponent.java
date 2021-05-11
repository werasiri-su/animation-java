package models;
/*
 * Werasiri Supachaisiriruang 5810405363
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;

public class AnimalComponent extends JComponent {
	private Lion lion,whiteLion;
	private Cloud cloud;
	private Background bg;
	private Elephant elephant;
	private Tiger tiger;
	private Bush bushLeft;
	private Bush bushRight;
	private Sun sun;
	private People people;
	private ArrayList<Animation> lstAnimation;
	private Fence fence;
	private Color silver,darkGray;

	public AnimalComponent() {
		Color floian = new Color(65,176,135);
		Color lightBrown = new Color(229,172,77);
		Color berriasian = new Color(140,205,96);
		Color skyBlue = new Color(135,206,235);
		darkGray = new Color(169,169,169);
		Color peru = new Color(205,133,63);
		silver = new Color(192,192,192);
		Color asselian = new Color(227,99,80);
		Color devonian = new Color(203,140,55);
		
		lstAnimation = new ArrayList<Animation>();
		cloud = new Cloud(10, 50,Color.white);
		bg = new Background(0, 0,skyBlue);
		lion = new Lion(190, 390,peru);
		whiteLion = new Lion(450, 390,lightBrown);
		tiger = new Tiger(460,360,darkGray);
		elephant = new Elephant(390,510,silver); 
		
		bushLeft = new Bush(0,25,floian);
		bushRight = new Bush(450,25,berriasian);
		sun = new Sun(0,0,asselian);
		people = new People(0,350,Color.black);
		fence = new Fence(0,385,devonian);
		
		lstAnimation.add(bg);
		lstAnimation.add(sun);
		lstAnimation.add(cloud);
		lstAnimation.add(people);
		lstAnimation.add(fence);
		lstAnimation.add(tiger);
		lstAnimation.add(lion);
		lstAnimation.add(whiteLion);
		lstAnimation.add(elephant);
		lstAnimation.add(bushLeft);
		lstAnimation.add(bushRight);
		
		
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g); 
		Graphics2D g2 = (Graphics2D) g;
		for (Animation i:lstAnimation){
			(i).draw(g2);
		}
	}

	public void changeLocation(int x) {
		tiger.moveBehavior.move(x);
		elephant.moveBehavior.move(x);
	}
	public void switchDirection() {
		tiger.switchDirection();
		elephant.switchDirection();
		
	}
	public People getPeople(){
		return people;
	}
	
}
