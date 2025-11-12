import java.util.Scanner;

public class Ejercicio8HojaTema4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la x del primer punto: ");
        double x1 = sc.nextDouble();
        System.out.print("Introduce la y del primer punto: ");
        double y1 = sc.nextDouble();
        System.out.print("Introduce la x del segundo punto: ");
        double x2 = sc.nextDouble();
        System.out.print("Introduce la y del segundo punto: ");
        double y2 = sc.nextDouble();       
       
        System.out.println("La distancia es: "+distancia(x1,y1,x2,y2));
    }
    
    static double distancia (double a, double b, double c, double d){
        double dist;
        dist = Math.sqrt(Math.pow(c-a,2)+Math.pow(d-b,2));
        return dist;
    }
    
}
