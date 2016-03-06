package tp3Number2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class additionTest
    extends TestCase
{
    addition add=new addition(2,3);
    public void testAddition() throws Exception {
        assertEquals(add.addNumbers(),5);
    }
}
