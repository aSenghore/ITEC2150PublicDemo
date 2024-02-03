package Bedroom;

public class BuildMyBedroom {
	public static void main(String[] args) {
		
		Wall wall1 = new Wall("North");
		Wall wall2 = new Wall("East");
		Wall wall3 = new Wall("South");
		Wall wall4 = new Wall("West");
		Bed bed = new Bed("Queen", 4, "Blue", "Wood");
		Size size = new Size(10,5);
		Door door = new Door((size), "Brown", "Wood");
		Ceiling ceiling = new Ceiling(4,"grey", size);
		Desk desk = new Desk("Red","Circle","Wood");
		Bedroom myBedroom = new Bedroom("My Bedroom", wall1,wall2, wall3, wall4, ceiling, bed, door, desk);
		
		System.out.println(myBedroom);
	}
}
