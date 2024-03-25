package Exercises3_2;

public class Bird implements Flight{
	
	private String type;

	public Bird(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public void fly() {
		System.out.println("I'm a bird who flaps wings to fly.");
	}
	
	public String toString() {
		return "Bird [type=" + getType() + "]:";
	}
	
}
