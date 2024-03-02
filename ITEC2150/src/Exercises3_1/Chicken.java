package Exercises3_1;

public class Chicken extends FarmAnimal{

	private String sound;

	public Chicken(String name, String gender, double weight, int age, String sound) {
		super(name, gender, weight, age);
		this.sound = sound;
	}
	
	public String getSound() {return sound;}
	
	public void setSound(String sound) {this.sound = sound;}

	@Override
	public String feedLoadingSchedule() {
		return getName() + ": 8am-4pm";
	}
	
	@Override
	public String toString(){
		return "Chicken " + getSound() + "[name=" + getName() + ", gender=" 
				+ getGender() + ", weight=" + getWeight() + ", age=" + getAge() + "]";
	}
	
}
