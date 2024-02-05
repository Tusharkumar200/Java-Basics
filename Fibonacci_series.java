import java.util.Scanner;

public class Fibonacci_series {
  public static void main(String[] args) {
    System.out.print("Enter the number:");
    try ( Scanner input = new Scanner(System.in)){
        int num = input.nextInt();
         printingFibonacci(num);
       
    }
  }

  public static void printingFibonacci(int num){
    if(num <0 ) return;
    System.out.println("0");

    if(num == 0 ) return;
    System.out.println("1");

    int first =0 , second=1;

    while(first + second <=num){
      int third = first + second;
      System.out.println(third + " ");
      first = second;
      second = third;
    }
  }

}
