import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSumArrayTest {

    @BeforeEach
    void setUp() {
        System.out.println("MaxSumArrayTest.setUp");
    }

    @AfterEach
    void tearDown() {
        System.out.println("MaxSumArrayTest.tearDown");
    }

    @Test
    void getMaxSum() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = MaxSumArray.getMaxSum(nums);
        System.out.println("max sum is :" + maxSum);
        assertEquals(6, maxSum);

        nums = new int[]{1};
        maxSum = MaxSumArray.getMaxSum(nums);
        System.out.println("max sum is :" + maxSum);
        assertEquals(1, maxSum);

        nums = new int[]{5,4, -1, 7, 8};
        maxSum = MaxSumArray.getMaxSum(nums);
        System.out.println("max sum is :" + maxSum);
        assertEquals(23, maxSum);
    }
}