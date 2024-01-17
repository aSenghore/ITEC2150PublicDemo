
public class codingBatSumDigits {
	public static void main (String[] args) {
		codingBatSumDigits method = new codingBatSumDigits();
		System.out.println(method.sumDigits(0));
		System.out.println(method.sumDigits(1));
		System.out.println(method.sumDigits(9));
		System.out.println(method.sumDigits(126));
		System.out.println(method.sumDigits(49));
	}
	
	public int sumDigits(int n) {
		  int sum = 0;
		  int digit = 0;
		  while(n>0){
		    digit = n % 10;
		    sum+= digit;
		    n = n/10;
		  }
		  return sum;
		}

}
