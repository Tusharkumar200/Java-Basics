import java.util.Scanner;

public class PalindromeNumber {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("enter the number :");

      int num = input.nextInt();
      boolean isPalindrome = isPalindrome(num);

      if (isPalindrome) {
        System.out.println("your number is Palindrome number");
      } else {
        System.out.println("your number is not a  Palindrome number");
      }
    }
  }

  static boolean isPalindrome(int num) {
    return num == reverse(num);
  }

  static int reverse(int num) {
    int newNum = 0;

    while (num > 0) {
      int digit = num % 10;
      newNum = newNum * 10 + digit;
      num /= 10;

    }

    return newNum;
  }
}
