package PC_BuildMyPC;

public class Resolution {
	private double height;
    private double width;

    public Resolution(double height, double width) {
        this.height = height;
        this.width = width;
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

	public String toString() {
		return "\nHeight: " + this.height + "\nWidth: " + this.width;
	}
    
	
}

