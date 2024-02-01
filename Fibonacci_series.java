import java.util.Scanner;

public class Fibonacci_series {
  public static void main(String[] args) {
    System.out.print("Enter the number: ");
    try ( Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
      System.out.println( n + "th Fibonacci Number: " + fib(n));
    }
  }

  static int fib(int number) {

    if (number <= 1) {
      return number;
    }
    return fib(number - 1) + fib(number - 2);
  }
}
