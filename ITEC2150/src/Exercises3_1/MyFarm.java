package Exercises3_1;

public class MyFarm {
	public static void main(String[] args) {
		FarmAnimal [] fmList = new FarmAnimal[6];
			
		fmList[0] = new Duck ("Donald", "male", 3.2, 5, "Quack");
		fmList[1] = new Duck ("Cheese", "female", 3.6, 5, "Quack");
		fmList[2] = new Cow ("Molly", "female", 1600.0, 2, "Moo");
		fmList[3] = new Chicken ("Albert", "male", 1.6, 2, "Cock-a-Doodle-doo");
		fmList[4] = new Chicken ("Amelia", "female", 1.8, 4, "Cluck Cluck");
		fmList[5] = new Chicken ("Dixie", "female", 1.7, 4, "Cluck Cluck");
	
		for(int i = 0; i < fmList.length-1; i++) {
			System.out.println(fmList[i]);
		}
		System.out.println();
		for(int i = 0; i < fmList.length-1; i++) {
			System.out.println(fmList[i].feedLoadingSchedule());
		}
		}
}
