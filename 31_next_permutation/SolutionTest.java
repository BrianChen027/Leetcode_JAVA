import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    public void testNextPermutation() {
        Solution solution = new Solution();
        int[] nums1 = new int[]{1, 2, 3};
        solution.nextPermutation(nums1);
        assertArrayEquals(new int[]{1, 3, 2}, nums1);
        
        int[] nums2 = new int[]{3, 2, 1};
        solution.nextPermutation(nums2);
        assertArrayEquals(new int[]{1, 2, 3}, nums2);
    }
}