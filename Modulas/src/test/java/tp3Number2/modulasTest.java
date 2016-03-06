package tp3Number2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class modulasTest
    extends TestCase
{
    modulas mod=new modulas(6,4);
    public void testModulas() throws Exception {
        assertEquals(mod.calModulas(),2);
    }
}
