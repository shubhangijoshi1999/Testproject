import static org.junit.Assert.assertEquals;

import org.example.Calculator;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+2");
        assertEquals(6, sum);
    }
}
