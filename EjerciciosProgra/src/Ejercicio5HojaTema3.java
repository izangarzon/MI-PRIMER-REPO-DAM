
import java.util.Scanner;

public class Ejercicio5HojaTema3 {

    public static void main(String[] args) {
        int contraseña, intento;
        contraseña = 456;
        System.out.println("Adivina una contraseña de 3 digitos");
        Scanner sc = new Scanner(System.in);
        intento = sc.nextInt();
        while (contraseña != intento) {
            System.out.println("contraseña incorrecta, vuelve a intentarlo: ");
            intento = sc.nextInt();

        }
        
        System.out.println("contraseña correcta");
    }

}
