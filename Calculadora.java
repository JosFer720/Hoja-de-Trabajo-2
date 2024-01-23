public class Calculadora implements ICalculadora {
    
    public double sumar(int op1, int op2){
        double resultado= op1 + op2;
        return resultado;
    }

    public double restar(int op1, int op2){
        double resultado= op1 - op2;
        return resultado;
    }

    public double multiplicar(int op1, int op2){
        double resultado= op1 * op2;
        return resultado;
    }

    public double dividir(int op1, int op2){
        double resultado = 0;
        if (op2 != 0){
            resultado= op1 /  op2;
        }
        else{
            System.out.println("Error: No se puede dividir entre cero");
        }
        return resultado;
    }
}
