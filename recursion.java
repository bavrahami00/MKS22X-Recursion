import java.util.ArrayList;
public class recursion {
  public static void main(String[] args) {
    System.out.println("\nTesting sqrt");
    System.out.println("sqrt(0) should be 0: " + recursion.sqrt(0));
    System.out.println("sqrt(1) should be 1: " + recursion.sqrt(1));
    System.out.println("sqrt(10) should be ~3.16: " + recursion.sqrt(10));
    System.out.println("sqrt(100) should be 10: " + recursion.sqrt(100));
    System.out.println("\nTesting fib");
    System.out.println("fib(0) should be 0: " + recursion.fib(0));
    System.out.println("fib(1) should be 1: " + recursion.fib(1));
    System.out.println("fib(3) should be 2: " + recursion.fib(3));
    System.out.println("fib(10) should be 55: " + recursion.fib(10));
    System.out.println("fib(45) should be 1134903170: " + recursion.fib(45));
    System.out.println("\nTesting makeAllSums");
    ArrayList<Integer> a = recursion.makeAllSums(0);
    System.out.println("makeAllSums(0) should be 0: ");
    for (int x = 0; x < a.size(); x++) {
      System.out.print(a.get(x)+",");
    }
    System.out.println();
    a = recursion.makeAllSums(3);
    System.out.println("makeAllSums(3) should be 0-6: ");
    for (int x = 0; x < a.size(); x++) {
      System.out.print(a.get(x)+",");
    }
    System.out.println();
    a = recursion.makeAllSums(10);
    System.out.println("makeAllSums(10) should be 0-55: ");
    for (int x = 0; x < a.size(); x++) {
      System.out.print(a.get(x)+",");
    }
    System.out.println();
  }
  public static double sqrt(double n) {
    return sqrt(n,0.0001);
  }
  public static double sqrt(double n, double tol) {
    if (n <= 0) {
      return 0;
    }
    return guess(n,1,tol);
  }
  private static double guess(double n, double g, double tol) {
    if ((Math.abs(g*g-n) / n) < tol) {
      return g;
    }
    return guess(n,(n/g+g)/2,tol);
  }
  public static int fib(int n) {
    return fib(n,0,1,0);
  }
  private static int fib(int n, int one, int two, int time) {
    if (time == n) {
      return one;
    }
    return fib(n,two,one+two,time+1);
  }
  public static ArrayList<Integer> makeAllSums(int n) {
    if (n < 0) {
      return makeAllSums(-n);
    }
    if (n == 0) {
      ArrayList<Integer> a = new ArrayList<Integer>();
      a.add(0);
      return a;
    }
    ArrayList<Integer> b = makeAllSums(n-1);
    int k = b.size();
    for (int x = 0; x < k; x++) {
      b.add(n+b.get(x));
    }
    return b;
  }
}
