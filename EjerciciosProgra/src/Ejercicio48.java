
public class Ejercicio48 {
    
    public static void main(String[] args) {
        // Programa para probar
        for (int operacion = 1; operacion <= 4; operacion++) {
            double resultado = calculadora(3.0, 4.0, operacion);
            System.out.println("Resultado: " + resultado);
        }
    }

    // Realiza la operación indicada:
    // 1 - suma
    // 2 - resta
    // 3 - multiplicación
    // 4 - división
    static double calculadora(double a, double b, int operacion) {
        double result;

        result = switch (operacion) {
            case 1 -> a + b;              // suma
            case 2 -> a - b;              // resta
            case 3 -> a * b;              // multiplicación
            case 4 -> {
                if (b != 0) yield a / b;  // división segura
                else {
                    System.out.println("Error: división por cero");
                    yield 0;
                }
            }
            default -> {
                System.out.println("Operación no válida");
                yield 0;
            }
        };

        return result;
    }
}