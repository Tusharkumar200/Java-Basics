import java.util.Scanner;

public class LCM_Of_Two_Number {
  public static void main(String[] args) {
   try(Scanner input = new Scanner(System.in)){
    System.out.print("Enter the first number: ");
    int first=input.nextInt();
    System.out.print("Enter the first number: ");
    int second=input.nextInt();
    int lcm =lcm(first,second);
    System.out.println("LCM Of Two Number is : "+lcm); 
   }
  }
   public static int lcm(int first,int second){
    
    for(int i=1;true;i++){
      int table= first *i;
      if(table %second==0){

        return table;
        
      }
    }
    
  }
}
