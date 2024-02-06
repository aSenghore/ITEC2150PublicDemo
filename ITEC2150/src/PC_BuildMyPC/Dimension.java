package PC_BuildMyPC;

public class Dimension {

    private double height;
    private double width;
    private double depth;

    public Dimension(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
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

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}
    
	public String toString() {
		return "\nHeight: " + this.height + "\nWidth: " + this.width + "\nDepth: " + this.depth + "\n-------------------------------------------";
	}
}