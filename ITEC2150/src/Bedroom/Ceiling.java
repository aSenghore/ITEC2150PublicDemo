package Bedroom;

public class Ceiling {
	
	private int numberOfLights;
	private String color;
	private Size size;
	
	public Ceiling(int numberOfLights, String color, Size size) {
		super();
		this.numberOfLights = numberOfLights;
		this.color = color;
		this.size = size;
	}

	public int getNumberOfLights() {return numberOfLights;}

	public void setNumberOfLights(int numberOfLights) {this.numberOfLights = numberOfLights;}

	public String getColor() {return color;}

	public void setColor(String color) {this.color = color;}

	public Size getSize() {return size;}
	
	public double getWidth() {return size.getWidth();}

	public double getLength() {return size.getLength();}
	
	public void setWidth(Size size, double width) {
		this.size = size;
		size.setWidth(width);
	}
	
	public void setLength(Size size, double length) {
		this.size = size;
		size.setLength(length);
	}
	
	public void setSize(Size size) {this.size = size;}
	//size.getWidth() = size0.getWidth();
}
