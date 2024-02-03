package Exercises1_9;

public class Bike {
//private variables for bike attributes
	private int wheels;
	private String manufacturer;
	private int year;
//constructor method for bike		
	public Bike() {
		this.wheels = 2;
		this.manufacturer = "Schwinn";
		this.year = 2014;
	}
//setter and getter methods
	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
//returns attributes a a coherent string	
	public String toString() {
		return "Bike has " + this.wheels + " wheels, and was manufactured by " + this.manufacturer + " in " + this.year;
	}
	
	
}
