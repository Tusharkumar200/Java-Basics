import java.util.*;

public class LeftHalfPyramid {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int numRows = scanner.nextInt();
            System.out.println();
            for (int row = 1; row <= numRows; row++) {
                for (int space = 1; space <= numRows - row; space++) {
                    System.out.print("  ");
                }
                for (int star = 1; star <= row; star++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
} 