
public class Circle {
	private double radius;
	  private static double PI = 3.1415;
	  
	  public Circle() {
	    this.radius = 5.0; 
	  }
	  
	  public double getRadius( ) {
	    return this.radius;
	  }
	  
	  public double calculateArea() {
	    return PI * (this.radius * this.radius);
	  }
}
