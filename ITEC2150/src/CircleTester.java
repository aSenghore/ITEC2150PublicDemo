
public class CircleTester {
	public static void main (String[] args) {
		Circle circle = new Circle();
		
		System.out.println("The radius of the circle is " + circle.getRadius());
		System.out.printf("The area of the circle is %.4f%n", circle.calculateArea());
	}
}
