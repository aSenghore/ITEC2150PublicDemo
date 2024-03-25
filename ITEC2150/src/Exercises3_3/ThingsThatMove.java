package Exercises3_3;

public class ThingsThatMove {
	public static void main(String[] args) {
		Movement [] moves = new Movement [3];
		
		moves[0] = new Airplane("Boeing 747", 2016);
		moves[1] = new Bird("Eagle");
		moves[2] = new Bird("Hummingbird");
		
		for(int i = 0; i < moves.length-1; i++) {
			System.out.println(moves[i]);
			moves[i].fly();
			moves[i].walk();
			moves[i].jump();
		}
	}
}
