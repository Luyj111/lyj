import junit.framework.TestCase;
import org.junit.Test;
public class StringBufferDemoTest extends TestCase {
    StringBuffer a = new StringBuffer("StringBuffer");
    StringBuffer b = new StringBuffer("StringBufferStringBuffer");
    StringBuffer c = new StringBuffer("StringBufferStringBufferStringBuffer");
    @Test
    public void testindexOf() {
        assertEquals(0,a.indexOf("Str"));
        assertEquals(3,b.indexOf("ing"));
        assertEquals(6,c.indexOf("Buffer"));
    }
    @Test
    public void testcharAt() {
        assertEquals('S',a.charAt(0));
        assertEquals('e',b.charAt(10));
        assertEquals('f',c.charAt(20));
    }
    @Test
    public void testcapacity() {
        assertEquals(28,a.capacity());
        assertEquals(40,b.capacity());
        assertEquals(52,c.capacity());
    }
    @Test
    public void testlength() {
        assertEquals(12,a.length());
        assertEquals(24,b.length());
        assertEquals(36,c.length());
    }

}
