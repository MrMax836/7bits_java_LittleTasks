package array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PairSummaterTest {
    private PairSummater pairSum;
    @Before
    public void setUp() {
        this.pairSum = new PairSummater();
    }
    @Test
    public void testSum() throws ArraySummaterException {
        int[] original = {1, 2, 3, 4};
        int sum = this.pairSum.sum(original);
        assertEquals("wrong summater",
                7, sum);
    }
    @Test
    public void testNegativeSum() throws ArraySummaterException {
        int[] original = {-120, 2, -43, 4};
        int sum = this.pairSum.sum(original);
        assertEquals("wrong summater",
                -39, sum);
    }
}