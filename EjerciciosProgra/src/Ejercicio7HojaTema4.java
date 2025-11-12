
import java.util.*;

public class Ejercicio7HojaTema4 {

    public static void main(String[] args) {
        int opcion;
        int radio= leerRadio();       
        do {
            opcion = escribeMenu();
            switch (opcion) {
                case 1 ->
                    System.out.println("Longitud de la circunferencia: " + longitudCircunferencia(radio));
                case 2 ->
                    System.out.println("Área del círculo: " + areaCirculo(radio));
                case 3 ->
                    System.out.println("Área de la esfera: " + areaEsfera(radio));
                case 4 -> {
              
                    System.out.println("Área del cilindro: " + areaCilindro(radio, leerAltura()));
                }
                case 5 ->
                    System.out.println("Volumen de la esfera: " + volumenEsfera(radio));
                case 6 -> {
                    System.out.println("Volumen del cilindro: " + volumenCilindro(radio, leerAltura()));
                }
                case 7 -> {                   
                    leerRadio();
                }
                case 8 ->
                    System.out.println("FIN DEL PROGRAMA");
                default ->
                    System.out.println("OPCIÓN NO VÁLIDA");
            }

            System.out.println();
        } while (opcion != 8);
    }

    static int escribeMenu() {
        Scanner sc = new Scanner(System.in);
        boolean vale = false;
        int opcion = 0;
        while (vale == false) {
            try {
                System.out.println("\nCÁLCULOS DE LONGITUD, ÁREA Y VOLUMEN CIRCULARES");
                System.out.println("Menú de operaciones:");
                System.out.println("1. Longitud de la circunferencia");
                System.out.println("2. Área del círculo");
                System.out.println("3. Área de la esfera");
                System.out.println("4. Área del cilindro");
                System.out.println("5. Volumen de la esfera");
                System.out.println("6. Volumen del cilindro");
                System.out.println("7. Nuevo radio");
                System.out.println("8. Terminar");
                System.out.println("Elige una opción: ");
                opcion = sc.nextInt();
                vale = true;
            } catch (InputMismatchException e) {
                System.out.println("Tiene que ser un numero entro");
                sc.nextLine();
            }
        }

        return opcion;
    }

    static int leerRadio() {
        Scanner sc = new Scanner(System.in);
        int radio = 0;
        boolean okey = false;
        while (okey == false) {
            try {
                System.out.print("Introduce el valor del radio: ");
                radio = sc.nextInt();
                if (radio < 0) {
                    throw new IllegalArgumentException("");
                }
                okey = true;
            } catch (InputMismatchException e) {
                System.out.println("Tiene que ser un numero entro");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Tiene que ser un numero positivo");
                sc.nextLine();
            }
        }
        return radio;
    }

    static int leerAltura() {
        Scanner sc = new Scanner(System.in);
        int altura = 0;
        boolean vale = false;
        while (vale == false) {
            try {
                System.out.print("Introduce el valor de la altura: ");
                altura = sc.nextInt();
                if (altura < 0) {
                    throw new IllegalArgumentException("");
                }
                vale = true;
            } catch (InputMismatchException e) {
                System.out.println("Tiene que ser un numero entro");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Tiene que ser un numero positivo");
                sc.nextLine();
            }
        }
        return altura;
    }

    static double longitudCircunferencia(double r) {
        return 2 * Math.PI * r;
    }

    static double areaCirculo(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    static double areaEsfera(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    static double areaCilindro(double r, double h) {
        return 2 * Math.PI * r * (r + h);
    }

    static double volumenEsfera(double r) {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }

    static double volumenCilindro(double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }
}
