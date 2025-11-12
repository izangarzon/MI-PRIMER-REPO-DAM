
import java.util.Scanner;

public class Ejercicio17HojaTema4 {


    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero para sumar sus digitos: ");
        int a = sc.nextInt();
        System.out.println("La suma de sus digitos es: " + sumaDigitos(a));
    }
    
    
    static int sumaDigitos(int a){
        int suma=0;
        while(a%10!=0){
            suma = suma +(a%10);
            a=a/10;
            sumaDigitos(a);
        }
        return(suma);
    }
}
