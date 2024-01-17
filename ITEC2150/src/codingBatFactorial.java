
public class codingBatFactorial {
	public static void main (String[] args) {
		codingBatFactorial method = new codingBatFactorial();
		System.out.println(method.factorial(2));
		System.out.println(method.factorial(4));
		System.out.println(method.factorial(20));
		System.out.println(method.factorial(10));
		System.out.println(method.factorial(8));
	}
	
	public long factorial(int number){
		  int i = number;
		  int fact = 1;
		  for(int n = 1; n <= i; n++){
		    fact = fact * n;
		  }
		  return fact;
		}
}
