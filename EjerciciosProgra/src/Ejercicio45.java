
import java.util.Scanner;

public class Ejercicio45 {

    static boolean vocal(char c) {
        boolean resultado;
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            resultado = true;
        } else {
            resultado = false;
        }
        return (resultado);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una letra: ");
        System.out.println("La e es una vocal, "+ vocal('e'));
        System.out.println("La A es una vocal, "+ vocal('A'));
        System.out.println("La b es una vocal, "+ vocal('b'));
        System.out.println("La C es una vocal, "+ vocal('C'));
    }

}
