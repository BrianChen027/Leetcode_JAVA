import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testDivide() {
        Solution solution = new Solution();
        assertEquals(3, solution.divide(10, 3));
        assertEquals(-2, solution.divide(7, -3));
    }
}