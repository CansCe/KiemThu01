import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNextDay {

    @Test
    public void testNextDay() {
        NextDay nextDay = new NextDay();

        // Test case: 31st December 2020
        String result = nextDay.nextDay(31, 12, 2020);
        assertEquals("Next date: 1/1/2021", result);

        // Test case: 28th February 2020 (leap year)
        result = nextDay.nextDay(28, 2, 2020);
        assertEquals("Next date: 29/2/2020", result);

        // Test case: 28th February 2021 (non-leap year)
        result = nextDay.nextDay(28, 2, 2021);
        assertEquals("Next date: 1/3/2021", result);

        // Test case: invalid date
        result = nextDay.nextDay(30, 2, 2021);
        assertEquals("Invalid date", result);
    }
}