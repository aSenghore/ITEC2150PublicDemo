package Exercises1_9;

public class BikeTester {
	public static void main(String[] args) {
//creates first bike with default variables and prints with toString
		Bike bike1 = new Bike();
		System.out.println(bike1);
//creates a new bike, sets variables and prints with toString		
		Bike bike2 = new Bike();
		bike2.setWheels(4);
		bike2.setManufacturer("Toyota");
		bike2.setYear(2020);
		System.out.println(bike2);
//creates a list using bike objects		
		Bike[] bikeList = new Bike[]{bike1, bike2};
		System.out.println(bikeList[0]);
		System.out.println(bikeList[1]);
//variables to help find total wheels and oldest bike		
		int wheelTotal = 0;
		int oldest = bikeList[0].getYear();
//method to find the total wheels of all bikes		
		for(int i = 0; i<bikeList.length;i++) {
			int wheels = bikeList[i].getWheels();
			wheelTotal += wheels;
		}
		System.out.println(wheelTotal);
//a method to find and print the year of the oldest bike		
		for(int i = 0; i<bikeList.length;i++) {
			int age = bikeList[i].getYear();
			if(age < oldest) {
				oldest = age;
			}
		}
		System.out.println("The oldest bike is from the year " + oldest);
	}
}
