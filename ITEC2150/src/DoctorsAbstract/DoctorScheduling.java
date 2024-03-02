package DoctorsAbstract;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoctorScheduling {
	static List<Doctor> doctors = new ArrayList<Doctor>();
	
	public static void main(String[] args) {
		
	}
	
	public static void addDoctor(Scanner input) {
		System.out.println("Enter the doctor's anme: ");
		String name = input.nextLine();
		
		System.out.print("Choose doctor's specialization");
		System.out.println("1: Oncologist\n2:Cardiologist\n3:Dermatologist\n");
		int specialization = input.nextInt();
		
		doctors.add(new Oncologist(name));
		
		switch(specialization) {
			case 1: doctors.add(new Oncologist(name));
			case 2: doctors.add(new Cardiologist(name));
			case 3: doctors.add(new Dermatologist(name));
			default:
				System.out.println("Invalid input - error");
		}
	}
	
	public static void viewScedule() {
		if(doctors.isEmpty()) {
			System.out.println("No doctors have been added yet");
		}
		for(Doctor doc: doctors) {
			System.out.print(doc.getName() + " - " + doc.getSchedule());
		}
	}
}
