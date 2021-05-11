package models;
/*
 * Werasiri Supachaisiriruang 5810405363
 */
public class Swing implements MoveBehavior{
	private Animal animal;
	private String direction;
	public Swing(Animal animal){
		animal = animal;

	}
	@Override
	public void move(int x) {
		animal.xLeft += x;
		
	}

}
