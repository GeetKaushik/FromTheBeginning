//? Print Numbers in decreasing then increasing order using recursion


import java.util.Scanner;

public class PrintDecreasingIncreasing {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();
      printDecreasingIncreasing(n);
    }
    System.out.println();
  }

  public static void printDecreasingIncreasing(int n) {
    if (n == 0) {
      return;
    }
    System.out.printf("%d ", n);
    printDecreasingIncreasing(n - 1);
    System.out.printf("%d ", n);

  }
}
