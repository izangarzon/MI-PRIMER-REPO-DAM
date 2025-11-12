
import java.util.*;

public class Ejercicio1Excepciones {

    public static void main(String[] args) {
        System.out.println("La suma de los numeros es " + (leerNumero() + leerNumero()));
    }

    static int leerNumero() {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        boolean ok = true;
        do {
            try {
                System.out.println("Escribe un numero entero: ");
                a = sc.nextInt();
                ok = false;
            } catch (InputMismatchException e) {
                System.out.println("Tiene que ser un numero entro");
                sc.nextLine();
            }
        } while (ok == true);
        return (a);
    }

}
