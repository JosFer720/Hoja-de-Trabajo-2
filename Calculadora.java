public class Calculadora implements ICalculadora {
    
    public double sumar(int op1, int op2){
        int resultado= op1 + op2;
        return resultado;
    }

    public double restar(int op1, int op2){
        int resultado= op1 - op2;
        return resultado;
    }

    public double multiplicar(int op1, int op2){
        int resultado= op1 * op2;
        return resultado;
    }

    public double dividir(int op1, int op2){
        double resultado= op1 /  op2;
        return resultado;
    }
}
