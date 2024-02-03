package Exercises1_9;

public class PersonTester {
	public static void main(String[] args) {
		Person person1 = new Person();
		
		System.out.println(person1);
		person1.setName("Howard Roark");
		System.out.println(person1.talk());
	}
}
