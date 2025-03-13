import static org.junit.jupiter.api.Assertions.assertEquals;


import org.testng.annotations.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3)); //ya
    }
    //sal
}
