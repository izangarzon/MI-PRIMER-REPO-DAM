
import java.util.Scanner;

public class Ejercicio7HojaTema2 {

    
    public static void main(String[] args) {
    int comidaDiaria, numAnimales, kilosPorAnimal;
    double comen;
    Scanner sc = new Scanner(System.in);
        System.out.println("introduzca el numero de kilos de comida diaria");
        comidaDiaria = sc.nextInt();
        System.out.println("introduzca el numero de animales");
        numAnimales = sc.nextInt();
        System.out.println("introduzca los kilos que come de media un animal  ");
        kilosPorAnimal = sc.nextInt();
        if (numAnimales == 0) {
            System.out.println("no tienes animales que alimentar");
        } else {
            if (comidaDiaria < (numAnimales * kilosPorAnimal)) {
                System.out.println("no hay comida suficiente para cada animal");
                comen = comidaDiaria / numAnimales;
                System.out.println("Cada animal va a tener "+comen+" kilos de comida");
            } else {
                System.out.println("hay comida para todos");
            }
        }

        
        
    }
    
}
