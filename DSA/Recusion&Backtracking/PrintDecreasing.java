//? Print Numbers in decreasing order using recursion

import java.util.Scanner;

public class PrintDecreasing {
  public static void main(String[] args) {
    try (Scanner scn = new Scanner(System.in)) {
      int n = scn.nextInt();
      printDecreasing(n);
      System.out.println();
    }
  }

  public static void printDecreasing(int n) {
    if (n == 0) {
      return;
    }
    System.out.printf("%d ", n);
    printDecreasing(n - 1);
  }
}