import org.example.MyCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Caltest {
    @Test
    public void sumpass() {
        assertEquals("error in sum()",3,MyCalculator.sum(1,2));
        assertEquals("error in sum()",-3,MyCalculator.sum(-1,-2));
        assertEquals("error in sum()",9,MyCalculator.sum(9,0));
    }
    @Test
    public void testsumFail(){
        assertNotEquals("error in sum ",0,MyCalculator.sum(1,2));
    }
    @Test
    public void subpass(){
        assertEquals("error in sub()",1,MyCalculator.sub(2,1));
        assertEquals("error in sub()",-1,MyCalculator.sub(-2,-1));
        assertEquals("error in sub()",0,MyCalculator.sub(2,2));

    }
    @Test
    public void testSubFail() {
        assertNotEquals("error in sub()", 0, MyCalculator.sub(2, 1));
    }
}
