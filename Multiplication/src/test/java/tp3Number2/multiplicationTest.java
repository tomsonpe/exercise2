package tp3Number2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class multiplicationTest
    extends TestCase
{
    multiplication mult=new multiplication(6,3);
    public void testMultiplication() throws Exception {
        assertEquals(mult.multiply(),18);
    }
}
