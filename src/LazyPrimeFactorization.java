import java.util.ArrayList;
import java.util.List;

public class LazyPrimeFactorization implements Runnable {
    private int currentNumber = 2;
    private List<Integer> primeNumbers = new ArrayList<Integer>();

    @Override
    public void run() {
        while (true) {
            if (isPrime(currentNumber)) {
                primeNumbers.add(currentNumber);
                System.out.println("LazyPrimeFactorization: " + currentNumber);
            }
            currentNumber++;
        }
    }

    private boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
