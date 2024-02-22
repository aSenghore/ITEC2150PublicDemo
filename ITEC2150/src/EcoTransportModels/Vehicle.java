package EcoTransportModels;

public class Vehicle {
	
	private String ownerName;
	private String vehicleType;
	private String registrationNumber;
	
	public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		this.registrationNumber = registrationNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	public String toString() {
		return "This vehicle is a " + getVehicleType() + " owned by " + getOwnerName()
		+ " and the registration number is " + getRegistrationNumber();
	}
	
	
	
}
