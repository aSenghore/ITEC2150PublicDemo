import java.util.Scanner;

public class MethodPractice {
	public static void main (String[] args) {
		MethodPractice methods = new MethodPractice();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give me an integer to square: ");
		int squareVal = input.nextInt();
		System.out.println(methods.calculateSquare(squareVal));
		
		System.out.println("What is your first name?");
		String nameInput = input.next();
		System.out.println(methods.printName(nameInput));
	}
	
	public int calculateSquare(int n) {
		int value = n;
		int square = (n*n);
		return square;
	}
	
	public String printName(String str) {
		String name = str;
		String greeting = "Hello, " + name + "!";
		return greeting;
	}
}
