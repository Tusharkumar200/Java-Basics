import java.util.Scanner;

public class ArmstrongNumber {
  public static void main(String[] args) {
    try(Scanner input = new Scanner(System.in)){
      System.out.println("Enter the number : ");
      int num = input.nextInt();
      boolean isArmstrong = isArmstrong(num);

      if(isArmstrong){
        System.out.println("your number is Armstrong number");
      }
      else{
        System.out.println("your number is not a  Armstrong number");
      }
    }
  }

  static boolean isArmstrong(int num){
    int noOfdigits = noOfDigits(num);
    int numCopy =num;
    int finalNumber =0;
    while (num >0){
      int lastdigit = num%10;
      num /=10;
      finalNumber += pow(lastdigit,noOfdigits);
    }
    return finalNumber == numCopy;
  }

  static int pow(int num1,int num2){
    int result =1;

      int i=0;
      while(i <num2){
        result *= num1;
        i++;
      }
    return result;



  }

  public static int noOfDigits(int num){
    int digits = 0;
    while (num >0) {
      digits++;
      num /= 10;
      
    }
    return digits; 
  }
}
