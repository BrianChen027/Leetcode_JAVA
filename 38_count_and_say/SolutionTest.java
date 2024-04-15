import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testCountAndSay() {
        Solution solution = new Solution();
        assertEquals("1211", solution.countAndSay(4));
        assertEquals("1", solution.countAndSay(1));
    }
}