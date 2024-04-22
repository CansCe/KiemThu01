import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTamGiac {

    @Test
    public void testTamGiac() {
        TamGiac tamGiac = new TamGiac();

        // Test case: Equilateral triangle
        String result = tamGiac.TriangleType(5, 5, 5);
        assertEquals("Equilateral", result);

        // Test case: Isosceles triangle
        result = tamGiac.TriangleType(5, 5, 3);
        assertEquals("Isosceles", result);

        // Test case: Scalene triangle
        result = tamGiac.TriangleType(3, 4, 5);
        assertEquals("RightTriangle", result);

        // Test case: Not a triangle
        result = tamGiac.TriangleType(1, 2, 3);
        assertEquals("Not a Triangle", result);
    }
}