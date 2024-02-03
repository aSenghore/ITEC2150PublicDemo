package Bedroom;

public class Desk {
	
	private String color;
	private String shape;
	private String materials;
	
	public Desk(String color, String shape, String materials) {
		super();
		this.color = color;
		this.shape = shape;
		this.materials = materials;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getMaterials() {
		return materials;
	}

	public void setMaterials(String materials) {
		this.materials = materials;
	}
	
}
