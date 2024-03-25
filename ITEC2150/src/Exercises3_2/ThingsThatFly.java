package Exercises3_2;

public class ThingsThatFly {
	public static void main(String[] args) {
		Flight [] flights = new Flight [3];
		
		flights[0] = new Airplane("Boeing 747", 2016);
		flights[1] = new Bird("Eagle");
		flights[2] = new Bird("Hummingbird");
		
		for(int i = 0; i < flights.length-1; i++) {
			System.out.print(flights[i]);
			flights[i].fly();
		}
	}
}
