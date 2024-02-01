import java.util.Scanner;

class sum_of_all_odd_number{
  public static void main(String[] args) {
    System.out.println("printing sum of odd number");
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("enter the number : ");
      int num = input.nextInt();
      int sum = number(num);
      System.out.println("Sum of all odd number  till "+ num +" is " + sum);
    
    }
  }
  static int number(int num){
      int sum =0;
      int i=1;
      while(i<=num){
        sum +=i;
        i +=2;
      }      
      return sum;
  }
}