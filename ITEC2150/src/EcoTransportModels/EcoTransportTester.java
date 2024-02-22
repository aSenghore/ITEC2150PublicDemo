package EcoTransportModels;

public class EcoTransportTester {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("Boss", "Sports Car", "70863982396173327 ");
		ElectricCar eCar = new ElectricCar("HR Manager", "Electric Car", "68645422073741505", "76.1 to 99.8 kWh", "434 km");
		Bicycle bike = new Bicycle("Senior Co-worker","Bike","32073622834182011",true, 5);
		ElectricScooter eScoot = new ElectricScooter("Junior Co-worker", "Electric Scooter", "21794851186352346","24-40 km/h", "100 to 160 kg");
		
		System.out.println(vehicle);
		System.out.println(eCar);
		System.out.println(bike);
		System.out.println(eScoot);
	}
}
