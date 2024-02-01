import java.util.Scanner;

public class factorial {
  public static void main(String[] args) {
    System.out.println("printing factorial of a number");
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("enter the number : ");
      
      long num = input.nextLong();
      
      System.out.println("Factorial is : "+factorials(num));
    }
}
  public static long factorials(long num){
    if (num < 2) {
      return 1;
    }
    long fact = 1;
    int i =2;
    while (i<= num){
      fact *=i;
      i++; 
    }
    return fact;
  }

}
