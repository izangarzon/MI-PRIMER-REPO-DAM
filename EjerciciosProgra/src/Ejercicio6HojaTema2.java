
import java.util.Scanner;

public class Ejercicio6HojaTema2 {

    public static void main(String[] args) {
        int dni, paso;
        char letra;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca los 8 numeros para un DNI");
        dni = sc.nextInt();
        paso = dni % 23;
        letra = switch (paso) {
            case 0->'T';
            case 1->'R';
            case 2->'W';
            case 3->'A';
            case 4->'G';
            case 5->'M';
            case 6->'Y';
            case 7->'E';
            case 8->'P';
            case 9->'D';
            case 10->'X';
            case 11->'B';
            case 12->'N';
            case 13->'J';
            case 14->'Z';
            case 15->'S';
            case 16->'Q';
            case 17->'V';
            case 18->'H';
            case 19->'L';
            case 20->'C';
            case 21->'K';
            case 22->'E';
            default ->{
                yield 'A';
            }                                                  
        };
        System.out.println("El DNI es: "+dni+letra);
    }
}
