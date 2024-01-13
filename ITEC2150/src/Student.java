public class Student {
	
	private String fName;
	private String lName;
	private int age;
	
	public Student(String fName, String lName, int age) {
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}
	
	public String getFName(){
		return this.fName;
	}
	
	public String getLName(){
		return this.lName;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public String toString() {
		return "Student Name: " + this.lName + ", " + this.fName +  ". Age: " + this.age;
	}
	
}