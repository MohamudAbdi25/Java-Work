
public class AreaLauncher {

	public static void main(String[] args) {

	    // Area of a circle
	    System.out.printf("The area of a circle with a "
	            + "radius of 2.0 is %6.2f\n", Area.getArea(2.0));

	    // Area of a rectangle
	    System.out.printf("The area of a rectangle with a "
	            + "length of 10 and a width of 3 is %6.2f\n",
	            Area.getArea(10, 3));

	    // Area of cylinder
	    System.out.printf("The area of a cylinder with a "
	            + "radius of 12.0 and a height " + "of 10.0 is %6.2f\n",
	            Area.getArea(12.0, 10.0));
	}
}
