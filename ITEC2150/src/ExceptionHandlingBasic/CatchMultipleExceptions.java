package ExceptionHandlingBasic;
import java.util.*;

public class CatchMultipleExceptions {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter a numerator: ");
			int num = input.nextInt();
			System.out.println("Enter a denominator: ");
			int denominator = input.nextInt();
			
			int result = num/denominator;
			
			System.out.println("The result of the division is " + result);
			
		}catch(ArithmeticException e) {
			System.out.println(e);
			input.nextLine();
			System.out.println("Try again.");
		}catch(InputMismatchException e) {
			System.out.println(e);
			input.nextLine();
			System.out.println("Try again.");
		}catch(Exception e) {
			System.out.println(e);
			input.nextLine();
			System.out.println("Try again.");
		}
	}
}
