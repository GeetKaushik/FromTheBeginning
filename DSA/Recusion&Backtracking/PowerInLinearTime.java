//? Find Power on the number i.e., pow(x, n) => x^n in Linear Time

import java.util.Scanner;

public class PowerInLinearTime {
  public static void main(String[] args) {
    try (Scanner scn = new Scanner(System.in)) {
      int x = scn.nextInt();
      int n = scn.nextInt();
      System.out.println(Power(x, n));
    }
  }
  public static int Power(int x, int n) {
    if (n == 0)
      return 1;
    return x * Power(x, n - 1);
  }
}
