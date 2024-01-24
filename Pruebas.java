import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class Pruebas {

    @Test
    public void testSumar() {
        ICalculadora calculadora = new Calculadora();
        double resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado, 0.0001);
    }

    @Test
    public void testRestar() {
        ICalculadora calculadora = new Calculadora();
        double resultado = calculadora.restar(5, 3);
        assertEquals(2, resultado, 0.0001);
    }

    @Test
    public void testMultiplicar() {
        ICalculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicar(2, 4);
        assertEquals(8, resultado, 0.0001);
    }

    @Test
    public void testDividirPorCero() {
        ICalculadora calculadora = new Calculadora();
        // Este caso debería fallar porque estamos dividiendo por cero
        assertThrows(ArithmeticException.class, () -> {
            double resultado = calculadora.dividir(8, 0);
        });
    }
}