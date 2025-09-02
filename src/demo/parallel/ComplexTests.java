package demo.parallel;


//package src.demo.parallel;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ComplexTests {
    private static final double EPSILON = 2e-8;

    @Test
    public void testSubtraction() {
        Complex a = new Complex(7.0, 5.0);
        Complex b = new Complex(2.0, 3.0);
        Complex result = new Complex(a.getRe(), a.getIm()).minus(b);

        assertEquals(5.0, result.getRe(), EPSILON);
        assertEquals(2.0, result.getIm(), EPSILON);
    }

    @Test
    public void testDivision() {
        Complex a = new Complex(3.0, 2.0);
        Complex b = new Complex(1.0, 1.0);
        Complex result = new Complex(a.getRe(), a.getIm()).divide(b);

        assertEquals(2.5, result.getRe(), EPSILON);
        assertEquals(-0.5, result.getIm(), EPSILON);
    }
}