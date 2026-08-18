public class Calculadora {

    // Método para sumar dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método para sumar tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Método para sumar dos números de punto flotante
    public double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Suma de enteros: " + calculadora.sumar(10, 64));
        System.out.println("Suma de tres enteros: " + calculadora.sumar(7, 30, 18));
        System.out.println("Suma de números de punto flotante: " + calculadora.sumar(5.7, 3.1));
    }
}