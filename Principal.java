import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String archivo = "ejemplo.txt";
        Stack<Double> pila = new Stack<>();

        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Realizar operaciones desde archivo");
            System.out.println("2. Salir");
            System.out.print("Ingrese su opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarOperacionesDesdeArchivo(archivo, pila);
                    mostrarResultadoActual(pila);
                    break;
                case 2:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    private static void realizarOperacionesDesdeArchivo(String archivo, Stack<Double> pila) {
        try {
            ArrayList<ArrayList<String>> elementos = ManejadorArchivo.abrirArchivo(archivo);

            for (ArrayList<String> lineaElementos : elementos) {
                for (String elemento : lineaElementos) {
                    if (esNumero(elemento)) {
                        pila.push(Double.parseDouble(elemento));
                    } else if (esOperando(elemento)) {
                        double op2 = pila.pop();
                        double op1 = pila.pop();
                        double resultado = operar(op1, op2, elemento);
                        pila.push(resultado);
                    } else {
                        System.out.println("Elemento no reconocido: " + elemento);
                    }
                }
            }

            System.out.println("Operaciones realizadas desde el archivo.");

        } catch (IOException e) {
            System.out.println("Error al abrir el archivo" + e.getMessage());
        }
    }

    private static void mostrarResultadoActual(Stack<Double> pila) {
        if (!pila.isEmpty()) {
            System.out.println("Resultado actual en la pila: " + pila.peek());
        } else {
            System.out.println("La pila está vacía. Realice operaciones primero.");
        }
    }

    private static boolean esNumero(String elemento) {
        try {
            Double.parseDouble(elemento);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    private static boolean esOperando(String elemento) {
        return elemento.matches("[+\\-*/]");
    }
    
    private static double operar(double op1, double op2, String operando) {
        switch (operando) {
            case "+":
                return op1 + op2;
            case "-":
                return op1 - op2;
            case "*":
                return op1 * op2;
            case "/":
                if (op2 != 0) {
                    return op1 / op2;
                } else {
                    System.out.println("Error: División por cero");
                    return 0;
                }
            default:
                System.out.println("Operando no reconocido: " + operando);
                return 0;
        }
    }
}