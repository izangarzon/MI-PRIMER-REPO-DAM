
import java.util.Scanner;

public class Ejercicio1HojaTema3 {

    public static void main(String[] args) {
        int cero, numero, suma;

        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un numero entero: ");
        numero = sc.nextInt();
        while (0 <= numero) {
            cero = 1;
            suma = 0;
            while (cero <= numero) {
                if (cero % 2 == 0) {
                    suma = suma + cero;
                }
                cero = cero + 1;

            }
            System.out.println("La suma de los numeros pares desde uno hasta " + numero + " es: " + suma);

            System.out.println("Escribe otro numero entero: ");
            numero = sc.nextInt();
        }
    }

}
