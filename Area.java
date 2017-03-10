public class Area {

   
     // Method should calculate the area of a circle
    public static double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    //Method should calculate the area of a rectangle
  public static double getArea(int length, int width) {
        return length * width;
    }

   // Method should calculate the area of a cylinder
  
    public static double getArea(double radius, double height) {
        return Math.PI * radius * radius * height;
    }
}