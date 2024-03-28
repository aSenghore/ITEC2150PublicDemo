package ExceptionHandlingBasic;

import java.util.*;

public class SumExceptionHandling2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		do {
		try {
			System.out.println("Enter two integers: ");
			int num1 = input.nextInt(), num2 = input.nextInt();
			sum = num1 + num2;
			
		}catch(InputMismatchException ex) {
			System.out.println("Error: Input Mismatch Exceptions is occured");
			input.nextLine();
		}
		}while(true);
	}
}
