package Exercises3_3;

public class Airplane implements Movement{

	private String model;
	private int yearBuilt;
	
	public Airplane(String model, int yearBuilt) {
		this.model = model;
		this.yearBuilt = yearBuilt;
	}

	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYearBuilt() {
		return yearBuilt;
	}


	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}


	@Override
	public void fly() {
		System.out.println("\nI rely on my engine to fly.");
	}
	
	@Override
	public void walk() {
		System.out.println("\nI tax on my wheels.");
	}
	
	@Override
	public void jump() {
		System.out.println("\nI cannot jump.");
	}
	
	public String toString() {
		return "Airplane [model=" + getModel() + ", year=" + getYearBuilt() + ":";
	}
	
}
