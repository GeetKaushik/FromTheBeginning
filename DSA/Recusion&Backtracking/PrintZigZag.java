import java.util.Scanner;

public class PrintZigZag {
  public static void printZigZag(int n) {
    if (n == 0)
      return;
    System.out.println("Pre" + n);
    printZigZag(n - 1);
    System.out.println("In" + n);
    printZigZag(n - 1);
    System.out.println("Post" + n);
  }

  public static void main(String[] args) {
    try (Scanner scn = new Scanner(System.in)) {
      int n = scn.nextInt();
      printZigZag(n);
    }
  }
}
