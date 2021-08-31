import java.util.Scanner;

public class Fibonacci {
  public double fibonacci(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    }

    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static void main(String[] args) {
    Fibonacci fib = new Fibonacci();
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o valor de n: ");
    int n = Integer.parseInt(sc.nextLine());

    System.out.println(fib.fibonacci(n));

    sc.close();
  }
}
