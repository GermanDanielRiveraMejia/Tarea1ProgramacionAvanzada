import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraAreasTest {
    CalculadoraAreas calc = new CalculadoraAreas();

    @Test
    public void testAreaCirculo() {
        assertEquals(78.54, calc.areaCirculo(5), 0.01);
        assertEquals(314.16, calc.areaCirculo(10), 0.01);
        assertTrue(calc.areaCirculo(0) == 0);
    }

    @Test
    public void testAreaCuadrado() {
        assertEquals(25, calc.areaCuadrado(5));
        assertEquals(100, calc.areaCuadrado(10));
        assertNotEquals(0, calc.areaCuadrado(3));
    }

    @Test
    public void testAreaRectangulo() {
        assertEquals(20, calc.areaRectangulo(4, 5));
        assertEquals(50, calc.areaRectangulo(10, 5));
        assertTrue(calc.areaRectangulo(0, 5) == 0);
    }

    @Test
    public void testAreaTriangulo() {
        assertEquals(10, calc.areaTriangulo(4, 5));
        assertEquals(25, calc.areaTriangulo(10, 5));
        assertFalse(calc.areaTriangulo(3, 6) == 0);
    }
}