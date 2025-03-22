import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testSabiranjePozitivniBrojevi() {
        Calculator calculator = new Calculator();
        String result = calculator.Run("2+2");
        assertEquals("4.0", result);
    }

    @Test
    public void testSabiranjeNegativniBrojevi() {
        Calculator calculator = new Calculator();
        String result = calculator.Run("-2-2");
        assertEquals("-4.0", result);
    }

    @Test
    public void testSabiranjePozitivniNegativniBrojevi() {
        Calculator calculator = new Calculator();
        String result = calculator.Run("2-2");
        assertEquals("0.0", result);
    }

    @Test
    public void testOduzimanjePozitivniBrojevi() {
        Calculator calculator = new Calculator();
        String result = calculator.Run("5-3");
        assertEquals("2.0", result);
    }

    @Test
    public void testOduzimanjeNegativniBrojevi() {
        Calculator calculator = new Calculator();
        String result = calculator.Run("-5-3");
        assertEquals("-8.0", result);
    }

    @Test
    public void testOduzimanjePozitivniNegativniBrojevi() {
        Calculator calculator = new Calculator();
        String result = calculator.Run("5-(-3)");
        assertEquals("8.0", result);
    }

    @Test
    public void testMnozenjePozitivniBrojevi() {
        Calculator calculator = new Calculator();
        String result = calculator.Run("4*5");
        assertEquals("20.0", result);
    }

    @Test
    public void testMnozenjeNegativniBrojevi() {
        Calculator calculator = new Calculator();
        String result = calculator.Run("-4*-5");
        assertEquals("20.0", result);
    }

    @Test
    public void testMnozenjePozitivniNegativniBrojevi() {
        Calculator calculator = new Calculator();
        String result = calculator.Run("4*-5");
        assertEquals("-20.0", result);
    }

    @Test
    public void testDeljenjePozitivniBrojevi() {
        Calculator calculator = new Calculator();
        String result = calculator.Run("10/2");
        assertEquals("5.0", result);
    }

    @Test
    public void testDeljenjeNegativniBrojevi() {
        Calculator calculator = new Calculator();
        String result = calculator.Run("-10/-2");
        assertEquals("5.0", result);
    }

    @Test
    public void testDeljenjePozitivniNegativniBrojevi() {
        Calculator calculator = new Calculator();
        String result = calculator.Run("10/-2");
        assertEquals("-5.0", result);
    }

    @Test
    public void testDeljenjeSaNulom() {
        Calculator calculator = new Calculator();
        String result = calculator.Run("10/0");
        assertEquals("ERROR", result);
    }

    @Test
    public void testBeskonacniBrojevi() {
        Calculator calculator = new Calculator();
        String result = calculator.Run("5+∞");
        assertEquals("∞", result);
    }
}
