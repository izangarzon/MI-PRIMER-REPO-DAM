
import java.util.Scanner;

public class Ejercicio214 {

    public static void main(String[] args) {
        int anio, mes, dia;
        int diasdelmes = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿que dia es?");
        System.out.println("introduzca el dia");
        dia = sc.nextInt();
        System.out.println("introduzca el mes");
        mes = sc.nextInt();
        System.out.println("introduzca el año");
        anio = sc.nextInt();
        diasdelmes = switch (mes) {
            case 2 -> {
                yield 28;
            }
            case 4, 6, 9, 11 -> {
                yield 30;
            }
            case 1, 3, 5, 7, 8, 10, 12 -> {
                yield 31;
            }
            default -> {
                yield 50;
            }
        };
        if (diasdelmes == 50) {
            System.out.println("mes incorrecto");
        }
        dia++;
        if (dia > diasdelmes) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                anio++;
            }
        }
        if (anio == 0) {
            anio = 1;
        }
        System.out.println("la fecha de un dia mas adelante es: " + dia + ":" + mes + ":" + anio);
    }

}
