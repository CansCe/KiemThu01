import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import java.util.Random;

public class PrimeCheckerTest {

    @Test
    void testRandomNumbers() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(1000); // Generate random number between 0 and 999
            boolean expected = isPrime(randomNumber);
            assertEquals(expected, PrimeChecker.isPrime(randomNumber));
        }
    }

    // Helper method to check if a number is prime
    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
