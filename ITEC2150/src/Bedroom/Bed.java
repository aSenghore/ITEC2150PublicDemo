package Bedroom;

public class Bed {
	
	private String size; //queen, double, king
	private int numberOfPillows;
	private String color;
	public String material;
	public String getSize() {
		return size;
	}
	
	public Bed(String size, int numberOfPillows, String color, String material) {
		super();
		this.size = size;
		this.numberOfPillows = numberOfPillows;
		this.color = color;
		this.material = material;
	}

	public void setSize(String size) {
		this.size = size;
	}
	public int getNumberOfPillows() {
		return numberOfPillows;
	}
	public void setNumberOfPillows(int numberOfPillows) {
		this.numberOfPillows = numberOfPillows;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void make() {
		System.out.println("Bed class - make() method");
	}
}
