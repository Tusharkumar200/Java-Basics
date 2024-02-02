import java.util.Scanner;

public class SumOfDigits {
  public static void main(String[] args) {
    System.out.println("sum of the Digits");
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Enter a number");
      int num = input.nextInt();
      int sum = Digits(num);
      System.out.println("Sum is: "+sum);
    }
  }

  public static int Digits(int num){
    int sum=0;
    while(num>0){
      sum +=num%10;
      num /=10;
    }
     return sum;
  }
}
