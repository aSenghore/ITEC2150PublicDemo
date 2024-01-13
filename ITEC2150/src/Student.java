public class Student {
	
	private String fName;
	private String lName;
	private int age;
	
	public Student(String fName, String lName, int age) {
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}
	
	public void setFName(String fName) {
	    if (fName != "") {
	    	this.fName = fName;
	    }
	    else {
	        this.fName = "";
	    }
	}
	
	public String getFName(){
		return this.fName;
	}
	
	public void setLName(String lName) {
	    if (lName != "") {
	    	this.lName = lName;
	    }
	    else {
	        this.lName = "";
	    }
	}
	
	public String getLName(){
		return this.lName;
	}
	
	public void setAge(int age) {
	    if (age > 0) {
	    	this.age = age;
	    }
	    else {
	        this.age = 0;
	    }
	}
	
	public int getAge(){
		return this.age;
	}
	
	public String toString() {
		return "Student Name: " + this.lName + ", " + this.fName +  ". Age: " + this.age;
	}
	
}