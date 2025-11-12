
import java.util.Scanner;

public class Ejercicio2HojaTema2 {


    public static void main(String[] args) {
       int anio, mes, dia;
        boolean fechaCorrecta;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un año");
        anio = sc.nextInt();
        System.out.println("introduzca un mes");
        mes = sc.nextInt();
        System.out.println("introduzca un dia");
        dia = sc.nextInt();
        if (anio == 0) {
            fechaCorrecta = false;
        } else {
            boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
            fechaCorrecta = switch (mes) {
                case 1, 3, 5, 7, 8, 10, 12 ->
                    (dia > 0 && dia < 32);
                case 4, 6, 9, 11 ->
                    (dia > 0 && dia < 31);
                case 2 -> {
                    int maxDias = bisiesto ? 29 : 28;
                    yield (dia > 0 && dia <= maxDias);
                }
                default -> {
                    yield false;
                }
            };
        }
        if (fechaCorrecta) {
            System.out.println("La fecha es: " + dia + " / " + mes + " / " + anio);
        } else {
            System.out.println("Fecha incorrecta");
        }

    }

}
