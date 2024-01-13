import java.util.Scanner;

public class StudentTester {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		Student studentEx = new Student("Abdou", "Senghore", 19);
		System.out.println(studentEx);
		System.out.println();
		
		Student student1 = new Student ("Kuro", "Lagatt", 22);
		Student student2 = new Student ("Nee", "Sugarplum", 23);
		Student student3 = new Student ("Rei", "Sanamoto", 23);
		Student student4 = new Student ("Popilae", "Fae", 22);
		Student student5 = new Student ("Absent", "Actor", 18);
	
		
		Student[] studentList = new Student[] {studentEx, student1, student2, student3, student4, student5};
		System.out.println("Print the names of students over 20");
		for (int i = 0; i < studentList.length; i++) {
			int age = studentList[i].getAge();
			if (age > 20) {
				System.out.println(studentList[i]);
			}
		}
	}
}
