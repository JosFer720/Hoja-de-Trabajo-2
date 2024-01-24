import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Pruebas {

    @Test
    void testSumar() {
        ICalculadora calculadora = new Calculadora();
        double resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado, 0.0001);
    }

    @Test
    void testRestar() {
        ICalculadora calculadora = new Calculadora();
        double resultado = calculadora.restar(5, 3);
        assertEquals(2, resultado, 0.0001);
    }

    @Test
    void testMultiplicar() {
        ICalculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicar(2, 4);
        assertEquals(8, resultado, 0.0001);
    }

    @Test
    void testDividirPorCero() {
        ICalculadora calculadora = new Calculadora();
        // Este caso debería fallar porque estamos dividiendo por cero
        assertThrows(ArithmeticException.class, () -> {
            double resultado = calculadora.dividir(8, 0);
        });
    }
}


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    void testPushAndPop() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    void testPopFromEmptyStack() {
        Stack<String> stack = new Stack<>();
        // Este caso debería fallar porque estamos intentando hacer pop de una pila vacía
        assertThrows(NullPointerException.class, stack::pop);
    }

    @Test
    void testIsEmpty() {
        Stack<Character> stack = new Stack<>();
        assertTrue(stack.isEmpty());
        stack.push('A');
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    void testPushNull() {
        Stack<Double> stack = new Stack<>();
        // Este caso debería fallar porque estamos intentando hacer push con un valor nulo
        assertThrows(NullPointerException.class, () -> stack.push(null));
    }
}


import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class PrincipalTest {

    @Test
    void testRealizarOperacionesDesdeArchivo() {
        // Crear un archivo de prueba con operaciones y pasar su nombre como argumento
        String archivoPrueba = "archivo_prueba.txt";
        String contenido = "2 3 + 4 * 5 - 3 * 9 +\n1 2 - 4";
        UtilidadesArchivo.escribirArchivo(archivoPrueba, contenido);

        // Redirigir la salida estándar para capturarla en un ByteArrayOutputStream
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Ejecutar el método y verificar la salida
        String[] args = {archivoPrueba};
        Principal.main(args);

        assertEquals("Resultados actuales en la pila:\n29.0\n-3.0\n", outContent.toString());

        // Restablecer la salida estándar
        System.setOut(System.out);
    }

    @Test
    void testRealizarOperacionesDesdeArchivoConArchivoInexistente() {
        // Este caso debería fallar porque estamos intentando abrir un archivo inexistente
        String archivoInexistente = "archivo_inexistente.txt";
        String[] args = {archivoInexistente};

        assertThrows(RuntimeException.class, () -> Principal.main(args));
    }

    @Test
    void testRealizarOperacionesDesdeArchivoConArgumentosIncorrectos() {
        // Este caso debería fallar porque estamos pasando argumentos incorrectos
        String[] args = {"argumento_incorrecto"};

        assertThrows(RuntimeException.class, () -> Principal.main(args));
    }
}