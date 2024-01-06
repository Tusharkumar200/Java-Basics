import java.util.Scanner;

class first_star{
  public static void main(String[] args) {
    System.out.println("enter no of stars");
    try (Scanner stars = new Scanner(System.in)) {
      int star = stars.nextInt();

      for (int i=1; i<=star;i++){
        for(int j = 1; j<i ;j++){

          System.out.print("* ");
        }
        System.out.println(" ");
      }
    }
  }
}