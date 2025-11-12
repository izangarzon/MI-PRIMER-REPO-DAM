
import java.util.Scanner;

public class Ejercicio34 {

    public static void main(String[] args) {
        int etiqueta, etiquetaArbolMasAlto, altura, alturaArbolMasAlto;
        Scanner sc = new Scanner(System.in);
        etiqueta = 1;
        System.out.println("introduzca la eltura del arbol " + etiqueta);
        altura = sc.nextInt();
        alturaArbolMasAlto = 0;
        etiquetaArbolMasAlto = etiqueta;
        while (altura != -1) {
            if (altura > alturaArbolMasAlto) {
                alturaArbolMasAlto = altura;
                etiquetaArbolMasAlto = etiqueta;
            }
            etiqueta = etiqueta + 1;
            System.out.println("introduce la altura del siguiente arbol, si quieres parar escribe -1");
            altura = sc.nextInt();
        }
        if (alturaArbolMasAlto == 0) {
            System.out.println("No hay ningún arbol");
        } else {
            System.out.println("La altura del arbol mas alto es: " + alturaArbolMasAlto);
            System.out.println("La etiqueta del arbol mas alto es: " + etiquetaArbolMasAlto);
        }
    }

}
