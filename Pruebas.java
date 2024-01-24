// ```
// import org.junit.*;
// import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertFalse;
// import static org.junit.Assert.assertThrows;
// import static org.junit.Assert.assertTrue;

// public class Pruebas {

//     @Test
//     void testPushAndPop() {
//         Stack<Integer> stack = new Stack<>();
//         stack.push(1);
//         stack.push(2);
//         stack.push(3);

//         assertEquals(3, stack.pop());
//         assertEquals(2, stack.pop());
//         assertEquals(1, stack.pop());
//         assertTrue(stack.isEmpty());
//     }

//     @Test
//     void testPopFromEmptyStack() {
//         Stack<String> stack = new Stack<>();
//         // Este caso debería fallar porque estamos intentando hacer pop de una pila vacía
//         assertThrows(NullPointerException.class, stack::pop);
//     }

//     @Test
//     void testIsEmpty() {
//         Stack<Character> stack = new Stack<>();
//         assertTrue(stack.isEmpty());
//         stack.push('A');
//         assertFalse(stack.isEmpty());
//         stack.pop();
//         assertTrue(stack.isEmpty());
//     }

//     @Test
//     void testPushNull() {
//         Stack<Double> stack = new Stack<>();
//         // Este caso debería fallar porque estamos intentando hacer push con un valor nulo
//         assertThrows(NullPointerException.class, () -> stack.push(null));
//     }
//         @Test
//     void testSumar() {
//         ICalculadora calculadora = new Calculadora();
//         double resultado = calculadora.sumar(2, 3);
//         assertEquals(5, resultado, 0.0001);
//     }

//     @Test
//     void testRestar() {
//         ICalculadora calculadora = new Calculadora();
//         double resultado = calculadora.restar(5, 3);
//         assertEquals(2, resultado, 0.0001);
//     }

//     @Test
//     void testMultiplicar() {
//         ICalculadora calculadora = new Calculadora();
//         double resultado = calculadora.multiplicar(2, 4);
//         assertEquals(8, resultado, 0.0001);
//     }

//     @Test
//     void testDividirPorCero() {
//         ICalculadora calculadora = new Calculadora();
//         // Este caso debería fallar porque estamos dividiendo por cero
//         assertThrows(ArithmeticException.class, () -> {
//             double resultado = calculadora.dividir(8, 0);
//         });
//     }
// }
//  ```