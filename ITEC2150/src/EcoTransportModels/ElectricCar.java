package EcoTransportModels;

public class ElectricCar extends Vehicle{

	private String batteryCapacity;
	private String range;
	
	public ElectricCar(String ownerName, String vehicleType, String registrationNumber, String batteryCapacity, String range) {
		super(ownerName, vehicleType, registrationNumber);
		this.batteryCapacity = batteryCapacity;
		this.range = range;
	}

	public String getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(String batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}
	
	@Override
	public String toString() {
		return "This vehicle is a " + getVehicleType() + " owned by " + getOwnerName()
		+ ". It has a " + getBatteryCapacity() + " battery capacity, a " + getRange() + " range,"
				+ " and the registration number is " + getRegistrationNumber();
	}
}
