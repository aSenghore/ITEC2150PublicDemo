
public class ArrayPractice {
	public static void main (String[] args) {
		ArrayPractice arrayP = new ArrayPractice();
		int[] intArray = new int[] {5,10,15,20,25};
		int i = 0;
		int total = 0;
		while (i < intArray.length){
			System.out.println(intArray[i]);
			total += intArray[i];
			i++;
		}
		System.out.println("The total is " + total);
		
		System.out.println("The max is " + arrayP.maxCalc(intArray));
	}
	
	public int maxCalc(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]> max) {
				max = arr[i];
			}
		}
		return max;
	}
}

