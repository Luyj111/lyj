import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;
public class ComplexTest extends TestCase {
    Complex c1 = new Complex(0, 3);
    Complex c2 = new Complex(-1, -1);
    Complex c3 = new Complex(2,1);
    @Test
    public void testgetRealPart() throws Exception {
        assertEquals(-1.0, new Complex().setA(-1.0));
        assertEquals(5.0, new Complex().setA(5.0));
        assertEquals(0.0, new Complex().setA(0.0));
    }
    @Test
    public void testComplexAdd() throws Exception {
        assertEquals("-1.0+2.0i", c1.ComplexAdd(c2).toString());
        assertEquals("2.0+4.0i", c1.ComplexAdd(c3).toString());
        assertEquals("1.0", c2.ComplexAdd(c3).toString());
    }
    @Test
    public void testComplexSub() throws Exception {
        assertEquals("-1.0 -4.0i", c1.ComplexMinus(c2).toString());
        assertEquals("2.0 -2.0i", c1.ComplexMinus(c3).toString());
        assertEquals("3.0+2.0i", c2.ComplexMinus(c3).toString());
    }
}
