package tp3Number2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class subtractionTest
    extends TestCase
{
    subtraction sub = new subtraction(2,3);
    public void testAddition() throws Exception {
        assertEquals(sub.subtractNumbers(),-1);
    }
}
