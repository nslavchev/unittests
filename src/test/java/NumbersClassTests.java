import static org.junit.Assert.*;
import org.junit.Test;

public class NumbersClassTests {
    @Test
    public void testIsOddNumber() {
        NumbersClass numbersClass = new NumbersClass();

        assertTrue(numbersClass.isOdd(5));
    }

    @Test
    public void testIsPrimeNumber() {
        NumbersClass numbersClass = new NumbersClass();

        assertFalse(numbersClass.isPrime(4));
        assertTrue(numbersClass.isPrime(5));
    }

    @Test
    public void testMinElement() {
        NumbersClass numbersClass = new NumbersClass();

        int element = numbersClass.minElement(new int[]{4,2,3,5,1});

        assertEquals(1, element);
    }

    @Test
    public void testKthMinElement() {
        NumbersClass numbersClass = new NumbersClass();

        int element = numbersClass.kthMinElement(2, new int[]{4,2,3,5,1});

        assertEquals(2, element);
    }

    @Test
    public void testElementWithOddOccurrence() {
        NumbersClass numbersClass = new NumbersClass();

        int element = numbersClass.elementWithOddOccurrence(new int[]{1,2,3,3,3,4,5});

        assertEquals(3, element);
    }

    @Test
    public void testAverageOfArray() {
        NumbersClass numbersClass = new NumbersClass();

        int element = numbersClass.averageOfArray(new int[]{1,2,3,4,5});

        assertEquals(3, element);
    }

    @Test
    public void testGetApowB() {
        NumbersClass numbersClass = new NumbersClass();

        assertEquals(27, numbersClass.getApowB(3,3));
    }

    @Test
    public void testLcm() {
        NumbersClass numbersClass = new NumbersClass();

        assertEquals(420, numbersClass.lcm(7));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDoubleFactorials() {
        NumbersClass numbersClass = new NumbersClass();

        assertEquals(720, numbersClass.doubleFactorial(3));
        numbersClass.doubleFactorial(4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaximalScalarProduct() {
        NumbersClass numbersClass = new NumbersClass();

        assertEquals(32, numbersClass.maximalScalarProduct(new int[]{2, 3, 1},new int[]{5, 6, 4}));
        numbersClass.maximalScalarProduct(new int[]{2, 3, 1, 0},new int[]{5, 6, 4});
    }

    @Test()
    public void testMaxSpan() {
        NumbersClass numbersClass = new NumbersClass();

        assertEquals(6, numbersClass.maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4}));
    }

    @Test
    public void testHasEqualSideSums(){
        NumbersClass numbersClass = new NumbersClass();

        assertTrue(numbersClass.hasEqualSideSums(new int[]{2, 1, 2, 3, 1, 4}));
    }
}
