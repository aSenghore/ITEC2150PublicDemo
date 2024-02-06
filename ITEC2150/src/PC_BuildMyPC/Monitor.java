package PC_BuildMyPC;

/*
Acer - Nitro XZ320Q P3bmiiphx 31.5"
LED Curved FHD FreeSync Premium Monitor - Black
Model: XZ#20Q P3bmiiphxSKU:6538259
maximum resolution: 1920 * 1080
screen size 31.5 inches
refresh rate is 165Hz
 */
public class Monitor {

    private String manufacturer;
    private String model;
    private Resolution resolution;
    private double screenSize;
    private int refreshRate;

    public Monitor(String manufacturer, String model, Resolution resolution, double screenSize, int refreshRate) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.resolution = resolution;
        this.screenSize = screenSize;
        this.refreshRate = refreshRate;
    }

	public String getManufacturer() {
		return manufacturer;
	}

	public String getModel() {
		return model;
	}

	public Resolution getResolution() {
		return resolution;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public int getRefreshRate() {
		return refreshRate;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setResolution(Resolution resolution) {
		this.resolution = resolution;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public void setRefreshRate(int refreshRate) {
		this.refreshRate = refreshRate;
	}
    
	public String toString() {
		return "Monitor" + "\nManufacturer: " + this.manufacturer 
				+ "\nModel: " + this.model +  "\nResolution" + this.resolution 
				+  "\nScreen size: " + this.screenSize + "\nRefresh rate: " + this.refreshRate + "Hz";
	}
}


