public interface ICalculadora<T> {

int sumar();

int restar();

int multiplicar();

double dividir();

void push(T value);

void pop(T value);

}
