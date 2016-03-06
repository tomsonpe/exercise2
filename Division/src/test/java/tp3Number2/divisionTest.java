package tp3Number2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class divisionTest
    extends TestCase
{
    division div=new division(6,3);
    public void testModulas() throws Exception {
        assertEquals(div.calDivision(),2);
    }
}
