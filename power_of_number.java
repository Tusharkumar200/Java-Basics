import java.util.Scanner;

public class power_of_number {
  public static void main(String[] args) {
    power();
  }

  static int power() {
    System.out.println("power of number");
    try (Scanner number = new Scanner(System.in)) {
      System.out.println("Enter The Base Value: ");
      int Base = number.nextInt();
      System.out.println("Enter The Power Value: ");
      int Power = number.nextInt();
      System.out.println(Math.pow(Base, Power));
    }

    return 0;
  }
}
