import java.util.Scanner;

public class PowerInLogarithmicTime {
  public static int Power(int x, int n) {
    if (n == 0)
      return 1;
    if (n % 2 != 0)
      return x * Power(x, n / 2) * Power(x, n / 2);
    return Power(x, n / 2) * Power(x, n / 2);
  }

  public static void main(String[] args) {
    try (Scanner scn = new Scanner(System.in)) {
      int x = scn.nextInt();
      int n = scn.nextInt();
      System.out.println(Power(x, n));
    }
  }
}