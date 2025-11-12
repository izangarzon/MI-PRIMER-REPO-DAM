
public class Ejercicio25HojaTema3 {

    public static void main(String[] args) {
        int num, cont;
        cont = 7 + (int) (Math.random() * 3 + 1);
        System.out.println("PUNTO DE RUPTURA EN: " + cont+"\n");
        while (cont >= 0) {
            num = (int) (Math.random() * 10 + 1);
            if (cont <= num) {
                System.out.println("\nLA CUERDA SE HA ROTO CON ESTIRAMIENTO: "+cont);
                break;
            }
            for (int i = 0; i < num; i = i + 1) {
                System.out.print("* ");
            }
            System.out.println("   Estiramiento = "+num);
        }
        System.out.println("FIN DEL PROGRAMA");
    }
}
