/**
 * Interfaz que define operaciones básicas de una calculadora.
 */
public interface ICalculadora {

    /**
     * Realiza la operación de suma entre dos operandos.
     * @param op1 El primer operando.
     * @param op2 El segundo operando.
     * @return El resultado de la suma.
     */
    double sumar(int op1, int op2);

    /**
     * Realiza la operación de resta entre dos operandos.
     * @param op1 El primer operando.
     * @param op2 El segundo operando.
     * @return El resultado de la resta.
     */
    double restar(int op1, int op2);

    /**
     * Realiza la operación de multiplicación entre dos operandos.
     * @param op1 El primer operando.
     * @param op2 El segundo operando.
     * @return El resultado de la multiplicación.
     */
    double multiplicar(int op1, int op2);

    /**
     * Realiza la operación de división entre dos operandos.
     * @param op1 El numerador.
     * @param op2 El denominador.
     * @return El resultado de la división.
     * @throws ArithmeticException Si se intenta dividir por cero.
     */
    double dividir(int op1, int op2) throws ArithmeticException;
}