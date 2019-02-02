public class recursion {
  public static double sqrt(double n) {
    if (n <= 0) {
      return 0;
    }
    return guess(n,1);
  }
  public static double guess(double n, double g) {
    if ((Math.abs(g*g-n) / n) < 0.000001) {
      return g;
    }
    return guess(n,(n/g+g)/2);
  }
}
