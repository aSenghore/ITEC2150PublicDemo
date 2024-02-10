package Exercises1_9;

public class TextbookTester {
	public static void main(String[] args) {
		Textbook textbook1 = new Textbook();
		Textbook textbook2 = new Textbook("History", 2024, "RCook", 1018);
		Textbook textbook3 = new Textbook("Science", 2018, "Logicals", 658);
		
		System.out.println(textbook1);
		System.out.println(textbook2);
		System.out.println(textbook3);
		
		System.out.println(textbook1.outdated());
		System.out.println(textbook2.outdated());
		System.out.println(textbook3.outdated());
	}
}
