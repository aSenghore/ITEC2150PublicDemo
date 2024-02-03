package Exercises1_9;

public class Person {
//private variables for person attributes
	private String name;
	private int age;
	private String eyeColor;
//constructor method for person	
	public Person() {
		this.name = name;
		this.age = age;
		this.eyeColor = eyeColor;
	}
//setter and getter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
//returns attributes a a coherent string	
	public String toString() {
		return this.name + " is " + this.age + " years old, with " + this.eyeColor + " eyes.";
	}
//returns a message with person name
	public String talk() {
		return "Welcome coders, I am " + this.name;
	}
}
