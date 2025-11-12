
import java.util.Scanner;

public class Ejercicio212 {

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
        if (anio < 0 || anio > 2025 ) {
            fechaCorrecta = false;
        } else {
            if (mes == 2 && dia > 0 && dia < 29) {
                fechaCorrecta = true;
            } else {
                if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 0 && dia < 31)) {
                    fechaCorrecta = true;
                } else {
                    if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 10 || mes == 12 || mes == 8) && (dia > 0 && dia < 32)) {
                        fechaCorrecta = true;
                    } else {
                        fechaCorrecta = false;
                    }

                }
            }
        }
        if (fechaCorrecta){
                        System.out.println("La fecha es: "+ dia +" / "+ mes +" / "+ anio);
                    }else {
                        System.out.println("Fecha incorrecta");
        }
    }
}
