package EcoTransportModels;

public class ElectricScooter extends Vehicle{

	private String maxSpeed;
	private String weightCapacity;
	
	public ElectricScooter(String ownerName, String vehicleType, String registrationNumber, String maxSpeed, String weightCapacity) {
		super(ownerName, vehicleType, registrationNumber);
		this.maxSpeed = maxSpeed;
		this.weightCapacity = weightCapacity;
	}

	public String getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	public String getWeightCapacity() {
		return weightCapacity;
	}


	public void setWeightCapacity(String weightCapacity) {
		this.weightCapacity = weightCapacity;
	}


	@Override
	public String toString() {
		return "This vehicle is a " + getVehicleType() + " owned by " + getOwnerName()
		+ ". It has a " + getMaxSpeed() + " max speed, a " + getWeightCapacity() + " weight capacity,"
				+ " and the registration number is " + getRegistrationNumber();
	}
}