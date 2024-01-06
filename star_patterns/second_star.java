import java.util.Scanner;

class second_star {
  public static void main(String[] args) {
    System.out.println("reverse star");
    System.out.println("enter no of stars");
    try (Scanner stars = new Scanner(System.in)) {
      int star = stars.nextInt();

      for (int i = star; i >= 0; i--) {
        for (int j = i; j > 0; j--) {

          System.out.print("* ");
        }
        System.out.println(" ");
      }
    }
  }
}