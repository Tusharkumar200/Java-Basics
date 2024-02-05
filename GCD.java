import java.util.Scanner;

class GCD{
  public static void main(String[] args) {
    
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Enter first number");
      int num1 = input.nextInt();
      System.out.println("Enter second number");
      int num2 = input.nextInt();

      int gcd = gcd(num1,num2);
      System.out.println("GCD = "+ gcd);

      
    }
    
  }

  public static int gcd(int num1,int num2){
    int gcd=1;
    int least = least(num1,num2);
    int i =2;
    while(i<=least){
      if(num1 % i ==0 && num2 % i ==0){
         gcd =i;
        
      }
      i++;
    }
    return gcd;
  }

  public static int least(int num1 ,int num2){

      if(num1 < num2){
        int leastValue = num1;
        return leastValue;
      }
      else{
        int leastValue = num2;
        return leastValue;
      }
      
  }
}