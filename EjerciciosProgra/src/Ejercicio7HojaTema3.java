
import java.util.Scanner;

public class Ejercicio7HojaTema3 {

    public static void main(String[] args) {
        int contador, tirada, dado, suma, pares, impares;
        contador = 0;
        suma = 0;
        pares = 0;
        impares = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantas tiradas quieres que realice el dado?");
        dado = sc.nextInt();
        do {
            tirada = (int) (Math.random() * 100 + 1);
            contador = contador + 1;
            System.out.println("La tirada " + contador + " es: " + tirada);
            suma = suma + tirada;
            if (tirada % 2 == 0) {
                pares = pares + 1;
            } else {
                impares = impares + 1;
            }
            System.out.println("La suma hasta ahora es: "+suma);
        } while (contador < dado);
        System.out.println("Se han obtenido "+pares+" numeors pares");
        System.out.println("Se han obtenido "+impares+" numeros impares");
    }

}
