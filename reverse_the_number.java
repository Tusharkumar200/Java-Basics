import java.util.Scanner;

public class reverse_the_number {
  public static void main(String[] args) {
    System.out.print("enter the number :");
    try (Scanner input = new Scanner(System.in)) {
      int num = input.nextInt();
      int reverse = reverse(num);
      System.out.println("Reverse of your number is : " + reverse);
    }
  }
  static int reverse(int num){
    int newNum =0;
    
    while(num >0){
       int digit = num%10;
       newNum = newNum * 10 + digit;
      num/=10;
     

    }


    return newNum;
  }
}
