package models;
/*
 * Werasiri Supachaisiriruang 5810405363
 */
public class MoveAround implements MoveBehavior {
	Animal animal;
	public MoveAround(Animal animal1){
		animal = animal1;
		
	}
	@Override
	public void move(int x) {
		if (animal.xLeft+animal.length < 0){
			animal.xLeft = 1000;	
		}
		else if (animal.xLeft > 1000){
			animal.xLeft = 0-animal.length;	
		}
		else{
			animal.xLeft+=x ;
		}
		
		
		
		
		
	}


}
