import java.util.Scanner;

public class triangle_star {
  public static void main(String[] args) {
    System.out.println("Enter Number ");
    try (Scanner stars = new Scanner(System.in)) {
      int star = stars.nextInt();
      for (int i = 1; i <= star; i++) {
        for (int j = 1; j <= star - i; j++) {

          System.out.print(" ");
        }
        for (int k = 1; k <= i; k++) {

          System.out.print("* ");
        }
        System.out.println();
      }

    }
  }
}
