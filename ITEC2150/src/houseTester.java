import java.util.Scanner;

public class houseTester {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		houseConstruct houseEx = new houseConstruct(25, 30, 25, 3, 1);
		System.out.println("Example house with length, width, height, number of windows, and number of doors.");
		System.out.println(houseEx);
		System.out.println("We need " + houseEx.paintGallon() + " gallons, and " + houseEx.paintQuarts() + " quarts.");
		System.out.println();
		
		System.out.println("Give me the length, width, height, number of windows, and number of doors. (Separate with space)");
		houseConstruct house1 = new houseConstruct(input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt());
		System.out.println(house1);
		System.out.println("We need " + house1.paintGallon() + " gallons, and " + house1.paintQuarts() + " quarts.");
		System.out.println();
		
		System.out.println("Give me the length, width, height, number of windows, and number of doors. (Separate with space)");
		houseConstruct house2 = new houseConstruct(input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt());
		System.out.println(house2);
		System.out.println("We need " + house2.paintGallon() + " gallons, and " + house2.paintQuarts() + " quarts.");
		System.out.println();
		//
	}

}
