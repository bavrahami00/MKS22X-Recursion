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
  public static int fib(int n) {
    return fib(n,0,1,0);
  }
  public static int fib(int n, int one, int two, int time) {
    if (time == n) {
      return one;
    }
    return fib(n,two,one+two,time+1);
  }
}
