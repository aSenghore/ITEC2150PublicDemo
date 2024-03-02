package DoctorsAbstract;

public class Dermatologist extends Doctor{

	public Dermatologist(String name) {
		super(name);
	}
	
	public String getSchedule() {
		return "Friday only, 8 AM - 9 PM";
	}
}
