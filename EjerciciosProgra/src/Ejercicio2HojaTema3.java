
import java.util.Scanner;

public class Ejercicio2HojaTema3 {

    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un numero entero: ");
        numero = sc.nextInt();
        while (numero >= 0) {
            System.out.println(numero);
            if (numero == 0) {
                System.out.println("DESPEGUE");
            }
            numero = numero - 1;
        }

    }

}
