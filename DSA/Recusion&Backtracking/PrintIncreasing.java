//? Print Numbers in increasing order using recursion

import java.util.Scanner;

public class PrintIncreasing {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in);) {
      int n = scanner.nextInt();
      printIncreasing(n);
      System.out.println();
    }
  }

  public static void printIncreasing(int n) {
    if (n == 0) {
      return;
    }
    printIncreasing(n - 1);
    System.out.printf("%d ", n);
  }
}
