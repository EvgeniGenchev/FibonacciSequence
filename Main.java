package gencho;


import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        var f1 = new Fibonacci(new BigInteger("102"));
        var f2 = new Fibonacci(new BigInteger("100"));
        var f3 = new Fibonacci(new BigInteger("109"));
        var f4 = new Fibonacci(new BigInteger("103"));
        System.out.println(f1); // prints: Fibonacci{n = 102, value = Unknown}
        System.out.println(f2); // prints: Fibonacci{n = 100, value = Unknown}
        System.out.println(f3); // prints: Fibonacci{n = 109, value = Unknown}
        System.out.println();
        f2.value(); // numbers up to 100th cached
        System.out.println(f1); // prints: Fibonacci{n = 102, value = Unknown}
        System.out.println(f2); // prints: Fibonacci{n = 100, value = 354224848179261915075}
        System.out.println(f3); // prints: Fibonacci{n = 109, value = Unknown}
        System.out.println();
        f3.value(); // numbers up to 109th cached
        System.out.println(f1); // prints: Fibonacci{n = 102, value = 927372692193078999176}
        System.out.println(f2); // prints: Fibonacci{n = 100, value = 354224848179261915075}
        System.out.println(f3); // prints: Fibonacci{n = 109, value = 26925748508234281076009}
        System.out.println();


    }
}
