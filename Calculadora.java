/**
 * Clase que implementa la interfaz {@link ICalculadora} proporcionando operaciones aritméticas básicas.
 */
public class Calculadora implements ICalculadora {

    /**
     * Realiza la operación de suma entre dos operandos.
     * @param op1 El primer operando.
     * @param op2 El segundo operando.
     * @return El resultado de la suma.
     */
    @Override
    public double sumar(int op1, int op2) {
        return op1 + op2;
    }

    /**
     * Realiza la operación de resta entre dos operandos.
     * @param op1 El primer operando.
     * @param op2 El segundo operando.
     * @return El resultado de la resta.
     */
    @Override
    public double restar(int op1, int op2) {
        return op1 - op2;
    }

    /**
     * Realiza la operación de multiplicación entre dos operandos.
     * @param op1 El primer operando.
     * @param op2 El segundo operando.
     * @return El resultado de la multiplicación.
     */
    @Override
    public double multiplicar(int op1, int op2) {
        return op1 * op2;
    }

    /**
     * Realiza la operación de división entre dos operandos.
     * @param op1 El numerador.
     * @param op2 El denominador.
     * @return El resultado de la división.
     * @throws ArithmeticException Si se intenta dividir por cero.
     */
    @Override
    public double dividir(int op1, int op2) throws ArithmeticException {
        if (op2 != 0) {
            return (double) op1 / op2;
        } else {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
    }
}