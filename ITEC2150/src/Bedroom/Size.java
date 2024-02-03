package Bedroom;

public class Size {
	
	private double height;
	private double width;
	private double length;
	
	public Size() {
		
	}
	public Size(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public Size(double height, double width, double length) {
		super();
		this.height = height;
		this.width = width;
		this.length = length;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	
}
