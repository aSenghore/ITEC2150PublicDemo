package Exercises3_1;

public class Duck extends FarmAnimal{

	private String sound;
	
	public Duck(String name, String gender, double weight, int age, String sound) {
		super(name, gender, weight, age);
		this.sound = sound;
	}
	
	public String getSound() {return sound;}
	
	public void setSound(String sound) {this.sound = sound;}

	@Override
	public String feedLoadingSchedule() {
		return getName() + ": 8am-12pm-6pm";
	}
	
	@Override
	public String toString(){
		return "Duck " + getSound() + " " + getSound() + "[name=" + getName() + ", gender=" 
				+ getGender() + ", weight=" + getWeight() + ", age=" + getAge() + "]";
	}
}
