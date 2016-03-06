package tp3Number2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class mainTest
    extends TestCase
{
    addition add=new addition(2,3);
    public void testAddition() throws Exception {
        assertEquals(add.addNumbers(),5);


        division div=new division(6,3);
        public void testModulas() throws Exception {
            assertEquals(div.calDivision(),2);
        }

        modulas mod=new modulas(6,4);
        public void testModulas() throws Exception {
            assertEquals(mod.calModulas(),2);
        }

        multiplication mult=new multiplication(6,3);
        public void testMultiplication() throws Exception {
            assertEquals(mult.multiply(),18);
        }

        subtraction sub = new subtraction(2,3);
        public void testAddition() throws Exception {
            assertEquals(sub.subtractNumbers(),-1);
        }
}
