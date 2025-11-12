
import java.util.*;

public class Ejercicio2Excepciones {

    public static void main(String[] args) {
        int n = leerNumero();
        System.out.println("El factorial de "+n+" es: "+factorial(n));
    }

    
     
    static int leerNumero() {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        boolean ok = true;
        do {
            try {
                System.out.println("Escribe un numero entero: ");
                a = sc.nextInt();
                if (a < 0) {
                    throw new IllegalArgumentException("El número debe ser positivo");
                }
                ok = false;
            } catch (InputMismatchException e) {
                System.out.println("Tiene que ser un numero entro");
                sc.nextLine();
            } catch (IllegalArgumentException e){
                System.out.println("Tiene que ser un numero postitivo");
                sc.nextLine();
            }
        } while (ok == true);
        return (a);
    }

    static int factorial(int a) {
        Scanner sc = new Scanner(System.in);
        int resultado = 1;
        for (int i = 1; i <= a; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }
}
