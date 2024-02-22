package EcoTransportModels;

public class Bicycle extends Vehicle{
	
	private boolean hasGears;
	private int gearCount;
	
	public Bicycle(String ownerName, String vehicleType, String registrationNumber, boolean hasGears, int gearCount) {
		super(ownerName, vehicleType, registrationNumber);
		this.hasGears = hasGears;
		this.gearCount = gearCount;
	}
	
	public boolean isHasGears() {
		return hasGears;
	}

	public void setHasGears(boolean hasGears) {
		this.hasGears = hasGears;
	}

	public int getGearCount() {
		return gearCount;
	}

	public void setGearCount(int gearCount) {
		this.gearCount = gearCount;
	}

	public String gears() {
		if (this.hasGears == true) {
			return this.gearCount + " gears";
		}
		else{
			return "no gears";
		}
	}
	@Override
	public String toString() {
		return "This vehicle is a " + getVehicleType() + " owned by " + getOwnerName() +
				". It has " + gears() + " and the registration number is " + getRegistrationNumber();
	}
}
