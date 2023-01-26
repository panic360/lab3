import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
    public void testReverseInPlace() {
        int[] input1 = new int[] {1,2,3,4,5};
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{5,4,3,2,1}, input1);
    }

    @Test
    public void testReversed() {
        int[] input1 = { 1,2,3,4,5 };
        assertArrayEquals(new int[]{5,4,3,2,1},ArrayExamples.reversed(input1));
    }

    @Test
    public void testAverageWithoutLowest() {
        double[] input1 = {4,4,4,4,5};
        assertEquals(4.25, ArrayExamples.averageWithoutLowest(input1), 0.0001);
    }
}
