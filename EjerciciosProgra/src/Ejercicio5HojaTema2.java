
import java.util.Scanner;

public class Ejercicio5HojaTema2 {


    public static void main(String[] args) {
    int aforo, numero;
    double precio, total;    
    Scanner sc = new Scanner(System.in);
        System.out.println("introduzca el aforo maximo");
        aforo = sc.nextInt();
        System.out.println("introduzca el precio de las entradas");
        precio = sc.nextInt();
        System.out.println("introduzca cuantas entradas se han vendido");
        numero = sc.nextInt();
        if (numero < (0.2 * aforo)) {
            System.out.println("se cancela el concierto");
        } else {
            if (numero < (0.5 * aforo)) {
                precio = precio * 0.75;
            }
        }
        if (numero > (0.2 * aforo)){
        total= precio*numero;
    
        System.out.println("El dinero recaudado es: "+total+" euros");
        }
    
    }
    
}
