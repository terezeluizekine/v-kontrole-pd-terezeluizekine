import java.math.BigInteger;

public class fibonacci {
    public static void main(String[] args) {

        BigInteger[] fib = new BigInteger[100];
        
        fib[0] = BigInteger.ZERO;
        fib[1] = BigInteger.ONE;
        
        for (int i = 2; i < 100; i++) {
            fib[i] = fib[i - 1].add(fib[i - 2]);
        }
        
        for (int i = 99; i >= 0; i--) {
            System.out.println(fib[i]);
        }
    }
}
