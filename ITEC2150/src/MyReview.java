
public class MyReview {
	public static void main(String[] args) {
		MyReview reverse = new MyReview();
		System.out.println(reverse.reverseDoubleChar("The"));
		System.out.println(reverse.reverseDoubleChar2("AABB"));
		System.out.println(reverse.reverseDoubleChar3("String"));
	}
	
	public String reverseDoubleChar(String word){
		String result = "";
		for(int i = word.length()-1; i >= 0 ; i--){
			result += (word.charAt(i));
			result += (word.charAt(i));
			}
		return result;
	}

	public String reverseDoubleChar2(String word){
		String result = "";
		for(int i = word.length()-1 ; i >= 0; i--){
			result += (word.charAt(i));
			result += (word.charAt(i));
			}
		return result;
	}

	public String reverseDoubleChar3(String word){
		String result = "";
		for(int i = word.length() - 1 ; i >= 0 ; i--){
			result = result + word.charAt(i) + word.charAt(i) ;
			}
		return result;
	}
}

