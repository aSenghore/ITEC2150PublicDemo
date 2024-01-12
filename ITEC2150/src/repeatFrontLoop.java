
public class repeatFrontLoop {
	public static void main(String[] args) {
		repeatFrontLoop chocolate = new repeatFrontLoop();
		
		System.out.println(chocolate.repeatFrontWhile("Chocolate", 4));
		System.out.println(chocolate.repeatFrontFor("Chocolate",3));
		System.out.println(chocolate.repeatFrontDoWhile("Ice Cream", 2));
	}
	
	public String repeatFrontWhile(String str, int n) {
		String newString = "";
		int i = n;
		while(i >= 0) {
			newString += str.substring(0,i);
			i--;
		}
		return newString;
	}

	public String repeatFrontFor(String str, int n) {
		String newString = "";
		for(int i = n; i >= 0; i--) {
			newString += str.substring(0,i);
		}
		return newString;
	}

	public String repeatFrontDoWhile(String str, int n) {
		String newString = "";
		int i = n;
		do {
			newString += str.substring(0,i);
			i--;
		}while (i > 0);
		return newString;
	}
}

