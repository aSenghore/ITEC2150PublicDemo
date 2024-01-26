/**Given the length, width and height of the room, number of windows and number doors,
the program will calculate the gallons and quarts of paint are needed to paint the room. 
For gallons, print an integer value. For the quarts, print a real number, no need to round down to integer.

Assume that (1) ceiling is painted, (2) 1 gallon of paint covers about 350 square feet, 
(3) each window is 15 square feet, and (4) each door is 21 square feet.
 */
public class houseConstruct {

	private int hLength;
	private int hWidth;
	private int hHeight;
	private int windows;
	private int doors;
	
	public houseConstruct(int hLength, int hWidth, int hHeight, int windows, int doors) {
		this.hLength = hLength;
		this.hWidth = hWidth;
		this.hHeight = hHeight;
		this.windows = windows;
		this.doors = doors;
	}
//
//calculate
	public int paintGallon() {
		int totalcount = (2*(this.hLength*this.hWidth)) + (2*(this.hLength*this.hHeight)) + (2*(this.hHeight*this.hWidth)) - (this.windows*15) - (this.doors*21);
		int gallons = totalcount/350;
		return gallons;
	}
	public double paintQuarts() {
		int totalcount = (2*(this.hLength*this.hWidth)) + (2*(this.hLength*this.hHeight)) + (2*(this.hHeight*this.hWidth)) - (this.windows*15) - (this.doors*21);
		double gallonsremainder = totalcount%350;
		double quarts = gallonsremainder*4;
		return quarts;
	}	
	public String toString() {
		return "L: " + this.hLength + ", W: " + this.hWidth +  ", H: " + this.hHeight + ", windows: " + this.windows + ", doors:" +  this.doors;
	}
}