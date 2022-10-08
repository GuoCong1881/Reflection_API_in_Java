package Annotation;


// TODO: Add @Test annotations to the unit test methods in this class.
public final class CalculatorTest implements UnitTest {

    private final Calculator calculator = new Calculator();

    @Override
    public void beforeEachTest() {
        calculator.registerOperation("+", (a, b) -> a + b);
        calculator.registerOperation("-", (a, b) -> a - b);
        calculator.registerOperation("/", (a, b) -> a / b);
        calculator.registerOperation("*", (a, b) -> a * b);
    }

    @Test
    public void testAddition() {
        assert calculator.calculate(1, "+", 1) == 2;
        // return calculator.calculate(1, "+", 1) == 2;
        System.out.println("test pass");
    }

    @Test
    public void testSubtraction() {
        assert calculator.calculate(45, "-", 43) == 0;
        //return calculator.calculate(45, "-", 43) == 0;
        System.out.println("test fail");
    }
}
