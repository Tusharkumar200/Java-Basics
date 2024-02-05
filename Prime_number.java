import java.util.Scanner;

public class Prime_number {
  public static void main(String [] args){
        
        System.out.print("enter the number :");
        try(Scanner input = new Scanner(System.in)){
          
          int number = input.nextInt();
          boolean num = prime(number);
          
          if(num){
            System.out.println("your number is prime");
          }
          else{
            System.out.println("Your number is not prime ");
          }
        }

  }

   static boolean prime(int num){
    
    for(int i=2;num>i;i++){

      if(num%i==0){
        System.out.println(" not prime number");
        return false;
      }
    
    }
     
    return true;
  }


}
