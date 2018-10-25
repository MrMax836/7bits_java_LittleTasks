package array;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SimpleSummaterTest {
    private SimpleSummater simpleSum;
    @Before
    public void setUp() {
        this.simpleSum = new SimpleSummater();
    }
    @Test
    public void testSimpleSum() throws ArraySummaterException {
        int[] original = {1, 2, 3, 4};
        int sum = this.simpleSum.sum(original);
        assertEquals("wrong summater",
                10, sum);
    }
    @Test
    public void testNegativeSum() throws ArraySummaterException {
        int[] original = {-11, 2, -343, 4};
        int sum = this.simpleSum.sum(original);
        assertEquals("wrong summater",
                -348, sum);
    }
    @Test
    public void testZeroSum() throws ArraySummaterException {
        int[] original = {0, 0, 0, 0};
        int sum = this.simpleSum.sum(original);
        assertEquals("wrong summater",
                0, sum);
    }
}
