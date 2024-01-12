import java.util.Scanner;

public class LoopPractice {
	public static void main (String[] args) {
		for(int i = 2;i<=10;i+=1) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		Scanner input = new Scanner(System.in);
		for(int n = 0; n >= 0;) {
			System.out.println("Give me a new integer:");
			int newNum = input.nextInt();
			if (newNum < 0) {
				System.out.println("End test");
				break;
			}//
		}
		
	}
}
