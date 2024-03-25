package Exercises3_3;

public class Bird implements Movement{
	
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
		System.out.println("I flap my wings to fly.");
	}
	
	@Override
	public void walk() {
		System.out.println("I walk on my feet.");
	}
	
	@Override
	public void jump() {
		System.out.println("I jump by leaping from my feet.");
	}
	
	public String toString() {
		return "Bird [type=" + getType() + "]:";
	}
	
}