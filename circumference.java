import java.util.Scanner;

public class circumference{
  public static void main(String[] args) {
    System.out.println("Enter the Radius");
    circle();

  }
  static float circle(){
    try (Scanner radius_input = new Scanner(System.in)) {
    
    float radius = radius_input.nextFloat();
    double pie = 3.14;
    double circumference= 2*pie*radius;
    
    System.out.println("the circumference of the circle is "+circumference);
    }
    return 0;
  }
}