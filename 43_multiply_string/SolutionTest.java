import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testMultiply() {
        Solution solution = new Solution();
        assertEquals("56088", solution.multiply("123", "456"));
        assertEquals("6", solution.multiply("2", "3"));
    }
}